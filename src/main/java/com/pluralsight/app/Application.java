package com.pluralsight.app;

import com.pluralsight.service.CustomerService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {

  public static void main(String[] args) {
    ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
    /*ApplicationContext applicationContext =
    new ClassPathXmlApplicationContext("applicationContext.xml");*/
    CustomerService service = applicationContext.getBean("customerService", CustomerService.class);
    System.out.print(service.findAll().get(0).getFirstName());
  }
}
