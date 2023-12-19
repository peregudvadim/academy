package by.academy.homework3;

public class Tomato extends Product {

    private final String color;

    public Tomato(String name, String color, int quantity,double price) {
        this.name = name;
        this.color = color;
        this.price = price;
        this.quantity = quantity;
    }

    @Override
    public double calculateDiscount() {
        double discount = 1;
        if (quantity > 2) {
            discount = 0.75;
        }
        return discount;
    }

    @Override
    public double calculatePrice() {
        return price * calculateDiscount() * quantity;
    }

    @Override
    public String toString() {
        return name + " " + color + " по цене " + price + " в количестве " + quantity;
    }
}
