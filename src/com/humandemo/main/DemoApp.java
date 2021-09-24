package com.humandemo.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.humandemo.configuration.HumanConfig;
import com.humandemo.interfaces.Human;

public class DemoApp {
	
	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(HumanConfig.class);
		
		Human theDisabledHuman = context.getBean("disabledHuman", Human.class);
		Human theNormalHuman = context.getBean("normalHuman", Human.class);

		System.out.println(theDisabledHuman.arms());
		System.out.println(theDisabledHuman.legs());
		System.out.println(theDisabledHuman.head());		
		
		System.out.println("\n"+theNormalHuman.arms());
		System.out.println(theNormalHuman.legs());
		System.out.println(theNormalHuman.head());
		
		context.close();
		
	}

}
