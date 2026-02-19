import java.text.ParseException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Scanner;

import entities.Reservation;
import exceptions.DomainException;

public class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MM/dd/yyyy");

        try {
            System.out.print("Room number: ");
            int roomNumber = input.nextInt();
            System.out.print("Check-in date (MM/dd/yyyy): ");
            Date checkIn = simpleDateFormat.parse(input.nextLine());
            System.out.print("Check-out date (MM/dd/yyyy): ");
            Date checkOut = simpleDateFormat.parse(input.nextLine());

            Reservation reservation = new Reservation(roomNumber, checkIn, checkOut);
            System.out.println("Reservation: " + reservation);

            System.out.println();
            System.out.print("Check-in date (MM/dd/yyyy): ");
            checkIn = simpleDateFormat.parse(input.nextLine());
            System.out.print("Check-out date (MM/dd/yyyy): ");
            checkOut = simpleDateFormat.parse(input.nextLine());

            reservation.updateDates(checkIn, checkOut);
            System.out.println("Reservation: " + reservation);
        } catch (ParseException e) {
            System.out.println("Invalid date format");
        } catch (DomainException e) {
            System.out.println("Error in reservation: " + e.getMessage());
        } catch (RuntimeException e) {
            throw new RuntimeException(e);
        }



        input.close();
    }
}