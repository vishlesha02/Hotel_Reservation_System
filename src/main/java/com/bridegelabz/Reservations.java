package com.bridegelabz;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Comparator;
import java.util.Scanner;

public class Reservations {

        LocalDate startDate = LocalDate.parse("2020-09-11");
        LocalDate endDate = LocalDate.parse("2020-09-12");

        DayOfWeek startDayOfReservation = startDate.getDayOfWeek();
        DayOfWeek endDayOfReservation = endDate.getDayOfWeek();


        String checkIn = String.valueOf(startDayOfReservation);
        String checkOut = String.valueOf(endDayOfReservation);


        int sum1 = HotelReservationSystem.hotelList.get(0).calculateRateForCustomer(checkIn) +
                HotelReservationSystem.hotelList.get(0).calculateRateForCustomer(checkOut);

        int sum2 = HotelReservationSystem.hotelList.get(1).calculateRateForCustomer(checkIn) +
                HotelReservationSystem.hotelList.get(1).calculateRateForCustomer(checkOut);

        int sum3 = HotelReservationSystem.hotelList.get(2).calculateRateForCustomer(checkIn) +
                HotelReservationSystem.hotelList.get(2).calculateRateForCustomer(checkOut);

        int lakeWoodRating = HotelReservationSystem.hotelList.get(0).ratings;
        int bridgeWoodRating = HotelReservationSystem.hotelList.get(1).ratings;
        int ridgeWoodRating = HotelReservationSystem.hotelList.get(2).ratings;


    public void cheapestHotel() {

        if (sum1 < sum2 && sum1 < sum3) {
            System.out.println("Hotel Name: LakeWood, Rate: " + sum1 + "$");
        } else if (sum2 < sum1 && sum2 < sum3) {
            System.out.println("Hotel Name: BridgeWood, Rate: " + sum2 + "$");
        } else if (sum1 == sum2 && sum1 < sum3) {
            System.out.println("Hotel Name: LakeWood AND BridgeWood, Rate: " + sum1 + "$");
        } else if (sum1 == sum3 && sum1 < sum2) {
            System.out.println("Hotel Name: LakeWood AND RidgeWood, Rate: " + sum1 + "$");
        } else if (sum2 == sum3 && sum2 < sum1) {
            System.out.println("Hotel Name: BridgeWood AND RidgeWood, Rate: " + sum2 + "$");
        } else {
            System.out.println("Hotel Name: RidgeWood, Rate: " + sum3 + "$");
        }
    }

    public void cheapestBestRatedHotel()
    {

        int minRate = HotelReservationSystem.hotelList.stream()
                .mapToInt(hotel -> hotel.calculateRateForCustomer(checkIn) + hotel.calculateRateForCustomer(checkOut))
                .min()
                .orElseThrow();

        Hotels bestHotel = HotelReservationSystem.hotelList.stream()
                .filter(hotel -> hotel.calculateRateForCustomer(checkIn) + hotel.calculateRateForCustomer(checkOut) == minRate)
                .max(Comparator.comparingInt(hotel -> hotel.ratings))
                .orElseThrow();

        System.out.println("Hotel Name: " + bestHotel.hotel + ", Rating: " + bestHotel.ratings + ", Rate: " + minRate + "$");



}

    public void bestRatedHotel()
    {
        if(lakeWoodRating > bridgeWoodRating && lakeWoodRating > ridgeWoodRating)
        {
            System.out.println("Best Rated Hotel: LakeWood, Rate: " + sum1);
        }
        else if (bridgeWoodRating > lakeWoodRating && bridgeWoodRating > ridgeWoodRating)
        {
            System.out.println("Best Rated Hotel: BridgeWood, Rate: " + sum2);
        }
        else if (ridgeWoodRating > lakeWoodRating && ridgeWoodRating > bridgeWoodRating)
        {
            System.out.println("Best Rated Hotel: RidgeWood, Rate: " + sum3);

        }
    }

    public void cheapestBestRatedHotelForRewardCustomer() {

            int minRate = HotelReservationSystem.hotelList.stream()
                    .mapToInt(hotel -> hotel.calculateRateForRewardCustomer(checkIn) + hotel.calculateRateForRewardCustomer(checkOut))
                    .min()
                    .orElseThrow();

            Hotels bestHotel = HotelReservationSystem.hotelList.stream()
                    .filter(hotel -> hotel.calculateRateForRewardCustomer(checkIn) + hotel.calculateRateForRewardCustomer(checkOut) == minRate)
                    .max(Comparator.comparingInt(hotel -> hotel.ratings))
                    .orElseThrow();

            System.out.println("Hotel Name: " + bestHotel.hotel + ", Rating: " + bestHotel.ratings + ", Rate: " + minRate + "$");

    }
}
