package com.yefan.factory.method;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class App {

    private static final Logger logger = LoggerFactory.getLogger(App.class);

    public static void main(String[] args) {
        OperatorFactory factory = new AddOperatorFactory();
        Operator operator = factory.manufactureOperator(OperatorType.DIV);
        logger.info(operator.toString());
    }

}
