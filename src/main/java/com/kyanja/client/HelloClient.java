package com.kyanja.client;

import com.kyanja.service.HelloWorld;
import org.apache.cxf.frontend.ClientProxyFactoryBean;
import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;

public class HelloClient {

    public static void main(String[] args) {
        ClientProxyFactoryBean factory = new ClientProxyFactoryBean();
        factory.setAddress("http://localhost:5000/Hello");
        HelloWorld helloServer = factory.create(HelloWorld.class);
        System.out.println("invoke webservice...");
        System.out.println("message context is: " + helloServer.reply(("Abderrahim")));
        System.exit(0);
    }
}
