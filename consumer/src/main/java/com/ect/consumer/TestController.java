package com.ect.consumer;

import com.ect.service.HelloService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("test")
public class TestController {

  @Reference private HelloService helloService;

  @GetMapping("hello")
  public String sayHelloWorld() {
    return helloService.sayHelloWorld();
  }
}
