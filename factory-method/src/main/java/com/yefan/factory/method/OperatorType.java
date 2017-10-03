package com.yefan.factory.method;

public enum OperatorType {

    ADD("+"), SUB("-"), DIV("/"), MUL("*");

    private String operator;

    OperatorType(String operator) {
        this.operator = operator;
    }

    @Override
    public String toString() {
        return "OperatorType{" +
                "operator='" + operator + '\'' +
                '}';
    }
}
