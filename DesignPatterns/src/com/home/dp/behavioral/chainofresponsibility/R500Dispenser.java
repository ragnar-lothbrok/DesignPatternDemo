package com.home.dp.behavioral.chainofresponsibility;

public class R500Dispenser implements DispenseChain {
    private DispenseChain dispenseChain;

    @Override
    public void setNextChain(DispenseChain dispenseChain) {
        this.dispenseChain = dispenseChain;
    }

    @Override
    public void dispense(Currency currency) {
        if (currency != null && currency.getAmount() >= Constants.FIVE_HUNDRED) {
            int remainder = 0;
            if (currency.getAmount() % Constants.FIVE_HUNDRED == 0
                    && AmountEnum.getTotalAmount() - 500 >= currency.getAmount()) {
                currency.setAmount(currency.getAmount() - 500);
                remainder = 500;
            }
            int number = currency.getAmount() / Constants.FIVE_HUNDRED;
            remainder += currency.getAmount() % Constants.FIVE_HUNDRED;
            if (remainder != 0) {
                if (number >= AmountEnum.getCount("FIVE_HUNDRED")) {
                    remainder += (500 * (number - AmountEnum.getCount("FIVE_HUNDRED")));
                    number = AmountEnum.getCount("FIVE_HUNDRED");
                }
            } else {
                if (number >= AmountEnum.getCount("FIVE_HUNDRED")) {
                    number = AmountEnum.getCount("FIVE_HUNDRED");
                    remainder = (currency.getAmount() - (number * 500));
                }
            }
            System.out.println("Printing " + number + " Notes of " + Constants.FIVE_HUNDRED);
            if (remainder != 0) {
                currency.setAmount(remainder);
                this.dispenseChain.dispense(currency);
            }
        } else {
            this.dispenseChain.dispense(currency);
        }
    }
}
