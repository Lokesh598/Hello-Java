package com.lokesh.streams.bagstream;

import java.util.Arrays;
import java.util.List;

public class Data {
    private static final List<ShipmentOptionBO> SHIPMENT_OPTION_BOS = Arrays.asList(
      new ShipmentOptionBO(new ShippingMethodBO(0.0, "LO12"))
    );
    private static final List<ShipmentBO> SHIPMENT_BOS = Arrays.asList(
      new ShipmentBO(SHIPMENT_OPTION_BOS, 2.34)
    );

    private static final List<BagCheckoutBO> BAG_CHECKOUT_BOS = Arrays.asList(
        new BagCheckoutBO(SHIPMENT_BOS, 11, "Hindi", "2.0.1", "302029")
    );
}
