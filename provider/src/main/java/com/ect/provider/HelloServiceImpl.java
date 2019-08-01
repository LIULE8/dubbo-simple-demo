package com.ect.provider;

import com.ect.service.HelloService;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.stereotype.Component;

/** @author LIULE9 */
@Component
@Service(interfaceClass = HelloService.class)
public class HelloServiceImpl implements HelloService {
  @Override
  public String sayHelloWorld() {
    return "hello world";
  }
}
