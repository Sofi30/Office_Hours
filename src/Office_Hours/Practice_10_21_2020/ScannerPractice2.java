package Office_Hours.Practice_10_21_2020;

import java.util.Scanner;

public class ScannerPractice2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a price: ");
        double price = scan.nextDouble();

        System.out.println("Price: "+price);

        System.out.println("Enter the name of the item:");
        String item = scan.next();

        System.out.println("Item: "+item);

        scan.nextLine();// we need this extra nextLine whenever we are using nextline() method

        System.out.println("Enter your full name: ");
        String fullName = scan.nextLine();
        scan.close();

        System.out.println("Full name: "+fullName);


    }


}

