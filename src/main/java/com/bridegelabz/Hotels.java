package com.bridegelabz;

public class Hotels {
    private final String hotel;
    private final int rateForRegularCustomerWeekDay;
    private final int rateForRegularCustomerWeekend;
    int ratings;

    public Hotels(String hotel, int rateForRegularCustomerWeekDay, int rateForRegularCustomerWeekend, int ratings)
    {
        this.hotel=hotel;
        this.rateForRegularCustomerWeekDay=rateForRegularCustomerWeekDay;
        this.rateForRegularCustomerWeekend=rateForRegularCustomerWeekend;
        this.ratings=ratings;
    }

    public int calculateRateForRegularCustomer(String day) {
        if (day.equals("MONDAY")||day.equals("TUESDAY")||day.equals("WEDNESDAY")||day.equals("THURSDAY")||day.equals("FRIDAY")) {
            return rateForRegularCustomerWeekDay;
        }
        else {
            return rateForRegularCustomerWeekend;
        }
    }

    @Override
    public String toString() {
        return "Hotels {" +
                "Hotel Name ='" + hotel + '\'' +
                ", Regular Customer WeekDay Rate=" + rateForRegularCustomerWeekDay +
                ", Regular Customer Weekend Rate=" + rateForRegularCustomerWeekend +
                ", Hotel Rating=" + ratings +
                '}';
    }
}
