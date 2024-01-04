package Classes;

public class Order {
    String name;
    int contact;
    String[] items;
    int[] price;
    int totalPrice;
    double priceWithVat;
    public Order(String name,int contact, String[] items,int[] price){
        this.name = name;
        this.contact = contact;
        this.items = items;
        this.price = price;
    }
    public void myTotalPrice(){
        for (int i=0; i<price.length; i++){
            totalPrice = totalPrice + price[i];
        }
        priceWithVat = totalPrice + (0.13 * totalPrice);
        System.out.println("Name : " + name);
        System.out.println("Contact : " + contact);
        System.out.println("Total price is " + totalPrice);
        System.out.println("Price after discount is " + priceWithVat);
        System.out.println("Grand Total is " + priceWithVat);
    }
}
