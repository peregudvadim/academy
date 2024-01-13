//created by Vadim Peregud
package by.academy.homework4.task_4_1;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;
import java.util.regex.Pattern;

public class CustomDate {
    private LocalDate date;
    private final Pattern pattern = Pattern.compile("\\d{2}-\\d{2}-\\d{4}");
    private final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

    public CustomDate() {
    }

    public CustomDate(String string) {
        if (isValidDate(string)) {
            this.date = LocalDate.parse(string, formatter);
        }
    }


    public boolean isValidDate(String string) {
        return pattern.matcher(string).matches();
    }


    public LocalDate getDate() {
        return date;
    }

    public void setNewDate(LocalDate date) {
        this.date = date;
    }

    public void printDayOfWeek() {
        System.out.println(date.getDayOfWeek());
    }

    public void calculateInterval(LocalDate date1, LocalDate date2) {
        long interval = ChronoUnit.DAYS.between(date1, date2);
        System.out.println("Interval between " + date1 + " and " + date2 + " is " + interval + " days");
    }

    public void isLeapYear() {
        System.out.println("is leap year " + date.getYear() + " " + date.isLeapYear());

    }

    public String setNewDate() {
        String date = "", scyear = "", scmonth = "", scday = "";
        Scanner scanner = new Scanner(System.in);
        for (; ; ) {
            for (; ; ) {
                System.out.println("Input year (yyyy)");
                scyear = scanner.next();
                if (Integer.parseInt(scyear) < 0 || scyear.length() != 4) {
                    System.out.println("Year can't be negative");
                } else break;
            }
            for (; ; ) {
                System.out.println("Input month (mm)");
                scmonth = scanner.next();
                if (Integer.parseInt(scmonth) < 1 || Integer.parseInt(scmonth) > 12 || scmonth.length() != 2) {
                    System.out.println("Value of month is too small or too large");
                } else break;
            }
            for (; ; ) {
                System.out.println("Input day (dd)");
                scday = scanner.next();
                if (Integer.parseInt(scday) < 1 || Integer.parseInt(scday) > 31 || scday.length() != 2) {
                    System.out.println("Value of day is too small or too large");
                } else if (scmonth.equals("04") || scmonth.equals("06") || scmonth.equals("09") || scmonth.equals("11")) {
                    if (Integer.parseInt(scday) > 30) {
                        System.out.println("There aren't that many days in this month");
                    } else break;
                } else break;
            }

            date = date.concat(scday).concat("-").concat(scmonth).concat("-").concat(scyear);
            if (isValidDate(date)) {
                scanner.close();
                break;
            } else System.out.println("Not validate. Repeat data entry");
            date = "";

        }
        return date;
    }

    CustomDate newMethod() {
        String date = this.setNewDate();
        CustomDate customDate3 = new CustomDate();
        Day day = new Day(Integer.parseInt(date.substring(0, 2)));
        Month month = new Month(Integer.parseInt(date.substring(3, 5)));
        Year year = new Year(Integer.parseInt(date.substring(6, 10)));


        customDate3.setNewDate(LocalDate.of(year.year, month.month, day.day));
        return customDate3;
    }

    class Year {
        int year;

        public Year(int year) {
            this.year = year;
        }

    }

    class Month {
        int month;

        public Month(int month) {
            this.month = month;
        }


    }

    class Day {
        int day;

        public Day(int day) {
            this.day = day;
        }

    }
}


