package com.kyanja.client;

import com.kyanja.response.CarResponse;
import com.kyanja.service.CarWebService;
import com.kyanja.service.impl.CarWebServiceImpl;

public class CarrWebserviceClient {

    public static void main(String[] args) {

        CarWebServiceImpl service = new CarWebServiceImpl();
        CarWebService port = null;
        CarResponse audiPrice = port.getCarPrice("audi");
        System.out.println("audi price: " + audiPrice.getCarPrice() + "EUR; web service status: " + audiPrice.getStatus());

        CarResponse fordPrice = port.getCarPrice("ford");
        System.out.println("ford price: " + fordPrice.getCarPrice() + "EUR; web service status: " + fordPrice.getStatus());
    }
}
