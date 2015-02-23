package com.home.dp.behavioral.chainofresponsibility;

import java.util.Scanner;

public class TestMain {

    private DispenseChain dispenseChain;

    public TestMain() {
        this.dispenseChain = new R1000Dispenser();
        DispenseChain nextChain = new R500Dispenser();
        nextChain.setNextChain(new R100Dispenser());
        this.dispenseChain.setNextChain(nextChain);
    }

    public static void main(String[] args) {

        TestMain testMain = new TestMain();
        int amount = 0;
        while (true) {
            System.out.println("Please enter the withdrawal amount : ");
            Scanner input = new Scanner(System.in);
            amount = input.nextInt();
            if (amount % Constants.HUNDRED != 0 || amount < 1) {
                System.out.println("Amount should be in multiple of " + Constants.HUNDRED);
                return;
            } else if (amount > AmountEnum.getTotalAmount()) {
                System.out.println("Amount is not available. Please visit nearest ATM.");
                return;
            }
            testMain.dispenseChain.dispense(new Currency(amount));
        }
    }
}
