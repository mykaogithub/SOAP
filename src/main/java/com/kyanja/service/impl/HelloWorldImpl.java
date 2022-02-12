package com.kyanja.service.impl;

import com.kyanja.service.HelloWorld;

import javax.jws.WebParam;
import javax.jws.WebService;

@WebService(endpointInterface = "com.kyanja.service.HelloWorld", serviceName="HelloWorld")
public class HelloWorldImpl implements HelloWorld {

    public String reply(@WebParam(name = "text") String text) {
        return "Hello " + text;
    }
}
