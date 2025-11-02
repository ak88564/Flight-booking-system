package Driver;

import Entity.City;
import Service.BookingService;

import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
        BookingService bookingService = new BookingService();
        Scanner sc = new Scanner(System.in);
        outer:while(true){
            System.out.println("Options");
            System.out.println("1. Create Flight");
            System.out.println("2. Create Booking");
            System.out.println("3. Exit");
            switch(sc.nextInt()){
                case 1:
                    System.out.println("You selected create flight");
                    System.out.println("Enter flight name");
                    String flightName = sc.next();
                    bookingService.createFlight(flightName);
                    break;

                case 2:
                    System.out.println("You selected create booking");
                    System.out.println("Enter flight name");
                    String fName = sc.next();

                    System.out.println("Enter from city");
                    String fromCity = sc.next();

                    System.out.println("Enter to city");
                    String toCity = sc.next();

                    bookingService.createBooking(fName,
                            City.valueOf(fromCity),
                            City.valueOf(toCity));
                    break;

                case 3:
                    System.out.println("Application stopped");
                    break outer;

                default:
                    System.out.println("You have selected invalid option");
                    break;
            }
        }
    }


}
