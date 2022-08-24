import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        printLeapYear(2024);
        System.out.println();
        printClient(5, LocalDate.now().getYear());
        System.out.println();
        System.out.println("Потребуется дней: " + calculateDeliveryDays(78));

    }

    // Task 1
    private static void printLeapYear(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " високосный год");
        } else {
            System.out.println(year + " не високосный год");
        }
    }
    // Task 2
    private static void printClient(int oc, int currentYear) {
            switch (oc) {
                case 1 :
                    if (currentYear >= 2015) {
                    System.out.println("Установите версию приложения для Android по ссылке.");
                    } else {
                    System.out.println("Установите облегченную версию приложения для Android по ссылке.");
                    }
                break;
                case 0 :
                    if (currentYear >= 2015) {
                        System.out.println("Установите версию приложения для iOS по ссылке.");
                    } else {
                        System.out.println("Установите облегченную версию приложения для iOS по ссылке.");
                    }
                break;
                default :
                    System.out.println("Ошибка!");
            }

    }
    // Task 3
    private static int calculateDeliveryDays(int deliveryDistance) {
        int timeDelivery = 0;
        if (deliveryDistance <= 20 && deliveryDistance >0) {
            timeDelivery = 1;
        }
        if (deliveryDistance > 20 && deliveryDistance <= 60) {
            timeDelivery = 2;
        }
        if (deliveryDistance > 60 && deliveryDistance <= 100) {
            timeDelivery = 3;
        }
        return timeDelivery;
    }
}