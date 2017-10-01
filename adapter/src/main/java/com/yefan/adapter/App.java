package com.yefan.adapter;

public class App {

    public static void main(String[] args) {
        ChargeWithTypeC charge = new ChargeWithTypeC(new UsbChargeAdapter());
        charge.chargeWithTypeC();
    }

}
