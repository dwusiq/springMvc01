package com.wusiq.entity;


import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.constraints.Size;

/**
 * 添加用户，页面请求的实体类
 */
public class ReqAddUserEntity {
    @NotEmpty(message = "姓名不能为空")
    private String userName;//用户名
    @Size(min = 2,max = 30,message = "用户地址长度应为{min}-{max}位")
    private String userFrom;//用户来自于

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserFrom() {
        return userFrom;
    }

    public void setUserFrom(String userFrom) {
        this.userFrom = userFrom;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("{");
        sb.append("\"userName\":\"")
                .append(userName).append('\"');
        sb.append(",\"userFrom\":\"")
                .append(userFrom).append('\"');
        sb.append('}');
        return sb.toString();
    }
}
