import Classes.Order;
import Classes.t_shirt;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //those are the products of shop
        //here i don't think we need setter but also i have use it
        t_shirt t_shirt_1 = new t_shirt( "1044","Karuna", 1255,"The items name is Gorkhali batman and price is 1044 with karuna brand");
        t_shirt_1.setItems_name("Gorkhali Batman");//setting value of product
        t_shirt t_shirt_2 = new t_shirt( "2302","Haruna", 1799,"The items name is Gorkhali crowman and price is 1299 with haruna brand");
        t_shirt_2.setItems_name("Gorkhali Crowman");
        t_shirt t_shirt_3 = new t_shirt( "3302","Saruna", 899,"The items name is Gorkhali dogman and price is 899 with saruna brand");
        t_shirt_3.setItems_name("Gorkhali Dogman");
        t_shirt t_shirt_4 = new t_shirt( "1103","Garuna", 1499,"The items name is Gorkhali catman and price is 1499 with garuna brand");
        t_shirt_4.setItems_name("Gorkhali Catman");
        t_shirt t_shirt_5 = new t_shirt( "3803","Maruna", 1299,"The items name is Gorkhali bullman and price is 1299 with maruna brand");
        t_shirt_5.setItems_name("Gorkhali Bullman");
        //printing details of items
        t_shirt_1.displayTshirt();
        System.out.println("");//breaking line for next product
        t_shirt_2.displayTshirt();
        System.out.println("");
        t_shirt_3.displayTshirt();
        System.out.println("");
        t_shirt_4.displayTshirt();
        System.out.println("");
        t_shirt_5.displayTshirt();
        System.out.println("");

        //i have created only two customer
        //order of first customer
        System.out.println("Details with price of first customer ");
        String[] order1itemscode = {t_shirt_1.getProductCode(),t_shirt_2.getProductCode()};//here is the use of getter
        int[] order1price = {t_shirt_1.getPrice(),t_shirt_2.getPrice()};
        Order order1 = new Order("Satya Sharma", 9803, order1itemscode, order1price);//i have use constractor also
        order1.myTotalPrice();
        System.out.println("");

        //order of second customer
        System.out.println("Details with price of second customer ");

        String[] order2itemscode = {t_shirt_3.getProductCode(),t_shirt_4.getProductCode()};
        int[] order2price = {t_shirt_3.getPrice(),t_shirt_4.getPrice()};
        Order order2 = new Order("Prakash Sharma", 9809, order2itemscode, order2price);
        order2.myTotalPrice();//getting total price by calling functiion
    }
}
