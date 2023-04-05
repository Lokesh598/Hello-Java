package com.lokesh.streams.bagstream;

public class ShippingProviderComponentImpl implements ShippingProviderComponent{
    String SDD_SHIPPING_METHOD = "S";
    public void updateShippingPriceForSDDFreeShipItems(BagCheckoutBO orderBO) {


        orderBO.getShipments().stream()
                .filter(shipmentBO -> shipmentBO.getAvailableShippingOptions() != null)
                .flatMap(shipmentBO -> shipmentBO.getAvailableShippingOptions().stream())
                .filter(shipmentOptionBO -> shipmentOptionBO.getShipmentMethod() != null && SDD_SHIPPING_METHOD
                        .equalsIgnoreCase(shipmentOptionBO.getShipmentMethod().getCode()))
                .forEach(shipmentOptionBO -> {
                    shipmentOptionBO.setUpChargeFee(0.0);
                    shipmentOptionBO.getShipmentMethod().setSurcharge(0.0);
                    shipmentOptionBO.setPrice(0.0);
                });


//        for (ShipmentBO shipmentBO : orderBO.getShipments()) {
//            if (shipmentBO.getAvailableShippingOptions() != null) {
//                for (ShipmentOptionBO shipmentOptionBO : shipmentBO.getAvailableShippingOptions()) {
//                    if (shipmentOptionBO.getShipmentMethod() != null && SDD_SHIPPING_METHOD
//                            .equalsIgnoreCase(shipmentOptionBO.getShipmentMethod().getCode())) {
//                        shipmentOptionBO.setUpChargeFee(0.0);
//                        shipmentOptionBO.getShipmentMethod().setSurcharge(0.0);
//                        shipmentOptionBO.setPrice(0.0);
//                    }
//                }
//            }
//        }
    }
}
