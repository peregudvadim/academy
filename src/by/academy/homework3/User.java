package by.academy.homework3;

import java.time.LocalDate;
import java.util.Objects;

public class User {
    private final String name;
    private final LocalDate dateOfBirth;
    private double money;
    private final String status;
    private final String phone;
    private final String email;

    public User(String status, String name, double money, LocalDate dateOfBirth, String phone, String email) {
        this.status = status;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.money = money;
        this.phone = phone;
        this.email = email;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        User user = (User) o;
        return Double.compare(user.money, money) == 0 && name.equals(user.name) && dateOfBirth.equals(user.dateOfBirth) && status.equals(
                user.status) && phone.equals(user.phone) && email.equals(user.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, dateOfBirth, money, status, phone, email);
    }

    public boolean hasEnoughMoney(double price) {
        return money >= price;
    }

    @Override
    public String toString() {
        return status + " " + name + " " + dateOfBirth + " " + phone + " " + email + " количество денег " + money;
    }
}
