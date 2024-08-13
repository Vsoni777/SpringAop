package com.viv;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Mainapp {
	public static void main(String[] args) {
	  AnnotationConfigApplicationContext context =
	            new AnnotationConfigApplicationContext(Appconfig.class);

      PaymentService paymentService = context.getBean(PaymentService.class);
      try {
          paymentService.makepayment();
      } catch (Exception e) {
          // Handle exception
          System.out.println(e.getMessage());
      }

      context.close();

	       
	    }
}
