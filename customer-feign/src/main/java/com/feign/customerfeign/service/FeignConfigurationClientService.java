package com.feign.customerfeign.service;


import com.alibaba.fastjson.JSONObject;
import com.feign.customerfeign.config.Configuration1;
import com.feign.customerfeign.demo.User;
import feign.RequestLine;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(value = "eurekaProvider",configuration = Configuration1.class)
public interface FeignConfigurationClientService {
//    @RequestMapping(value = "/hello",method = RequestMethod.GET)
//    String hello();

//    @RequestMapping(value="/hellol",method = RequestMethod.POST)
        @RequestLine("POST /hellol")
    String hellol(@RequestBody String name);


//    @RequestLine("POST /hello2")
//    User hello2(@RequestBody String name,  int age);
//
    @RequestLine("POST /hello3")
    String  hello3(@RequestBody User user);

    @RequestLine("POST /hello4")
    String hello4(@RequestBody JSONObject param);
}
