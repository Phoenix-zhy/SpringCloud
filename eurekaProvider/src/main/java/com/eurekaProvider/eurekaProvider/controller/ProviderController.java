package com.eurekaProvider.eurekaProvider.controller;

import com.alibaba.fastjson.JSONObject;
import com.eurekaProvider.eurekaProvider.entity.User;
import com.eurekaProvider.eurekaProvider.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProviderController {

    @Autowired
    UserMapper userMapper;

    @RequestMapping(value = "/hello", method= RequestMethod.GET)
    public String hello(){
        System.out.println( 111111);
        List<User> list=userMapper.getAll();
        return String.valueOf(list.size());
    }

    //新增的方法
    @RequestMapping(value = "/hellol",method = RequestMethod.POST)
    public String hello(@RequestBody String name) {
        return "Hello " + name;
    }

    @RequestMapping(value = "/hello2",method = RequestMethod.POST)
    public User hello(@RequestBody String name,   int age) {
        return new User(name, age);
    }

    @RequestMapping(value = "/hello3",method = RequestMethod.POST)
    public String hello (@RequestBody User user) {
        System.out.println(1111);
        return "Hello "+ user. getName () + ", " + user. getAge ();
    }

    @RequestMapping(value = "/hello4",method = RequestMethod.POST)
    public String hello (@RequestBody JSONObject param) {
        System.out.println(1111);
        String name=param.getString("name");
        Integer age=param.getInteger("age");
        return "Hello "+ name + ", " + age;
    }
}
