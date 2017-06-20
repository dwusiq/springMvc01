package com.wusiq.entity;

/**
 * 添加用户，页面请求的实体类
 */
public class ReqAddUserEntity {
    private String userName;//用户名
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
