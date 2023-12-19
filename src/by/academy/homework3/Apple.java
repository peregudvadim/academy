package by.academy.homework3;

public class Apple extends Product {

    private final String country;

    public Apple(String name, String country, int quantity,double price) {
        this.name = name;
        this.country = country;
        this.price = price;
        this.quantity = quantity;
    }

    @Override
    public double calculateDiscount() {
        double discount = 1;
        if (quantity > 4) {
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
        return name + " " + country + " по цене " + price + " в количестве " + quantity;
    }
}

