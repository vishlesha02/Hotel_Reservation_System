package com.bridegelabz;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class Reservations {

    public void cheapestHotel() {
        LocalDate startDate = LocalDate.parse("2020-09-10");
        LocalDate endDate = LocalDate.parse("2020-09-11");

        DayOfWeek startDayOfReservation = startDate.getDayOfWeek();
        DayOfWeek endDayOfReservation = endDate.getDayOfWeek();

        int sum1 = HotelReservationSystem.hotelList.get(0).calculateRateForRegularCustomer(startDayOfReservation.name()) +
                HotelReservationSystem.hotelList.get(0).calculateRateForRegularCustomer(endDayOfReservation.name());

        int sum2 = HotelReservationSystem.hotelList.get(1).calculateRateForRegularCustomer(startDayOfReservation.name()) +
                HotelReservationSystem.hotelList.get(1).calculateRateForRegularCustomer(endDayOfReservation.name());

        int sum3 = HotelReservationSystem.hotelList.get(2).calculateRateForRegularCustomer(startDayOfReservation.name()) +
                HotelReservationSystem.hotelList.get(2).calculateRateForRegularCustomer(endDayOfReservation.name());

        if (sum1 < sum2 && sum1 < sum3) {
            System.out.println("Hotel Name: Lakewood, " + "Rate: " + sum1 + "$");
        } else if (sum2 < sum1 && sum2 < sum3) {
            System.out.println("Hotel Name: Bridgewood, " + "Rate: " + sum2 + "$");
        } else {
            System.out.println("Hotel Name: Ridgewood, " + "Rate: " + sum3 + "$");
        }





    }
}
