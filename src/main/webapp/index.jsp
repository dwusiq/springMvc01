<%--
  Created by IntelliJ IDEA.
  User: wicker
  Date: 2017/6/19
  Time: 16:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>各种不同的请求模式</title>
  </head>
  <body>
     下面几种不同的请求：
     <div>
         <ul>1、</ul>
         <ul>
             <a href="http://localhost:8080/springMvc01/loginController/welcome.do?userId=12345">
                 http://localhost:8080/springMvc01/loginController/welcome.do?userId=12345</a>
         </ul>
     </div>
     <div>
         <ul>2、</ul>
         <ul>
             <a href="http://localhost:8080/springMvc01/loginController/receiveUserId/12345">
                 http://localhost:8080/springMvc01/loginController/receiveUserId/12345</a>
         </ul>
     </div>

     <div>
         <ul>3、</ul>
         <ul>
             <form action="/springMvc01/loginController/addUser.do" method="post">
                 <table>
                     <tr>
                         <td>用户名：</td>
                         <td><input type="text" name="userName"/></td>
                     </tr>
                     <tr>
                         <td>来自于：</td>
                         <td><input type="text" name="userFrom"/></td>
                     </tr>
                 </table>
                 <input type="submit" value="提交"/>
             </form>
         </ul>
     </div>
  </body>
</html>
