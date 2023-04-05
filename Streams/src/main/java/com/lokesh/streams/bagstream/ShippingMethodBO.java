package com.lokesh.streams.bagstream;

public class ShippingMethodBO {
    private double surcharge = 0.0;
    private String code = "";

    public ShippingMethodBO() {

    }

    public ShippingMethodBO(double surcharge, String code) {
        this.surcharge = surcharge;
        this.code = code;
    }

    public double getSurcharge() {
        return surcharge;
    }

    public void setSurcharge(double surcharge) {
        this.surcharge = surcharge;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
