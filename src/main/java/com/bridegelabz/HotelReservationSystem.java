package com.bridegelabz;

import java.util.ArrayList;
import java.util.List;

public class HotelReservationSystem {
   static List<Hotels> hotelList = new ArrayList<>();

    public static void main(String[] args) {
        System.out.println("============ Welcome to Hotel Reservation System ============");

        Hotels lakewood = new Hotels("LakeWood", 110);
        Hotels bridgewood = new Hotels("BridgeWood", 160);
        Hotels ridgewood = new Hotels("RidgeWood", 220);

        hotelList.add(lakewood);
        hotelList.add(bridgewood);
        hotelList.add(ridgewood);

        System.out.println(hotelList);

        Reservations reserve=new Reservations();
        reserve.cheapeestHotel();
    }
}
