package com.bridegelabz;

import java.util.ArrayList;
import java.util.List;

public class HotelReservationSystem {
    public static void main(String[] args) {
        System.out.println("============ Welcome to Hotel Reservation System ============");

        List<Hotels> hotelList=new ArrayList<>();
        Hotels lakewood=new Hotels("LakeWood",110);
        Hotels bridgewood=new Hotels("LakeWood",160);
        Hotels ridgewood=new Hotels("LakeWood",220);

        hotelList.add(lakewood);
        hotelList.add(bridgewood);
        hotelList.add(ridgewood);

        System.out.println(hotelList);




    }
}
