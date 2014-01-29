package com.myersbriggs.configuration;

import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;

/**
 * This is the configuration class used for creating beans
 */
@Configuration
public class PropertiesConfig {

    @Bean(name = "messageSource")
    public MessageSource messageSource() {
        ReloadableResourceBundleMessageSource messageSource = new ReloadableResourceBundleMessageSource();
        messageSource.setBasename("classpath:properties/messages");
        return messageSource;
    }

    @Bean(name = "persistenceSource")
    public MessageSource persistenceSource() {
        ReloadableResourceBundleMessageSource messageSource = new ReloadableResourceBundleMessageSource();
        messageSource.setBasename("classpath:properties/persistence");
        return messageSource;
    }
}
