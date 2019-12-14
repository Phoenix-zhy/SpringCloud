package com.feign.customerfeign.demo;

import java.io.Serializable;

public class User implements Serializable {
    String id;
    String name;
    int age;
    String username;
    double balance;

    public User(String name,int age){
        this.name=name;
        this.age=age;
    }

    public User(){
    }

//    public User(long id, String name, int age, String username, BigDecimal balance) {
//        this.id = id;
//        this.name = name;
//        this.age = age;
//        this.username = username;
//        this.balance = balance;
//    }
    public String getId() {
        return id;
    }

    public void setId(String id) {
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

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", username='" + username + '\'' +
                ", balance=" + balance +
                '}';
    }
}
