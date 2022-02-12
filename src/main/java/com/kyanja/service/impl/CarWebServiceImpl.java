package com.kyanja.service.impl;

import com.kyanja.response.CarResponse;
import com.kyanja.service.CarWebService;

import javax.jws.WebService;
import java.util.HashMap;
import java.util.Map;


@WebService(endpointInterface = "com.kyanja.service.CarWebService")
public class CarWebServiceImpl   implements CarWebService {

    private final Map<String, Integer> prices = new HashMap<String, Integer>();

    public CarWebServiceImpl() {
        prices.put("audi", Integer.valueOf(10000));
        prices.put("bmw", Integer.valueOf(15000));
        prices.put("fiat", Integer.valueOf(5000));
    }

    @Override
    public CarResponse getCarPrice(String carId) {

        Integer price = prices.get(carId);
        CarResponse response = new CarResponse();


        if(price == null) {
            response.setCarPrice(-1);
            response.setStatus("error: no car with id: " + carId);
        } else {
            response.setCarPrice(price.intValue());
            response.setStatus("ok");
        }

        return response;
    }
}

