package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import model.entities.Reservation;
import model.exceptions.DomainException;

public class Program {

	public static void main(String[] args)  {
		Scanner sc = new Scanner(System.in);

		try {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		System.out.print("Room number:");
		int roomNumber = sc.nextInt();
		System.out.println("Checkin date: ");
		Date checkIn = sdf.parse(sc.next());
		System.out.println("Checkout date:");
		Date checkOut = sdf.parse(sc.next());
		
		
	
		Reservation reservation = new Reservation(roomNumber, checkIn, checkOut);
		System.out.println("Reservation: " + reservation);
		System.out.println("Enter the data to update reservation");
		System.out.println("Checkin date: ");
		checkIn = sdf.parse(sc.next());
		System.out.println("Checkout date:");
		checkOut = sdf.parse(sc.next());

		reservation.updateDates(checkIn, checkOut);
		System.out.println("Error in reservation:" + null);

		System.out.println("Reservation: " + reservation);

	}
	catch(ParseException e) {
		System.out.println("Invalid date format");
	}
	catch(DomainException e ) {
		 System.out.println("Error in reservation: " + e.getMessage());
	}
		catch(RuntimeException e) {
			System.out.println("Unexpected error");	
		}
sc.close();
	
}
}
