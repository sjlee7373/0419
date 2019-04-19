package zia.edu.boot.boot_test1.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
// 쓰지마라 @EnableWevMvc
public class WebConfig implements WebMvcConfigurer {

    public void addResourcehandlers(ResourceHandlerRegistry registry){
        registry.addResourceHandler("/m/**")
                .addResourceLocations("classpath:/m/")
                .setCachePeriod(20);
    }
}
