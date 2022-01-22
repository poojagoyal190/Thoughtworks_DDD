package org.example;
import java.util.ArrayList;
import java.util.Scanner;

public class DDDday1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input;

        ArrayList<String> prodName = new ArrayList<>();
        ArrayList<Integer> prodQuantity = new ArrayList<>();
        System.out.println("WELCOME !! to our shopping page ");
        System.out.println("ID  Product  ");
        System.out.println("1   IPaD Pro     ");
        System.out.println("2   Hero Ink Pen ");
        System.out.println("3   GM Cricket bat ");
        System.out.println("4   Diary ");
        do{
            System.out.print("Do you want to add or delete product in cart: add/ del ");
            String val = sc.nextLine();

            if(val.equals("add")) {
                System.out.println("Kindly enter the item ID you want to buy");
                int itemId = sc.nextInt();

                System.out.println("Kindly enter quantity of the item you want to buy");
                int itemQty = sc.nextInt();

                switch (itemId) {
                    case 1: prodName.add("IPad Pro");
                        break;
                    case 2: prodName.add("Hero Ink Pen");
                        break;
                    case 3: prodName.add("GM Cricket bat");
                        break;
                    case 4: prodName.add("Diary");
                        break;
                    default:
                        System.out.println("Invalid Choice");
                        break;
                }
                prodQuantity.add(itemQty);
            }
             else if(val.equals("del")) {
                System.out.println("Kindly enter the item ID you want to remove from cart");
                int itemId = sc.nextInt();
                String prod = prodName.get(itemId);
                prodName.remove(itemId-1);
                prodQuantity.remove(itemId-1);
                System.out.println("Product removed: "+ prod);

            }
            else
                System.out.println("Invalid Option");

            System.out.println("Product in your shopping cart: " + prodName + "\t Quantity:" +prodQuantity);

            System.out.println("If you want to continue shopping Press 1");
            input = sc.nextInt();
            sc.nextLine();

        }while(input == 1);
        System.out.println("Thanks for shopping");
    }
}
