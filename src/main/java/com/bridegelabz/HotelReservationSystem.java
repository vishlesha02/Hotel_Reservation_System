package com.bridegelabz;

import java.util.ArrayList;
import java.util.List;

public class HotelReservationSystem {
   static List<Hotels> hotelList = new ArrayList<>();

    public static void main(String[] args) {
        System.out.println("============ Welcome to Hotel Reservation System ============");

        Hotels lakewood = new Hotels("LakeWood", 110,90,3);
        Hotels bridgewood = new Hotels("BridgeWood", 150,50,4);
        Hotels ridgewood = new Hotels("RidgeWood", 220,150,5);

        hotelList.add(lakewood);
        hotelList.add(bridgewood);
        hotelList.add(ridgewood);

        System.out.println(hotelList);

        Reservations reserve=new Reservations();
        reserve.cheapestHotel();
    }
}
