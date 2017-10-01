package com.yefan.adapter;

public class UsbChargeAdapter implements TypeCCharge {

    private UsbCharge usbCharge;

    public UsbChargeAdapter() {
        usbCharge = new UsbCharge();
    }

    public void chargeWithTypeC() {
        usbCharge.chargeWithUsb();
    }
}
