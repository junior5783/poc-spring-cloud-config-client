package com.rpicloud;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

/**
 * Created by mixmox on 04/04/16.
 */
@RefreshScope
@Component
@RestController
public class Greeter {

    @Value("${soa.server}")
    String soaServer;
    
    @Value("${mule.server}")
    String muleServer;
    
    @Value("${soa.context.product}")
    String contextProductSoa;
    
    @Value("${soa.context.loan-management}")
    String contextLoanManagementSoa;
    
    @Value("${mule.context.product}")
    String contextProductMule;
    
    @Value("${mule.context.loan-management}")
    String contextLoanManagementMule;
   

    @RequestMapping(value = "/properties", produces = "application/json")
    public List<String> index(){
        List<String> env = Arrays.asList(
                "SOA Server is: " + soaServer,
                "MULE Server is: " + muleServer,
                "Context Product SOA is: "+contextProductSoa,
                "Context Loan Management SOA is: "+contextLoanManagementSoa,
                "Context Product MULE is: "+contextProductMule,
                "Context Loan Management MULE is: "+contextLoanManagementMule
        );
        return env;
    }
}