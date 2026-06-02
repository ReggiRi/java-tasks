package tasks.level1.sublevel1;

import java.util.Scanner;

public class Task4 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int number;
		while (true) {
    			try {
				System.out.println("Ведите строку");
        			number = Integer.parseInt(scanner.nextLine());
        			break;
    			} catch (NumberFormatException e) {
        			System.out.print("Это явно не число, попробуйте снова" + "\n");
    			}
		}
		
		if (number == 0) {
    			System.out.println("Это ноль!");
		} else if (number % 2 == 0) {
    			System.out.println("Число чётное");
		} else {
    			System.out.println("Число не чётное");
		}
		scanner.close();
	}
}
