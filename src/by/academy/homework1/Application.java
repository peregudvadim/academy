//created by Vadim Peregud
package by.academy.homework1;

public class Application {
    public static void main(String[] args) {
        Cat cat1 = new Cat(5);
        Cat cat2 = new Cat(9, "Барсик");
        cat2.eat();
        cat2.sleep();
        cat2.walk();
        cat1.grow();
        cat1.grow();
        cat1.grow();
        System.out.println("Коту без имени исполнилось " + cat1.age + " лет");
        cat2.initials = cat2.nickname.charAt(0);
        System.out.println("Первая буква в имени кота " + cat2.nickname + " ' " + cat2.initials + " ' ");
        cat1.setHomeAnimal(false);
        cat2.setHomeAnimal(true);
    }
}

class Cat {
    int age;
    String nickname;
    double money;
    char initials;
    boolean isHomeAnimal;

    public boolean isHomeAnimal() {
        return isHomeAnimal;
    }

    public void setHomeAnimal(boolean homeAnimal) {
        isHomeAnimal = homeAnimal;
        if (isHomeAnimal) {
            System.out.println(nickname + " является домашним котом");
        } else {
            System.out.println("Кот без имени абсолютно дикий");
        }
    }

    public char getInitials() {
        return initials;
    }

    public void setInitials(char initials) {
        this.initials = initials;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public Cat() {
    }

    public Cat(int age2, String nickname2) {
        age = age2;
        nickname = nickname2;
    }

    public Cat(String nickname2) {
        nickname = nickname2;
    }

    Cat(int age2) {
        age = age2;
    }

    public void grow() {
        age++;
    }

    public void sleep() {
        System.out.println("кот " + nickname + " спит");
    }

    public void eat() {
        System.out.println("кот " + nickname + " ест");
    }

    public void walk() {
        System.out.println("кот " + nickname + " гуляет");
    }
}





