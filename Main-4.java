import com.example.ReserveTable.ReserveTable;


public class Main {
    public static void main(String[] args) {
        System.out.println("Sai Chander Reddy Patlolla CS5100 Homework 1, Spring 2023");
        ReserveTable reserveTable = new ReserveTable();
        reserveTable.add("Dog", 2);
        reserveTable.add("CAt", 4);
        reserveTable.add("Mouse", 6);
        reserveTable.add("Rat", 8);
        reserveTable.add("HoRSe", 10);
        System.out.println("The Code for 'DOG' is " + reserveTable.lookupName("DOG"));
        System.out.println("The Code for 'cat' is " + reserveTable.lookupName("cat"));
        System.out.println("The Code for 'MOUSE' is " + reserveTable.lookupName("MOUSE"));
        System.out.println("The Code for 'RAt' is " + reserveTable.lookupName("RAt"));
        System.out.println("The Code for 'hors' is " + reserveTable.lookupName("hors"));
        System.out.println();
        System.out.println("The Name for 2 is " + reserveTable.lookupCode(2));
        System.out.println("The Name for 4 is " + reserveTable.lookupCode(4));
        System.out.println("The Name for 6 is " + reserveTable.lookupCode(6));
        System.out.println("The Name for 8 is " + reserveTable.lookupCode(8));
        System.out.println("The Name for 12 is " + reserveTable.lookupCode(12));

        System.out.println("Saving Printed Table to "+args[0]);
        reserveTable.printReserveTable(args[0]);
    }
}
