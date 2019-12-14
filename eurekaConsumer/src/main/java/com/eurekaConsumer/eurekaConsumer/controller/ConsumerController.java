package com.eurekaConsumer.eurekaConsumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ConsumerController {
    @Autowired
    RestTemplate restTemplate;

    @Autowired
    LoadBalancerClient loadBalancerClient;

    @RequestMapping("/hello-Consumer")
    public String helloConsumer(){
//        String s=restTemplate.getForObject("http://eurekaProvider/hello",String.class);
//        return  s;

        ServiceInstance serviceInstance=this.loadBalancerClient.choose("eurekaProvider");
        System.out.println( serviceInstance.getHost()+":"+serviceInstance.getPort());
        return "1";
    }

}
