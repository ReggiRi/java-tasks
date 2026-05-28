import java.util.Scanner;

public class Task5 {
	public static void main(String[] args) { 
		Scanner scanner = new Scanner(System.in); //Создаём сканнер
		System.out.println("Ввдите первое число");
		String number1 = scanner.nextLine();
		System.out.println("Ведите второе число");
		String number2 = scanner.nextLine();
		char firstDigit1 = number1.charAt(0) == '-' ? number1.charAt(1) : number1.charAt(0);
		char firstDigit2 = number2.charAt(0) == '-' ? number2.charAt(1) : number2.charAt(0);

		if (firstDigit1 == firstDigit2) {
    			System.out.println("Первые цифры чисел совпадают!");	
		} else {
    			System.out.println("Первые цифры чисел не совпадают!");	
		}
	}
}