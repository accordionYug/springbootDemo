package com.springboot.demo.model;


import javax.persistence.*;
import java.io.Serializable;


@Entity
public class User implements Serializable {

    private static final long serialVersionUID = 1L;


    @Id
    @SequenceGenerator(name = "SEQ_GEN",sequenceName = "SEQ_USER",allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "SEQ_GEN")
    private Long id;
    private String name;
    private long money;

    public User(){

    }

    public User(String name, long money) {
        this.name = name;
        this.money = money;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getMoney() {
        return money;
    }

    public void setMoney(long money) {
        this.money = money;
    }

    @Override
    public String toString() {
        return String.format("User{id=%d,name='%s',money=%d}",id,name,money);
    }
}
