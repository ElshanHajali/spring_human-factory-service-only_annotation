package com.humandemo.objects;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import com.humandemo.interfaces.Human;
import com.humandemo.interfaces.HumanService;

public class DisabledHuman implements Human {

    private HumanService humanService;

    public void setHumanService(HumanService theHumanService){
        humanService = theHumanService;
    }

    // use @PostConnstruct give some info'es about starting
    @PostConstruct
    public void postConstructStartUp() {
    	System.out.println("Started working...");
    }
    
    // use @PreDestroy give some info about 
    @PreDestroy
    public void preDestroyClearUp() {
    	System.out.println("Stoped working");
    }
    
    @Override
    public String legs() {
        return humanService.legsService();
    }

    @Override
    public String arms() {
        return humanService.armsService();
    }

    @Override
    public String head() {
        return humanService.headService();
    }

    
}
