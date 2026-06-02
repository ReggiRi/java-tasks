package tasks.level1.sublevel2;

import java.util.Scanner;

public class Task1 {
	public static void main(String[] args) { 
		Scanner scanner = new Scanner(System.in);
		System.out.println("Введите число");
		String number = scanner.nextLine();
		if (number.charAt(0)== '-'){
    		System.out.println("Первая цифра числа: " + number.charAt(1));
		} else {
    		System.out.println("Первая цифра числа: " + number.charAt(0));
		}
	} 
}
