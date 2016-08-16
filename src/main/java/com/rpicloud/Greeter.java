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

    @Value("${soa.sever}")
    String greeting;
    
    @Value("${soa.context.product}")
    String contextProduct;
    
    @Value("${soa.context.product}")
    String contextFull;

    @Value("${soa.port}")
    String port;

    @RequestMapping(value = "/", produces = "application/json")
    public List<String> index(){
        List<String> env = Arrays.asList(
                "message.greeting is: " + greeting,
                "server.port is: " + port,
                "Context product is:"+contextProduct
        );
        return env;
    }
}