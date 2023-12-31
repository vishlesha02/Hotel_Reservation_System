package com.bridegelabz;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class HotelReservationSystem {
   static List<Hotels> hotelList = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("============ Welcome to Hotel Reservation System ============");

        Hotels lakewood = new Hotels("LakeWood", 110, 90,80,80, 3);
        Hotels bridgewood = new Hotels("BridgeWood", 150, 50, 110,50,4);
        Hotels ridgewood = new Hotels("RidgeWood", 220, 150, 100,40,5);

        hotelList.add(lakewood);
        hotelList.add(bridgewood);
        hotelList.add(ridgewood);

        System.out.println(hotelList);

        Reservations reserve = new Reservations();

        System.out.println("Enter type of customer : \n1) Regular Customer\n2) Reward Customer");
        int typeOfCustomer=sc.nextInt();

        System.out.println("Enter the Number to choose best package");

        try{
        if(typeOfCustomer == 1) {
            System.out.println("1) Cheapest Hotel\n2) Cheapest Best Rated Hotel\n3) Best Rated Hotel");
            int reservationList = sc.nextInt();
            switch (reservationList) {
                case 1:
                    reserve.cheapestHotel();
                    break;
                case 2:
                    reserve.cheapestBestRatedHotel();
                    break;
                case 3:
                    reserve.bestRatedHotel();
                    break;
                default:
                    System.out.println("Invalid choice.");
                    break;
            }
        } else if (typeOfCustomer == 2) {
            System.out.println("1) Cheapest Best Rated Hotel");
            reserve.cheapestBestRatedHotelForRewardCustomer();
        }
        else {
            System.out.println("Invalid customer type.");
        }
        }
        catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter a valid number.");
        }
        catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
