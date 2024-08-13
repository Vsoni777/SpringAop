package com.viv;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configurable
@Configuration
@EnableAspectJAutoProxy
@ComponentScan(basePackages = "com.viv")
public class Appconfig {
	@Bean
    public PaymentService paymentService() {
        return new PaymentServiceImpl();
    }

    @Bean
    public LoggingAspect loggingAspect() {
        return new LoggingAspect();
    }
}
