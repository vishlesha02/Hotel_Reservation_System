package com.bridegelabz;

public class Hotels {
    private final String hotel;
    private final int rateForRegularCustomerWeekDay;
    private final int rateForRegularCustomerWeekend;
    private final int rateForRewardCustomerWeekDay;
    private final int rateForRewardCustomerWeekEnd;

    int ratings;

    public Hotels(String hotel, int rateForRegularCustomerWeekDay, int rateForRegularCustomerWeekend,int rateForRewardCustomerWeekDay, int rateForRewardCustomerWeekEnd, int ratings)
    {
        this.hotel=hotel;
        this.rateForRegularCustomerWeekDay=rateForRegularCustomerWeekDay;
        this.rateForRegularCustomerWeekend=rateForRegularCustomerWeekend;
        this.rateForRewardCustomerWeekDay=rateForRewardCustomerWeekDay;
        this.rateForRewardCustomerWeekEnd=rateForRewardCustomerWeekEnd;
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
                "Hotel = '" + hotel + '\'' +
                ", Rate For Regular Customer WeekDay = " + rateForRegularCustomerWeekDay +
                ", Rate For Regular Customer Weekend = " + rateForRegularCustomerWeekend +
                ", Rate For Reward Customer WeekDay = " + rateForRewardCustomerWeekDay +
                ", Rate For Reward Customer WeekEnd = " + rateForRewardCustomerWeekEnd +
                ", Hotel Ratings=" + ratings +
                '}';
    }
}
