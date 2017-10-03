package com.yefan.factory.method;

public class AddOperator implements Operator{

    private OperatorType operatorType;

    public AddOperator(OperatorType operatorType){
        this.operatorType = operatorType;
    }


    public OperatorType getOperatorType() {
        return operatorType;
    }

    @Override
    public String toString() {
        return "AddOperator{" +
                "operatorType=" + operatorType +
                '}';
    }
}
