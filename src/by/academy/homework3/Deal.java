package by.academy.homework3;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Objects;

public class Deal {

    private final User seller;
    private final User buyer;
    private final Product[] products;
    private LocalDate dealDate;
    private LocalDate deadLine;

    public Deal(User buyer, User seller, Product[] products,LocalDate dealDate) {
        this.seller = seller;
        this.buyer = buyer;
        this.products = products;
        this.dealDate = dealDate;
    }

    public LocalDate getDeadLine() {
        return deadLine;
    }

    public void setDeadLine(LocalDate deadLine) {
        this.deadLine = deadLine;
    }

    public LocalDate getDealDate() {
        return dealDate;
    }

    public void setDealDate(LocalDate dealDate) {
        this.dealDate = dealDate;
    }

    public void transferMoney() {
        buyer.setMoney(buyer.getMoney() - calculateFullPrice());
        seller.setMoney(seller.getMoney() + calculateFullPrice());
    }

    private void printBill() {
        System.out.println("Стоимость покупок");
        for (Product p : products) {
            if (p == null) {
                continue;
            }
            System.out.println(p + " стоимость со скидкой " + p.calculatePrice());
        }
        System.out.println("Итого стоимость со скидкой  " + calculateFullPrice());
        System.out.println("Дата сделки "+getDealDate());
        setDeadLine(getDealDate().plusDays(10));
        System.out.println("Дата дедлайна " + getDeadLine());
    }

    public double calculateFullPrice() {
        if (products == null) {
            return 0;
        }
        double result = 0;
        for (Product p : products) {
            if (p == null) {
                continue;
            }
            result += p.calculatePrice();
        }
        return result;
    }

    public void makeDeal() {
        double price = calculateFullPrice();
        if (buyer.hasEnoughMoney(price)) {
            printBill();
            transferMoney();
            System.out.println("Спасибо за покупку!");
        } else {
            System.out.println("У вас нет столько денег");
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Deal deal = (Deal) o;
        return seller.equals(deal.seller) && buyer.equals(deal.buyer) && Arrays.equals(products, deal.products) && dealDate.equals(
                deal.dealDate) && deadLine.equals(deal.deadLine);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(seller, buyer, dealDate, deadLine);
        result = 31 * result + Arrays.hashCode(products);
        return result;
    }

    @Override
    public String toString() {
        return "Информация о сделке: \n" + seller +
                "\n" + buyer +
                "\nдата сделки " + dealDate +
                "\nдата дедлайна " + deadLine;
    }
}
