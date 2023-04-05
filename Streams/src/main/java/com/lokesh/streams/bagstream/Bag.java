package com.lokesh.streams.bagstream;

import java.util.Arrays;
import java.util.List;

public class Bag implements ShippingProviderComponent {
    public static void main(String[] args) {
        ShippingProviderComponentImpl s = new ShippingProviderComponentImpl();
        BagCheckoutBO bagCheckoutBO = new BagCheckoutBO();

        ShippingMethodBO shippingMethodBO = new ShippingMethodBO();

        shippingMethodBO.setSurcharge(1.0);
        shippingMethodBO.setCode("LO12");

        ShipmentOptionBO shipmentOptionBO = new ShipmentOptionBO();



        List<ShipmentOptionBO> l1 = Arrays.asList(new ShipmentOptionBO(new ShippingMethodBO(1.0, "LO12"), 1.2, 32.0));

        List<ShipmentBO> l2 = Arrays.asList(new ShipmentBO(l1, 3.2));

        List<BagCheckoutBO> l3 = Arrays.asList(new BagCheckoutBO(l2, 124, "MCOM", "1.0.2", "302022"));

        System.out.println();

        bagCheckoutBO.setChannelType("MCOM");
        bagCheckoutBO.setRegionCode("302022");
        bagCheckoutBO.setVersion("1.0.2");
        bagCheckoutBO.setStoreLocationNumber(124);
        bagCheckoutBO.setShipments(l2);
        s.updateShippingPriceForSDDFreeShipItems(bagCheckoutBO);
    }
}
