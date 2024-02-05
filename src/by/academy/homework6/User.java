//created by Vadim Peregud
package by.academy.homework6;

import java.io.Serializable;

public class User implements Serializable {
    private final String firstName;
    private final String lastName;
    private final int age;

    public User(String name, String surname, int age) {
        this.firstName = name;
        this.lastName = surname;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }
}
