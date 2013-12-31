package com.myersbriggs.configuration;

import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;

/**
 * Created with IntelliJ IDEA.
 * User: stantonbohmbach
 * Date: 12/31/13
 * Time: 12:13 PM
 * To change this template use File | Settings | File Templates.
 */
@Configuration
public class AppConfiguration {

    @Bean
    public MessageSource messageSource() {
        ReloadableResourceBundleMessageSource messageSource = new ReloadableResourceBundleMessageSource();
        messageSource.setBasename("/WEB-INF/messages/messages");
        return messageSource;
    }
}
