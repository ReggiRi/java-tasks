import java.util.Scanner;

public class Task4(2) {
	public static void main(String[] args) { 
		Scanner scanner = new Scanner(System.in); //Создаём сканнер
		System.out.println("Введите число");
		String number = scanner.nextLine();
		if (number.charAt(0) == '-'){
		System.out.println("Число цифр в числе: " + (number.length() - 1));			
		} else {
		System.out.println("Число цифр в числе: " + number.length());
		}		
	}
}