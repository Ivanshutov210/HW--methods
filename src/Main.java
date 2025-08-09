//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {


    public static void leapYear(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " год — високосный год");
        } else {
            System.out.println(year + " год — невисокосный год");
        }
    }

    public static void deviceYear (int clientOs, int deviceYear) {

        if (clientOs == 0 && deviceYear < 2025) {
            System.out.println("Установите облегченную версию приложение для системы iOS по ссылке");
        } else if (clientOs == 0) {
            System.out.println("Установите приложение для системы iOS по ссылке");
        }
        if (clientOs == 1 && deviceYear < 2025) {
            System.out.println("Установите облегченную версию приложение для системы Android по ссылке");
        } else if (clientOs == 1) {
            System.out.println("Установите приложение для системы Android по ссылке");
        }

    }

    public static void deliveryDistance(int deliveryDistance) {
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
        leapYear(2021);

        System.out.println("Задание 2");
        deviceYear(1,2014);

        System.out.println("Задание 3");
        deliveryDistance(95);
    }
}

