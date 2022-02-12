package com.kyanja.server;

import com.kyanja.service.HelloWorld;
import com.kyanja.service.impl.HelloWorldImpl;
import org.apache.cxf.jaxws.JaxWsServerFactoryBean;

import javax.xml.ws.Endpoint;
import java.io.IOException;

public class AppRunServer {

    public static void main(String[] args) throws Exception {
        new HelloServer();
        System.out.println("Listening on port 5000 ...");
        Thread.sleep(5 * 60 * 1000);
        System.out.println("Server exiting ...");
        System.exit(0);
    }
}
