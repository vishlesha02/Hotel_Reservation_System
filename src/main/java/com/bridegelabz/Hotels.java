package com.bridegelabz;

public class Hotels {
    private final String hotel;
    private final int rateForRegularCustomerWeekDay;
    private final int rateForRegularCustomerWeekend;

    public Hotels(String hotel, int rateForRegularCustomerWeekDay, int rateForRegularCustomerWeekend)
    {
        this.hotel=hotel;
        this.rateForRegularCustomerWeekDay=rateForRegularCustomerWeekDay;
        this.rateForRegularCustomerWeekend=rateForRegularCustomerWeekend;
    }

    public int calculateRateForRegularCustomer(String day) {
        if (day.equals("MONDAY")||day.equals("TUESDAY")||day.equals("WEDNESDAY")||day.equals("THURSDAY")||day.equals("FRIDAY")) {
            return rateForRegularCustomerWeekDay;
        }
        return 0;
    }


    @Override
    public String toString() {
        return "Hotels {" +
                "hotel='" + hotel + '\'' +
                ", rateForRegularCustomer=" + rateForRegularCustomerWeekDay +
                ", rateForRegularCustomerWeekend=" + rateForRegularCustomerWeekend +
                '}';
    }


}
