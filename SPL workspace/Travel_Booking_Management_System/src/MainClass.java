import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import properties.PropertyManager;

public class MainClass {
	
	static List<FlightBooking> bookings = new ArrayList<FlightBooking>();
	static List<ViewFlightDetails> flights = new ArrayList<ViewFlightDetails>();
	
    public static void main(String[] args) {

         UserRegistration registration = new UserRegistration();
         UserLogin login = new UserLogin(registration.getUsers());
         

         Scanner scanner = new Scanner(System.in);

        if (PropertyManager.getProperty("UserRegisteration")) {
            System.out.print("User Registeration");
            registration.registerUser();
        }

         if (PropertyManager.getProperty("UserLogin")) {
         System.out.print("User Login");
         login.loginUser();
        
         }
         
         if (PropertyManager.getProperty("ViewFlightDetails")) {
             System.out.print("Booking ID: ");
             String bookingID = scanner.nextLine();
             
             System.out.print("Passenger Name: ");
             String passengerName = scanner.nextLine();
             
             System.out.print("Flight Number: ");
             String flightNumber = scanner.nextLine();
             
             System.out.print("Destination: ");
             String destination = scanner.nextLine();	
             
             System.out.print("Enter Departure Time: ");
             String departureTime = scanner.nextLine();
             
             ViewFlightDetails flight = new ViewFlightDetails(flightNumber, destination, departureTime);
             FlightBooking booking = new FlightBooking(bookingID, passengerName);
             
             bookings.add(booking);
             flights.add(flight);
             
             System.out.print("Enter booking ID to view details: ");
             String viewBookingId = scanner.nextLine();
             
             System.out.println("Booking Details:");
             viewBookingDetails(viewBookingId);
             
             
             System.out.print("Enter flight number to view details: ");
             String viewFlightNumber = scanner.nextLine();
             
             System.out.println("Flight Details:");
             viewFlightDetails(viewFlightNumber);
             

             scanner.close();
         }

         scanner.close();

    }
    
    public static void viewBookingDetails(String bookingId) {
        for (FlightBooking booking : bookings) {
            if (booking.getBookingId().equals(bookingId)) {
                System.out.println("Booking Details:");
                System.out.println(booking);
                return;
            }
        }
        System.out.println("No booking found with ID: " + bookingId);
    }
    
	public static void viewFlightDetails(String flightNumber) {
		for (ViewFlightDetails flight: flights) {
			if (flight.getFlightNumber().equals(flightNumber)) {
				System.out.println("Flight Details:");
				System.out.println(flight);
				return;
			}
		}
		System.out.println("No flight found with number: " + flightNumber);
	}
}
