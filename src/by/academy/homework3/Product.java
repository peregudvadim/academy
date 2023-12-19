package by.academy.homework3;

public abstract class Product {

    protected String name;
    protected double price;
    protected int quantity;

    public abstract double calculateDiscount();
    public abstract double calculatePrice();

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                '}';
    }
}
