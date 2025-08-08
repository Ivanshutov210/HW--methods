//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    }

    // Задача 1
    public static void calculateLeapYear(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " год — високосный год");
        } else {
            System.out.println(year + " год — невисокосный год");
        }
    }

    // Задача 2
    public static void installingOsAndYear(int clientOs, int clientDeviceYear) {
        if (clientOs == 0 && clientDeviceYear < 2025) {
            System.out.println("Установите облегченную версию приложения для системы iOS по ссылке");
        } else if (clientOs == 0) {
            System.out.println("Установите приложения для системы iOS по ссылке");
        }
        if (clientOs == 1 && clientDeviceYear < 2025) {
            System.out.println("Установите облегченную версию приложения для системы Android по ссылке");
        } else if (clientOs == 1) {
            System.out.println("Установите приложения для системы Android по ссылке");
        }
    }
}
