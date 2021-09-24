package com.humandemo.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;

import com.humandemo.dependencies.DisabledHumanService;
import com.humandemo.interfaces.Human;
import com.humandemo.interfaces.HumanService;
import com.humandemo.objects.DisabledHuman;
import com.humandemo.objects.NormalHuman;

@Configuration
@PropertySource("classpath:human.properties")
public class HumanConfig {
	
	// create bean disabled human service
	@Bean
	public HumanService disabledHumanService() {
		return new DisabledHumanService();
	}
	
	// create bean and inject disabled human service in it
	@Bean
	@Scope("prototype")
	public Human disabledHuman() {
		DisabledHuman disabledHuman = new DisabledHuman();
		disabledHuman.setHumanService(disabledHumanService());
		
		return disabledHuman;
	}
	
	// create bean disabled human service
	@Bean
	public HumanService normalHumanService() {
		return new DisabledHumanService();
	}
		
	// create bean and inject disabled human service in it
	@Bean
	@Scope("prototype")
	public Human normalHuman() {			
		return new NormalHuman(normalHumanService());
	}
	
}
