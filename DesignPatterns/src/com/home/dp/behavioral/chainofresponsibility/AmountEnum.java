package com.home.dp.behavioral.chainofresponsibility;

public enum AmountEnum {
    HUNDRED(26), FIVE_HUNDRED(0), THOUSAND(0);

    private Integer id;

    private AmountEnum(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public static AmountEnum getValue(Integer id) {
        if (id == null) {
            return null;
        }
        AmountEnum[] values = values();
        for (int i = 0; i < values.length; i++) {
            if (id.equals(values[i].getId())) {
                return values[i];
            }
        }
        return null;
    }

    public static int getCount(String name) {
        if (name == null) {
            return 0;
        }
        AmountEnum[] values = values();
        for (int i = 0; i < values.length; i++) {
            if (name.equals(values[i].name())) {
                return values[i].getId();
            }
        }
        return 0;
    }

    public static int getTotalAmount() {
        int sum = 0;
        AmountEnum[] values = values();
        for (int i = 0; i < values.length; i++) {
            if(AmountEnum.HUNDRED.name() == values[i].name()){
                sum += (values[i].getId()*100);
            }
            if(AmountEnum.FIVE_HUNDRED.name() == values[i].name()){
                sum += (values[i].getId()*500);
            }
            if(AmountEnum.THOUSAND.name() == values[i].name()){
                sum += (values[i].getId()*1000);
            }
        }
        return sum;
    }
}
