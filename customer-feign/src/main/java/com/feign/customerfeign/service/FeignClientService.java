//package com.feign.customerfeign.service;
//
//
//import com.feign.customerfeign.demo.User;
//import org.springframework.cloud.openfeign.FeignClient;
//import org.springframework.web.bind.annotation.*;
//
//@FeignClient("eurekaProvider")
//public interface FeignClientService {
//    @RequestMapping(value = "/hello",method = RequestMethod.GET)
//    String hello();
//
//    @RequestMapping(value="/hellol",method = RequestMethod.POST)
//    String hellol(@RequestParam String name);
//
//
//    @RequestMapping(value="/hello2",method = RequestMethod.POST)
//    User hello2(@RequestParam String name,@RequestParam int age);
//
//    @RequestMapping(value="/hello3",method = RequestMethod.POST)
//    String  hello3(@RequestBody User user);
//}
