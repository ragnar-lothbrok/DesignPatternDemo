package com.home.dp.behavioral.chainofresponsibility;

public class R100Dispenser implements DispenseChain {

    private DispenseChain dispenseChain;

    @Override
    public void setNextChain(DispenseChain dispenseChain) {
        this.dispenseChain = dispenseChain;
    }

    @Override
    public void dispense(Currency currency) {
        if (currency != null && currency.getAmount() >= Constants.HUNDRED) {
            int number = currency.getAmount() / Constants.HUNDRED;
            int remainder = currency.getAmount() % Constants.HUNDRED;
            if(number > AmountEnum.getCount("HUNDRED")){
                remainder += (100* (number - AmountEnum.getCount("HUNDRED")));
                number = AmountEnum.getCount("HUNDRED");
            }
            System.out.println("Printing " + number + " Notes of " + Constants.HUNDRED);
            if (remainder != 0) {
                currency.setAmount(remainder);
                this.dispenseChain.dispense(currency);
            }
        } else {
            this.dispenseChain.dispense(currency);
        }
    }

}
