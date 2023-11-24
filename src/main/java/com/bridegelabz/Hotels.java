package com.bridegelabz;

public class Hotels {
    private final String hotel;
    private final int rateForRegularCustomer;

    public Hotels(String hotel, int rateForRegularCustomer)
    {
        this.hotel=hotel;
        this.rateForRegularCustomer=rateForRegularCustomer;
    }

    @Override
    public String toString() {
        return "Hotels {" +
                "hotel='" + hotel + '\'' +
                ", rateForRegularCustomer=" + rateForRegularCustomer +
                '}';
    }
}
