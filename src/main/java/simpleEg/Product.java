package simpleEg;

public class Product {
    String name;
    int price;
    String line="clothes";

    Product (String name, int price){
        this.name=name;
        this.price=price;
    }

    Product (String name, int price, String line) {
        this.name = name;
        this.price = price;
        this.line = line;
    }
}
