package tasks.level1.sublevel1;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
	System.out.println("Ведите строку");
	String number = scanner.nextLine();
	char[] numberStringToArray = number.toCharArray();
	System.out.println("Последний символ строки:" + numberStringToArray[numberStringToArray.length -1]);
	}
}
