package com.humandemo.objects;

import org.springframework.beans.factory.annotation.Value;

import com.humandemo.interfaces.Human;
import com.humandemo.interfaces.HumanService;

public class NormalHuman implements Human {

    // create private field for Service
    private HumanService humanService;
    
    // fields for reading info'es from properties file
    @Value("${human.email}")
    private String email;
    
    @Value("${human.password}")
    private String password;
    
    // create constructor based DI
    public NormalHuman(HumanService theHumanService){
        humanService = theHumanService;
    }

    @Override
    public String legs() {
        return "password: "+password+"\n"+"email: "+email+"\n"+humanService.legsService();
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
