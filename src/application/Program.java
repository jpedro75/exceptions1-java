package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import model.entities.Reservation;

public class Program {

	public static void main(String[] args) throws ParseException {
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		System.out.print("Room number:");
		int roomNumber = sc.nextInt();
		System.out.println("Checkin date: ");
		Date checkIn = sdf.parse(sc.next());
		System.out.println("Checkout date:");
		Date checkOut = sdf.parse(sc.next());
		if (!checkOut.after(checkIn)) {
			System.out.println("Error in reservation, check-out date must be after check-in date");
		} else {
			Reservation reservation = new Reservation(roomNumber, checkIn, checkOut);
			System.out.println("Reservation: " + reservation);
			System.out.println("Enter the data to update reservation");
			System.out.println("Checkin date: ");
			checkIn = sdf.parse(sc.next());
			System.out.println("Checkout date:");
			checkOut = sdf.parse(sc.next());
		
			
			
			String error = reservation.updateDates(checkIn, checkOut);
			if(error != null ) {
				System.out.println("Error in reservation:" + null);
			}
			else {
			System.out.println("Reservation: " + reservation);
		}
			

		sc.close();
	}
	}
}
