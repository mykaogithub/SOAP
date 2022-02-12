package com.kyanja.server;

import com.kyanja.service.HelloWorld;
import com.kyanja.service.impl.HelloWorldImpl;
import org.apache.cxf.frontend.ServerFactoryBean;

public class HelloServer {

    protected HelloServer() throws Exception {
        ServerFactoryBean factory = new ServerFactoryBean();
        factory.setServiceClass(HelloWorld.class);
        factory.setAddress("http://localhost:5000/Hello");
        factory.setServiceBean(new HelloWorldImpl());
        factory.create();
    }
}