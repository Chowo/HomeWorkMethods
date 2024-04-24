import java.time.LocalDate;

public class Main {

    //Task 01
    public static void checkLeapYear(int year) {
        if (year % 100 == 0 && year % 400 != 0 || year % 4 != 0) {
            System.out.printf("%s год - не високосный год\n", year);
        } else {
            System.out.printf("%s год - високосный год\n", year);
        }
    }

    //Task 02
    public static void checkSystem(int systemType, int deviceReleaseYear) {
        int currentYear = LocalDate.now().getYear();
        if (systemType == 0) {
            if (deviceReleaseYear >= currentYear) {
                System.out.println("Установите версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            }
        } else {
            if (deviceReleaseYear >= currentYear) {
                System.out.println("Установите версию приложения для Android по ссылке");
            } else {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            }
        }
    }

    //Task 03
    public static void checkDeliveryTime(int distance) {
        int deliveryTime = 0;
        if (distance > 100) {
            System.out.println("Доставки нет");
            return;
        }
        if (distance > 0) {
            deliveryTime++;
        }
        if (distance > 20) {
            deliveryTime++;
        }
        if (distance > 60) {
            deliveryTime++;
        }
        System.out.printf("Потребуется дней: %s\n", deliveryTime);
    }

    public static void main(String[] args) {
        //Task 01
        System.out.println("Task 01");
        checkLeapYear(1924);
        checkLeapYear(1920);
        checkLeapYear(1900);

        //Task 02
        System.out.println("Task 02");
        checkSystem(0, 2025);
        checkSystem(1, 2012);
        checkSystem(1, 2024);

        //Task 03
        System.out.println("Task 03");
        checkDeliveryTime(15);
        checkDeliveryTime(45);
        checkDeliveryTime(75);
        checkDeliveryTime(101);
    }
}
