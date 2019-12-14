package com.feign.customerfeign.controller;

import com.alibaba.fastjson.JSONObject;
import com.feign.customerfeign.demo.User;
import com.feign.customerfeign.service.FeignConfigurationClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@RequestMapping("/ss")
public class FeignUserController {

//    @Autowired
//    FeignClientService feignClientService;

    @Autowired
    FeignConfigurationClientService configurationClientService;

//    @RequestMapping("/consumer")
//    public String helloConsumer(){
//        return feignClientService.hello();
//    }
//
//    @RequestMapping("/consumer2")
//    public String helloConsumer2(){
//        String r1 = feignClientService.hellol("hjc");
//        String r2 = feignClientService.hello2("hjc", 23).toString();
//        String r3 = feignClientService.hello3(new User("hjc", 23));
//        return r1 + "-----" + r2 + "----" + r3;
////        return  r1;
//    }

    @RequestMapping("/consumer2")
    public String helloConsumer2(){
        String s1=configurationClientService.hellol("hh1");
//        String r2 = configurationClientService.hello2("hjc", 23).toString();
        String r3 = configurationClientService.hello3(new User("hjc", 23));
        return  s1;
}

    @RequestMapping("/consumer3")
    public String helloConsumer3(){
       User user= new User("hjc", 23);
       String s=JSONObject.toJSONString(user);
        JSONObject ss=JSONObject.parseObject(s);
        String r3 = configurationClientService.hello4(ss);
        return  r3;
    }
}
