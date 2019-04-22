package zia.edu.boot.boot_test1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import zia.edu.boot.boot_test1.entity.Account;
import zia.edu.boot.boot_test1.service.MyService;

@Component
@RestController
public class MyRestController {

    @Autowired
    private MyService myService;

    @GetMapping("/hello")
    public String Hello(){
        return "hello " + myService.getName();
    }

    @GetMapping("/account")
    public Account account(){
        return myService.getAccount();

    }
    @GetMapping("/test")
    public String test(){
        return "test1 " + myService.getName();
    }

}
