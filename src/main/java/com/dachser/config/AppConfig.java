package com.dachser.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@EnableWebMvc
@ComponentScan("com.dachser") // tell spring where you can go to find all out Rest Controllers and special Components to create Beans.
public class AppConfig {

}
