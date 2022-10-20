import java.time.LocalDate;
public class Main {
	public static int definingLeapYear(int currentYear) {
		int year1 = currentYear % 4;
		int year2 = currentYear % 100;
		int year3 = currentYear % 400;
		if (currentYear > 0 && year3 == 0) {
			System.out.println(currentYear + " год является високосным");
		} else if (currentYear > 0 && year2 == 0) {
			System.out.println(currentYear + " год не является високосным");
		} else if (currentYear > 0 && year1 != 0) {
			System.out.println(currentYear + " год не является високосным");
		} else if (currentYear > 0 && year1 == 0) {
			System.out.println(currentYear + " год является високосным");
		}
		return currentYear;
	}
	public static void defineOS(int clientDeviceYear, int clientOS) {
		if (clientOS == 0 && clientDeviceYear >= 2015) {
			System.out.println("Установите версию приложения для iOS по ссылке");
		} else if (clientOS == 0 && clientDeviceYear < 2015) {
			System.out.println("Установите облегченную версию приложения для iOS по ссылке");
		}
		if (clientOS == 1 && clientDeviceYear >= 2015) {
			System.out.println("Установите версию приложения для Android по ссылке");
		} else if (clientOS == 1 && clientDeviceYear < 2015) {
			System.out.println("Установите облегченную версию приложения для Android по ссылке");
		}
	}
	public static int defineDaysForDelivery(int deliveryDistance) {
		int daysForDelivery = 1;
		if (deliveryDistance < 20) {
			System.out.println("Потребуется дней: " + daysForDelivery);
		} else if (deliveryDistance < 60) {
			daysForDelivery = daysForDelivery + 1;
			System.out.println("Потребуется дней: " + daysForDelivery);
		} else if (deliveryDistance < 100) {
			daysForDelivery = daysForDelivery + 2;
			System.out.println("Потребуется дней: " + daysForDelivery);
		}
		return daysForDelivery;
	}
	public static void main(String[] args) {
		System.out.println("Задание 1");
		definingLeapYear(1200);
		System.out.println("Задание 2");
		int currentYear = 2014;
		int number = 0;
		defineOS(currentYear, number);
		System.out.println("Задание 3");
		defineDaysForDelivery(59);
	}
}
