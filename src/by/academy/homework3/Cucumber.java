package by.academy.homework3;

public class Cucumber extends Product {

    private final String type;

    public Cucumber(String name, String type, int quantity,double price) {
        this.name = name;
        this.type = type;
        this.price = price;
        this.quantity = quantity;
    }

    @Override
    public double calculateDiscount() {
        double discount = 1;
        if (quantity > 3) {
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
        return name + " " + type + " по цене " + price + " в количестве " + quantity;
    }
}

