package com.kyanja.service;


import com.kyanja.response.CarResponse;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public  interface CarWebService {

    @WebMethod
    public CarResponse getCarPrice(String carId);
}
