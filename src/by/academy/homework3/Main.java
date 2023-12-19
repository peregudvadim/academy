package by.academy.homework3;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
public class Main {
    final static private Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Введите свое имя");
        String buyerName = scanner.nextLine();
        LocalDate buyerBirthdate = checkBirthDate();
        String buyerPhoneNumber = checkPhoneNumber();
        String buyerEmail = checkEmail();
        LocalDate sellerBirthDate = LocalDate.parse("19-06-1988", DateTimeFormatter.ofPattern("dd-MM-yyyy"));
        User buyer = new User("Покупатель", buyerName, 1000, buyerBirthdate, buyerPhoneNumber, buyerEmail);
        User seller = new User("Продавец", "Дмитрий", 1000, sellerBirthDate, "+1-212-555-7575", "dmitryShchepin@google.com");
        Container container = getProducts();
        System.out.println("===============================");
        System.out.println("Информация о сделке");
        Deal deal = new Deal(buyer, seller, container.getProducts(),LocalDate.now());
        deal.makeDeal();
        System.out.println("===============================");
        System.out.println(buyer);
        System.out.println(seller);
    }

    private static LocalDate checkBirthDate() {
        DateTimeFormatter formatter;
        LocalDate dateOfBirth;
        for (; ; ) {
            System.out.println("Введите свою дату рождения в формате (dd/MM/yyyy) или (dd-MM-yyyy)");
            String buyerDate = scanner.nextLine();
            Validator date = new DateValidate();
            Validator date2 = new DateValidate2();
            if (date.validate(buyerDate)) {
                formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
                dateOfBirth = LocalDate.parse(buyerDate, formatter);
                break;
            } else if (date2.validate(buyerDate)) {
                formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                dateOfBirth = LocalDate.parse(buyerDate, formatter);
                break;
            } else {
                System.out.println("Неверно введена дата");
            }
        }
        return dateOfBirth;
    }

    private static String checkPhoneNumber() {
        String buyerPhoneNumber;
        for (; ; ) {
            System.out.println("Введите номер телефона ");
            buyerPhoneNumber = scanner.nextLine();
            Validator number1 = new BelarusPhoneValidator();
            Validator number2 = new AmericanPhoneValidator();
            if (number1.validate(buyerPhoneNumber)) {
                break;
            } else if (number2.validate(buyerPhoneNumber)) {
                break;
            } else {
                System.out.println("Неправильно введен номер");
            }
        }
        return buyerPhoneNumber;
    }

    private static String checkEmail() {
        String buyerEmail;
        for (; ; ) {
            System.out.println("Введите email ");
            buyerEmail = scanner.nextLine();
            Validator email = new EmailValidator();
            if (email.validate(buyerEmail)) {
                break;
            } else {
                System.out.println("Неправильно введен адрес почты");
            }
        }
        return buyerEmail;
    }

    private static Container getProducts() {
        Container container = new Container();
        int quantity;
        int index;
        boolean cycle=true;
        System.out.println("Сегодня в продаже");
        System.out.println("1-Помидоры, 2-Огурцы, 3-Яблоки      0-остановить");
       while (cycle) {
            String sort = scanner.next();
            switch (sort) {
                case "1":
                    System.out.println("В количестве?");
                    quantity = scanner.nextInt();
                    System.out.println("Вы выбрали помидор красный в количестве " + quantity);
                    container.add(new Tomato("Помидор", "красный", quantity,10));
                    continue;
                case "2":
                    System.out.println("В количестве?");
                    quantity = scanner.nextInt();
                    System.out.println("Вы выбрали огурец колючий в количестве " + quantity);
                    container.add(new Cucumber("Огурец", "колючий", quantity,15));
                    continue;
                case "3":
                    System.out.println("В количестве?");
                    quantity = scanner.nextInt();
                    System.out.println("Вы выбрали Яблоко Беларусь в количестве " + quantity);
                    container.add(new Apple("Яблоко", "Беларусь", quantity,12));
                    continue;
                case "0":
                    cycle = false;
                    continue;
                default :
                        System.out.println("Что-то не то нажалось");

            }
        }

        System.out.println("\nИтак вы выбрали");
        container.printProducts();
        System.out.println("Надо ли удалить позиции?  1-да, 0-нет");
        String position = scanner.next();
        if (position.equals("1")) {
            System.out.println("Введите позиции для отмены   0-стоп");
            container.printProducts();
            for (;;) {
                index = scanner.nextInt();
                if (index == 0) {
                    break;
                } else {
                    container.delete(index - 1);
                }
            }
        }
        return container;
    }
}
