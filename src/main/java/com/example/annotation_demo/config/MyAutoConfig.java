package com.example.autoconfig;

import org.aspectj.lang.annotation.Before;
import org.springframework.boot.autoconfigure.AutoConfigureBefore;
import org.springframework.boot.autoconfigure.web.servlet.WebMvcAutoConfiguration;
import org.springframework.boot.web.servlet.filter.OrderedFormContentFilter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@AutoConfigureBefore(WebMvcAutoConfiguration.class)
public class MyAutoConfig {
    @Bean
    public String aaa(OrderedFormContentFilter orderedFormContentFilter){
        System.out.println(orderedFormContentFilter);
        return "ddd";
    }
}
