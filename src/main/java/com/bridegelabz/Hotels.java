package com.bridegelabz;

public class Hotels {
    private final String hotel;
    private final int rateForRegularCustomer;

    public Hotels(String hotel, int rateForRegularCustomer)
    {
        this.hotel=hotel;
        this.rateForRegularCustomer=rateForRegularCustomer;
    }


    public String getHotel() {
        return hotel;
    }

    public int getRateForRegularCustomer() {
        return rateForRegularCustomer;
    }

    public int calculateRateForRegularCustomer(String day) {
        if (day.equals("MONDAY")||day.equals("TUESDAY")||day.equals("WEDNESDAY")||day.equals("THURSDAY")||day.equals("FRIDAY")) {
            return rateForRegularCustomer;
        }

        return 0;
    }


    @Override
    public String toString() {
        return "Hotels {" +
                "hotel='" + hotel + '\'' +
                ", rateForRegularCustomer=" + rateForRegularCustomer +
                '}';
    }
}
