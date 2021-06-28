package com.patuli.exampleFreeMarker.config.freeMarker;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.ui.freemarker.FreeMarkerConfigurationFactoryBean;


@Configuration
public class FreeMarkerConfig {

    @Primary
    @Bean
    public FreeMarkerConfigurationFactoryBean factoryBean() {

        FreeMarkerConfigurationFactoryBean freeCongigFactory = new FreeMarkerConfigurationFactoryBean();
        freeCongigFactory.setTemplateLoaderPath("classpath:/templates");
        return freeCongigFactory;

    }

}
