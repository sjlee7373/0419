package zia.edu.boot.boot_test1.runner;

import org.apache.commons.logging.LogFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;
import zia.edu.boot.boot_test1.ZiaProperties;

@Component
public class MyRunner implements ApplicationRunner {

//    @Value("${zia.name}")
//    String name;
//    @Value("${zia.fullname}")
//    String fullname;
//    @Value("${zia.number}")
//    String number;

    @Autowired
    ZiaProperties ziaProperties;

    @Autowired
    String hello;

    @Autowired
    String s;

    Logger log = LoggerFactory.getLogger(MyRunner.class);
    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println("FullName : "+ ziaProperties.getFullname());
        System.out.println("number : "+ ziaProperties.getNumber());

        System.out.println("현재의 Profile 설정된 Bean  : "+ hello);

        log.debug(ziaProperties.getName());
    }
}
