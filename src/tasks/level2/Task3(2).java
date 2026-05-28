import java.util.Scanner;

public class Task3(2) {
	public static void main(String[] args) { 
		Scanner scanner = new Scanner(System.in); //Создаём сканнер
		System.out.println("Введите число");
		String number = scanner.nextLine();
		System.out.println("Сумма первой и последней цифр: " + (Character.getNumericValue(number.charAt(number.charAt(0) == '-' ? 1 : 0)) + Character.getNumericValue(number.charAt(number.length() - 1))));
	}
}