package com.springboot.demo.model;

public class Account {

    private Integer sno;
    private String account;
    private String name;
    private String password;
    private String accountType;
    private String telephone;

    public Account(Integer sno, String account, String name, String password, String accountType, String telephone) {
        this.sno = sno;
        this.account = account;
        this.name = name;
        this.password = password;
        this.accountType = accountType;
        this.telephone = telephone;
    }

    public Integer getSno() {
        return sno;
    }

    public void setSno(Integer sno) {
        this.sno = sno;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }
}
