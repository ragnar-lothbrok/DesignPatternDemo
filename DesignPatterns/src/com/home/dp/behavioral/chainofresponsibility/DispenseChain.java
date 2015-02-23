package com.home.dp.behavioral.chainofresponsibility;

public interface DispenseChain {

    void setNextChain(DispenseChain dispenseChain);

    void dispense(Currency currency);

}
