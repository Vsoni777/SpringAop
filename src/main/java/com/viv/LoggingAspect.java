package com.viv;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {
	@Before("execution(* com.viv.PaymentServiceImpl.makepayment(..))")
    public void logBeforePayment() {
        System.out.println("Logging before making payment...");
    }

    @After("execution(* com.viv.PaymentServiceImpl.makepayment(..))")
    public void logAfterPayment() {
        System.out.println("Logging after making payment...");
    }

    @AfterReturning("execution(* com.viv.PaymentServiceImpl.makepayment(..))")
    public void logAfterReturningPayment() {
        System.out.println("Logging after successful payment...");
    }

    @AfterThrowing("execution(* com.viv.PaymentServiceImpl.makepayment(..))")
    public void logAfterThrowingPayment() {
        System.out.println("Logging after payment failed...");
    }
}
