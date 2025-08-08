//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void checkLeapYear(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " год — високосный год");
        } else {
            System.out.println(year + " год — невисокосный год");
        }
    }

    public static void checkDeviceYear(int clientDeviceYear, int clientOS) {

        if (clientDeviceYear < 2015) {
            if (clientOS == 0) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке.");
            } else if (clientOS == 1) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке.");
            }
        } else {
            if (clientOS == 0) {
                System.out.println("Установите приложение для iOS по ссылке.");
            } else if (clientOS == 1) {
                System.out.println("Установите приложение для Android по ссылке.");
            }
        }
    }

    public static void checkDeliveryDistance(int deliveryDistance) {
        int total = 1;
        if (deliveryDistance < 20) {
            System.out.println("Потребуется дней: " + total);
        } else if (deliveryDistance >= 20 && deliveryDistance < 60) {
            total += 1;
            System.out.println("Потребуется дней: " + total);
        } else if  (deliveryDistance >= 60 && deliveryDistance < 100) {
            total += 2;
            System.out.println("Потребуется дней: " + total);
        } else {
            System.out.println("Свыше 100 км доставки нет.");
        }
    }

    public static void main(String[] args) {

        System.out.println("Задание 1");
        checkLeapYear(2021);

        System.out.println("\nЗадание 2");
        checkDeviceYear(2015, 1);

        System.out.println("\nЗадание 3");
        checkDeliveryDistance(95);
    }
}

