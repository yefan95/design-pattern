package com.yefan.adapter;

public class ChargeWithTypeC implements TypeCCharge {

    private TypeCCharge typeCCharge;


    public ChargeWithTypeC(TypeCCharge typeCCharge) {
        this.typeCCharge = typeCCharge;
    }

    public void setTypeCCharge(TypeCCharge typeCCharge) {
        this.typeCCharge = typeCCharge;
    }

    public void chargeWithTypeC() {
        typeCCharge.chargeWithTypeC();
    }

}
