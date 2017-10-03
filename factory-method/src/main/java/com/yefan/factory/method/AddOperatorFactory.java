package com.yefan.factory.method;

public class AddOperatorFactory implements OperatorFactory {

    public Operator manufactureOperator(OperatorType operatorType) {
        return new AddOperator(operatorType);
    }
}
