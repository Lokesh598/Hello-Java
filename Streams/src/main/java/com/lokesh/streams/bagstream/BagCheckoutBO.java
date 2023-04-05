package com.lokesh.streams.bagstream;

import java.util.List;

public class BagCheckoutBO {
    private List<ShipmentBO> shipments;
    private long storeLocationNumber;
    private String channelType;
    private String version;
    private String regionCode;

    public BagCheckoutBO() {

    }

    public BagCheckoutBO(List<ShipmentBO> shipments, long storeLocationNumber, String channelType, String version, String regionCode) {
        this.shipments = shipments;
        this.storeLocationNumber = storeLocationNumber;
        this.channelType = channelType;
        this.version = version;
        this.regionCode = regionCode;
    }

    public List<ShipmentBO> getShipments() {
        return shipments;
    }

    public void setShipments(List<ShipmentBO> shipments) {
        this.shipments = shipments;
    }

    public long getStoreLocationNumber() {
        return storeLocationNumber;
    }

    public void setStoreLocationNumber(long storeLocationNumber) {
        this.storeLocationNumber = storeLocationNumber;
    }

    public String getChannelType() {
        return channelType;
    }

    public void setChannelType(String channelType) {
        this.channelType = channelType;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getRegionCode() {
        return regionCode;
    }

    public void setRegionCode(String regionCode) {
        this.regionCode = regionCode;
    }

    @Override
    public String toString() {
        return "BagCheckoutBO{" +
                "shipments=" + shipments +
                ", storeLocationNumber=" + storeLocationNumber +
                ", channelType='" + channelType + '\'' +
                ", version='" + version + '\'' +
                ", regionCode='" + regionCode + '\'' +
                '}';
    }
}
