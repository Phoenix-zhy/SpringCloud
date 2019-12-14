package com.eurekaProvider.eurekaProvider.entity;

import java.io.Serializable;
import java.math.BigDecimal;

public class User implements Serializable {
    long id;
    String name;
    int age;
    String username;
    BigDecimal  balance;

    public User(String name,int age){
        this.name=name;
        this.age=age;
    }

    public User(){
    }

    public User(long id, String name, int age, String username, BigDecimal balance) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.username = username;
        this.balance = balance;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }
}
