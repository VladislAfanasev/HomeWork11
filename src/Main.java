import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        // Задача №1.
        int year = 2021;
        findOutLeapYear(year);
        // Задача №2.
        int currentYear = LocalDate.now().getYear();
        byte clientOS = 1;
        int clientDeviceYear = 2023;
        adviseUpgrate(clientOS, clientDeviceYear, currentYear);
        // Задача №3.
        char deliveryDistance = 65;
        byte aDay = 1;
        byte twoDays = 2;
        byte threeDays = 3;
        printDeliveryDays(deliveryDistance, aDay, twoDays, threeDays);
    }

    // Задача №1. Определить является ли год високосным
    public static void findOutLeapYear(int year) {
        System.out.println("Задача №1.");
        if (year >= 1584) {
            if (year % 400 == 0) {
                System.out.println(year + " год является високосным");
            } else if (year % 4 == 0 && year % 100 != 0) {
                System.out.println(year + " год является високосным");
            } else {
                System.out.println(year + " год не является високосным");
            }
        } else {
            System.out.println(year + " год не является високосным");
        }
        System.out.println();
    }

    // Задача №2. Предлагать клиенту обновление в зависимости от года выпуска телефона и его ОС
    public static void adviseUpgrate(byte clientOS, int clientDeviceYear, int currentYear) {
        System.out.println("Задача №2");
        if (clientDeviceYear == currentYear) {
            if (clientOS == 0) {
                System.out.println("Установите версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите версию приложения для Android по ссылке");
            }
        } else if (clientDeviceYear < currentYear) {
            if (clientOS == 0) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            }
        }
        System.out.println();
    }

    // Задача №3. Вывести на консоль количество дней для доставки
    public static void printDeliveryDays(char deliveryDistance, byte aDay, byte twoDays, byte threeDays) {
        System.out.println("Задача №3.");
        if (deliveryDistance <= 100) {
            if (deliveryDistance > 60) {
                System.out.println("Потребуется дней: "+threeDays);
            } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
                System.out.println("Потребуется дней: "+twoDays);
            } else {
                System.out.println("Потребуется дней: "+aDay);
            }
        } else {
            System.out.println("К сожалению, в вашем районе доставка не работает");
        }
    }

}