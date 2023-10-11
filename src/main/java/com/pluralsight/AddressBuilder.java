package com.pluralsight;
import java.util.*;
public class AddressBuilder {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.print("Full Name Here: " );
        String nameScanner =userInput.nextLine().trim();
        System.out.print("Billing Street Here: ");
        String billingStreet = userInput.nextLine().trim();
        System.out.print("Billing City Here: ");
        String billingCity = userInput.nextLine().trim();
        System.out.print("Billing State Here: ");
        String billingState = userInput.nextLine().trim();
        System.out.print("Billing Zip Here: ");
        String billingZip = userInput.nextLine().trim();

        StringBuilder address = new StringBuilder();
        address.append(nameScanner + "\n");
        address.append("Billing Address: \n");
        address.append(billingStreet + "\n");
        address.append(billingCity + "," + " ");
        address.append(billingState + " ");
        address.append(billingZip + "\n");
        address.append("Shipping Address: \n");
        address.append(billingStreet + "\n");
        address.append(billingCity + "," + " " + billingState + " " + billingZip);

        String myAddress = address.toString();
        System.out.println(myAddress);

    }

}
