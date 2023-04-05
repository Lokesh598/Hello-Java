package com.lokesh.streams.bagstream;

import java.util.List;

public class ShipmentBO {
    private List<ShipmentOptionBO> availableShippingOptions;

    private Double addressFee;

    public ShipmentBO(List<ShipmentOptionBO> availableShippingOptions, Double addressFee) {
        this.availableShippingOptions = availableShippingOptions;
        this.addressFee = addressFee;
    }

    public List<ShipmentOptionBO> getAvailableShippingOptions() {
        return availableShippingOptions;
    }

    public void setAvailableShippingOptions(List<ShipmentOptionBO> availableShippingOptions) {
        this.availableShippingOptions = availableShippingOptions;
    }

    public ShipmentBO() {
        this.availableShippingOptions = availableShippingOptions;
    }

    public Double getAddressFee() {
        return addressFee;
    }

    public void setAddressFee(Double addressFee) {
        this.addressFee = addressFee;
    }

    @Override
    public String toString() {
        return "ShipmentBO{" +
                "availableShippingOptions=" + availableShippingOptions +
                ", addressFee=" + addressFee +
                '}';
    }
}
