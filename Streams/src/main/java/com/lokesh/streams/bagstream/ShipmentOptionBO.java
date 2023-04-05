package com.lokesh.streams.bagstream;

public class ShipmentOptionBO {
    private ShippingMethodBO shipmentMethod;
    private Double upChargeFee;

    private Double price;

    public ShipmentOptionBO(ShippingMethodBO shipmentMethod, Double upChargeFee, Double price) {
        this.shipmentMethod = shipmentMethod;
        this.upChargeFee = upChargeFee;
        this.price = price;
    }

    public ShipmentOptionBO() {

    }

    public ShipmentOptionBO(ShippingMethodBO lo12) {
    }

    public ShippingMethodBO getShipmentMethod() {
        return shipmentMethod;
    }

    public void setShipmentMethod(ShippingMethodBO shipmentMethod) {
        this.shipmentMethod = shipmentMethod;
    }

    public Double getUpChargeFee() {
        return upChargeFee;
    }

    public void setUpChargeFee(Double upChargeFee) {
        this.upChargeFee = upChargeFee;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "ShipmentOptionBO{" +
                "shipmentMethod=" + shipmentMethod +
                ", upChargeFee=" + upChargeFee +
                ", price=" + price +
                '}';
    }
}
