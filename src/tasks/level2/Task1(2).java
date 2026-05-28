import java.util.Scanner;

public class Task1(2) {
	public static void main(String[] args) { 
		Scanner scanner = new Scanner(System.in); //Создаём сканнер
		System.out.println("Введите число");
		String number = scanner.nextLine();
		if (number.charAt(0)== '-'){
    		System.out.println("Первая цифра числа: " + number.charAt(1));
		} else {
    		System.out.println("Первая цифра числа: " + number.charAt(0));
		}
	} 
}