package com.lokesh.streams.bagstream;

import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;

import java.util.ArrayList;
import java.util.List;

//import static org.junit.jupiter.api.Assertions.*;
class ShippingProviderComponentImplTest {
    @InjectMocks
    ShippingProviderComponentImpl systemUnderTest;
    @BeforeEach
    void setUp() {
        MockitoAnnotations.initMocks(this);
    }
    @Test
public void updateShippingPriceForSDDFreeShipItemsTest() {
    BagCheckoutBO orderBO = new BagCheckoutBO();
    orderBO.setStoreLocationNumber(123l);

    List<ShipmentBO> shipmentBOList = new ArrayList<>();
    ShipmentBO shipmentBO = new ShipmentBO();
    shipmentBOList.add(shipmentBO);
    orderBO.setShipments(shipmentBOList);
    List<ShipmentOptionBO> availableShippingOptions = new ArrayList<>();
    ShipmentOptionBO shipmentOptionBO = new ShipmentOptionBO();
    shipmentOptionBO.setPrice(34.56);
    shipmentOptionBO.setUpChargeFee(23.56);
    ShippingMethodBO shipmentMethod = new ShippingMethodBO();
    shipmentMethod.setCode("S");
    shipmentOptionBO.setShipmentMethod(shipmentMethod);
    availableShippingOptions.add(shipmentOptionBO);
    shipmentBO.setAvailableShippingOptions(availableShippingOptions);
//    systemUnderTest.updateShippingPriceForSDDFreeShipItems(orderBO);
}
}