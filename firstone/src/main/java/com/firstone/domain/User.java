package com.firstone.domain;

public class User {

    private int id;
    private String name;
    private String passwd;
    private String phone;

    public User(int id, String name, String passwd, String phone) {
        this.id = id;
        this.name = name;
        this.passwd = passwd;
        this.phone = phone;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
