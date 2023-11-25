package com.bridegelabz;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class Reservations {

        LocalDate startDate = LocalDate.parse("2020-09-11");
        LocalDate endDate = LocalDate.parse("2020-09-12");

        DayOfWeek startDayOfReservation = startDate.getDayOfWeek();
        DayOfWeek endDayOfReservation = endDate.getDayOfWeek();

        int sum1 = HotelReservationSystem.hotelList.get(0).calculateRateForRegularCustomer(startDayOfReservation.name()) +
                HotelReservationSystem.hotelList.get(0).calculateRateForRegularCustomer(endDayOfReservation.name());

        int sum2 = HotelReservationSystem.hotelList.get(1).calculateRateForRegularCustomer(startDayOfReservation.name()) +
                HotelReservationSystem.hotelList.get(1).calculateRateForRegularCustomer(endDayOfReservation.name());

        int sum3 = HotelReservationSystem.hotelList.get(2).calculateRateForRegularCustomer(startDayOfReservation.name()) +
                HotelReservationSystem.hotelList.get(2).calculateRateForRegularCustomer(endDayOfReservation.name());

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

}
