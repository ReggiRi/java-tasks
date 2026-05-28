import java.util.Scanner;

public class Task2 {
	public static void main(String[] args) { 
		Scanner scanner = new Scanner(System.in); //Создаём сканнер
		System.out.println("Введите число");
		String number = scanner.nextLine();
		System.out.println("Последняя цифра числа: " + number.charAt(number.length()- 1));
	}
}