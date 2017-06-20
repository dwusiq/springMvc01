package com.wusiq.controller;

import com.wusiq.entity.ReqAddUserEntity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Errors;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.validation.Valid;

/**
 * 控制器
 */
@Controller
@RequestMapping("loginController")
public class LoginController {
    private Logger LOGGER = LoggerFactory.getLogger(LoginController.class);

    /***
     * 查询参数
     * 处理请求的模式：“/loginController/welcome.do?userId=12345”
     */
    @RequestMapping(value = "/welcome.do",method = RequestMethod.GET)
    public String doWelcome(@RequestParam("userId") int userId){
        LOGGER.info("userName:{}",userId);
        return "welcomePage";
    }

    /***
     * 路径变量
     * 处理请求的模式：“/loginController/userId=12345”
     * 扩展模式有："/receiveUserId/{userId}","/{userId}","/receiveUserId/{userId}/{userName}","/{userId}/{userName}"
     * 另外：当参数名相同时，可以省略掉@PathVariable的value
     */
    @RequestMapping(value = "/receiveUserId/{userId}",method = RequestMethod.GET)
    public String receiveUserId(@PathVariable("userId") int user_Id){
        LOGGER.info("user_Id:{}",user_Id);
        return "welcomePage";
    }

    /***
     *接收表单请求
     */
    @RequestMapping(value = "/addUser.do",method = RequestMethod.POST)
    public String addUser(@Validated ReqAddUserEntity req, BindingResult result){
        LOGGER.info("ReqAddUserEntity:{}",req);

        if(result.hasErrors()){
            LOGGER.warn("参数错误：{}",result.getAllErrors());
            return "redirect:/loginController/toErrorPage.do";
        }
        return "welcomePage";
    }

    /***
     *跳转错误页
     */
    @RequestMapping(value = "/toErrorPage.do",method = RequestMethod.GET)
    public String toErrorPage(){
        LOGGER.info("失败了!");
        return "errorPage";
    }
}
