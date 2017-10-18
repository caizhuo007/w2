package com.firstone.domain;

public class User {

    private String name;
    private String passwd;
    private String phone;

    public User(String name, String passwd, String phone) {
        this.name = name;
        this.passwd = passwd;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPasswd() {
        return passwd;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
