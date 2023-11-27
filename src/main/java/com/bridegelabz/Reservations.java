package com.bridegelabz;

import java.time.DayOfWeek;
import java.time.LocalDate;
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
         if (sum1 == sum2 && lakeWoodRating < bridgeWoodRating)
        {
            System.out.println("Hotel Name: BridgeWood, Rating: " + bridgeWoodRating + " Rate: " + sum1 + "$");
        }
         else if(sum1 == sum2 && lakeWoodRating > bridgeWoodRating)
         {
             System.out.println("Hotel Name: LakeWood, Rating: " + lakeWoodRating + " Rate: " + sum2 + "$");
         }
        else if (sum1 == sum3 && lakeWoodRating < ridgeWoodRating)
        {
            System.out.println("Hotel Name: RidgeWood, Rating: "+ ridgeWoodRating + " Rate: " + sum3 + "$");
        }
         else if(sum1 == sum3 && lakeWoodRating > ridgeWoodRating)
         {
             System.out.println("Hotel Name: LakeWood, Rating: " + lakeWoodRating + " Rate: " + sum1 + "$");
         }
        else if (sum2 == sum3 && bridgeWoodRating < ridgeWoodRating)
        {
            System.out.println("Hotel Name: RidgeWood, Rating: " + ridgeWoodRating + " Rate: " + sum3 + "$");
        }
         else if (sum2 == sum3 && bridgeWoodRating > ridgeWoodRating)
         {
             System.out.println("Hotel Name: BridgeWood, Rating: " + bridgeWoodRating + " Rate: " + sum2 + "$");
         }

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

        int sum1 = HotelReservationSystem.hotelList.get(0).calculateRateForRewardCustomer(checkIn) +
                HotelReservationSystem.hotelList.get(0).calculateRateForRewardCustomer(checkOut);

        int sum2 = HotelReservationSystem.hotelList.get(1).calculateRateForRewardCustomer(checkIn) +
                HotelReservationSystem.hotelList.get(1).calculateRateForRewardCustomer(checkOut);

        int sum3 = HotelReservationSystem.hotelList.get(2).calculateRateForRewardCustomer(checkIn) +
                HotelReservationSystem.hotelList.get(2).calculateRateForRewardCustomer(checkOut);

        int minRate = sum1;

        if (sum2 < minRate) {
            minRate = sum2;
        }

        if (sum3 < minRate) {
            minRate = sum3;
        }

        if (sum1 == minRate && lakeWoodRating >= bridgeWoodRating && lakeWoodRating >= ridgeWoodRating) {
            System.out.println("Hotel Name: LakeWood, Rating: " + lakeWoodRating + " Rate: " + minRate + "$");
        } else if (sum2 == minRate && bridgeWoodRating >= lakeWoodRating && bridgeWoodRating >= ridgeWoodRating) {
            System.out.println("Hotel Name: BridgeWood, Rating: " + bridgeWoodRating + " Rate: " + minRate + "$");
        } else if (sum3 == minRate && ridgeWoodRating >= lakeWoodRating && ridgeWoodRating >= bridgeWoodRating) {
            System.out.println("Hotel Name: RidgeWood, Rating: " + ridgeWoodRating + " Rate: " + minRate + "$");
        }
    }
}
