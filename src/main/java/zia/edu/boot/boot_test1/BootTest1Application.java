package zia.edu.boot.boot_test1;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BootTest1Application {

    public static void main(String[] args) {

        SpringApplication application =
                new SpringApplication(BootTest1Application.class);
        //banner off
//        application.setBannerMode(Banner.Mode.OFF);

        application.run(args);
        //springapplication.run(boottest1application.class, args);

    }
}

