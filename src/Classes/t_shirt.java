package Classes;

import java.util.ArrayList;
import java.util.Arrays;

public class t_shirt {
    public void setItems_name(String items_name) {
        this.items_name = items_name;
    }

    String items_name;

    public String getProductCode() {
        return productCode;
    }

    String productCode;
    String brand;

    public int getPrice() {
        return price;
    }

    int price = 1235;
    String description;
    String[] sizes = {"XL", "Medium", "Large"};
    public t_shirt(String productCode,String brand,int price,String description){
        this.description = description;
        this.productCode = productCode;
        this.brand = brand;
        this.price = price;
    }
    public void displayTshirt(){
        System.out.println("Items Name : " + items_name);
        System.out.println("Product Code : " + productCode);
        System.out.println("Price : " + price);
        System.out.println("Brand : " + brand);
        System.out.println("Description : " + description);
        System.out.println("Sizes : " + Arrays.toString(sizes));
    }
}
