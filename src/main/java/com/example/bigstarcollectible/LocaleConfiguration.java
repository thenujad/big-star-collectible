package com.example.bigstarcollectible;

import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;

@Configuration
public class LocaleConfiguration {

    @Bean
    public MessageSource messageSource() {
        ReloadableResourceBundleMessageSource resourceBundle =new ReloadableResourceBundleMessageSource();
        resourceBundle.setBasename("classpath:message");
        resourceBundle.setDefaultEncoding("UTF-8");

        return resourceBundle;
    }

}
