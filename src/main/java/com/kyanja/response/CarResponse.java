package com.kyanja.response;

public class CarResponse {
    String carId;

    Integer CarPrice;

    String status;

    public String getCarId() {
        return carId;
    }

    public void setCarId(String carId) {
        this.carId = carId;
    }





    public CarResponse() {
    }

    public CarResponse(String carId) {
        this.carId = carId;
    }


    public Integer getCarPrice() {
        return CarPrice;
    }

    public void setCarPrice(Integer carPrice) {
        CarPrice = carPrice;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
