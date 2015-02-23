package com.home.dp.behavioral.chainofresponsibility;

public class R1000Dispenser implements DispenseChain {
    private DispenseChain dispenseChain;

    @Override
    public void setNextChain(DispenseChain dispenseChain) {
        this.dispenseChain = dispenseChain;
    }

    @Override
    public void dispense(Currency currency) {
        if (currency != null && currency.getAmount() >= Constants.THOUSAND) {
            int remainder = 0;
            if (currency.getAmount() % Constants.THOUSAND == 0 && AmountEnum.getTotalAmount() - 1000 >= currency.getAmount()) {
                currency.setAmount(currency.getAmount() - 1000);
                remainder = 1000;
            }
            int number = currency.getAmount() / Constants.THOUSAND;
            remainder += currency.getAmount() % Constants.THOUSAND;
            if (remainder != 0) {
                if (number >= AmountEnum.getCount("THOUSAND")) {
                    remainder += (1000 * (number - AmountEnum.getCount("THOUSAND")));
                    number = AmountEnum.getCount("THOUSAND");
                }
            }else{
                if (number >= AmountEnum.getCount("THOUSAND")) {
                    number = AmountEnum.getCount("THOUSAND");
                    remainder = (currency.getAmount() - (number * 1000));
                }
            }
            System.out.println("Printing " + number + " Notes of " + Constants.THOUSAND);
            if (remainder != 0) {
                currency.setAmount(remainder);
                this.dispenseChain.dispense(currency);
            }
        } else {
            this.dispenseChain.dispense(currency);
        }
    }
}
