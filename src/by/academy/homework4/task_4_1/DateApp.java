//created by Vadim Peregud
package by.academy.homework4.task_4_1;

import java.time.LocalDate;

public class DateApp {
    public static void main(String[] args) {
        CustomDate customDate = new CustomDate("24-01-1999");
        System.out.println(customDate.getDate());
        CustomDate customDate1 = new CustomDate();
        customDate1.setNewDate(LocalDate.now());
        System.out.println(customDate1.getDate());
        customDate.printDayOfWeek();
        customDate.calculateInterval(customDate.getDate(), customDate1.getDate());
        customDate.isLeapYear();
        CustomDate customDateNEW = new CustomDate().newMethod();
        customDateNEW.calculateInterval(customDate.getDate(), customDateNEW.getDate());

    }
}
