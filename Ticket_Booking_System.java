import java.util.Scanner;

public class Ticket_Booking_System {
    public static void main(String[] args) {
        System.out.println();
        Scanner input = new Scanner(System.in);
        String seatType = "";
        
        while (true) {
            System.out.println("Please choose between Regular and Premium seat...");
            seatType = input.nextLine();
            if (seatType.equals("Regular") || seatType.equals("Premium")) {
                break;
            } else {
                System.out.println("\nERROR: INVALID SEAT TYPE. Please enter 'Regular' or 'Premium'.\n");
            }
        }
        
        System.out.println();
        System.out.println("How many tickets would you like to purchase?");
        int ticketCount = input.nextInt();
        System.out.println();
        input.close();
        
        double ticketPrice = 150.75;
        double initialPrice = 0;
        double discountedPrice = 0;
        double totalPrice = 0;
        boolean discount = ticketCount >= 5;
        String appliedDiscount;
        
        initialPrice = ticketPrice * ticketCount;
        
        discountedPrice = (discount == true) ?
                (initialPrice - (initialPrice * 0.10)) :
                initialPrice;
        
        appliedDiscount = (discount == true) ?
                "10 percent" : "none";
        
        switch (seatType) {
            case "Regular":
                totalPrice = discountedPrice;
                break;
            case "Premium":
                totalPrice = discountedPrice * 1.5;
                break;
        }
        
        System.out.println("Wilfrido Ma. Guerrero Theater");
        System.out.println("UP-Diliman, Quezon City\n");
        
        System.out.println("Seat type\t: " + seatType);
        System.out.println("No. of tickets\t: " + ticketCount + " tickets");
        System.out.println("Initial price\t: " + "\u20b1 " + initialPrice);
        System.out.println("Discount\t: " + appliedDiscount);
        System.out.println("-----------------------------");
        System.out.println("Total price\t: " + "\u20b1 " + totalPrice);
        System.out.println();
    }
}