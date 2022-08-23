import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        isLeapYear(2024);
        System.out.println();
        getClient(1, LocalDate.now().getYear());
        System.out.println();
        timeOfDelivery(45);

    }

    // Task 1
    public static void isLeapYear(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " високосный год");
        } else {
            System.out.println(year + " не високосный год");
        }
    }
    // Task 2
    public static void getClient(int oc, int currentYear) {
            if (oc == 1) {
                if (currentYear >= 2015) {
                    System.out.println("Установите версию приложения для Android по ссылке.");
                } else {
                    System.out.println("Установите облегченную версию приложения для Android по ссылке.");
                }
            } else if (currentYear >= 2015) {
                System.out.println("Установите версию приложения для iOS по ссылке.");
            } else {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке.");
            }
    }
    // Task 3
    public static void timeOfDelivery(int deliveryDistance) {

        if (deliveryDistance <= 20 && deliveryDistance >0) {
            System.out.println("Потребуется дней: 1");
        }
        if (deliveryDistance > 20 && deliveryDistance <= 60) {
            System.out.println("Потребуется дней: 2");
        }
        if (deliveryDistance > 60 && deliveryDistance <= 100) {
            System.out.println("Потребуется дней: 3");
        }
    }
}