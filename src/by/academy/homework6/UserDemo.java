//created by Vadim Peregud
package by.academy.homework6;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class UserDemo {
    public static void main(String[] args) {

        List<User> users = new ArrayList<>();
        users.add(new User("Polina", "Baranskaya", 25));
        users.add(new User("Lilia", "Vavilova", 38));
        users.add(new User("Semen", "Denischik", 22));
        users.add(new User("Sviatoslav", "Zuev", 30));
        users.add(new User("Sasha", "Ivchik", 29));
        users.add(new User("Nikita", "Kostylenko", 22));
        users.add(new User("Olesya", "Kurchevskaya", 27));
        users.add(new User("Vadim", "Peregud", 45));
        users.add(new User("Alexey", "Samatiya", 30));
        users.add(new User("John", "Galt", 35));

        File directory = new File("Users");
        if (!directory.exists()) {
            boolean dirCreated = directory.mkdir();
            System.out.println("result of creating directory '" + directory.getName() + "' is " + dirCreated);
        }

        for (User user : users) {
            String fileName = "Users/" + user.getFirstName() + "_" + user.getLastName() + ".txt";
            try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName))) {
                oos.writeObject(user);
            } catch (IOException e) {
                System.err.println(e.getMessage());
            }
            System.out.println(user.getFirstName() + " " + user.getLastName() + " was serialized");
        }
    }
}