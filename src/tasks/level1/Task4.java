import java.util.Scanner;

public class Task4 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); //Создаём сканнер
		int number;
		while (true) {
    			try {
				System.out.println("Ведите строку");
        			number = Integer.parseInt(scanner.nextLine()); //Если это число и оно целое, строка выполниться успешно
        			break; // выходим из цикла, если парсинг удался
    			} catch (NumberFormatException e) {
        			System.out.print("Это явно не число, попробуйте снова" + "\n"); //Повторим пока пользователь не введёт целое число
    			}
		}
		
		if (number == 0) {
    			System.out.println("Это ноль!");
		} else if (number % 2 == 0) {
    			System.out.println("Число чётное");
		} else {
    			System.out.println("Число не чётное");
		}
		scanner.close(); //закрываем бедный сканнер
	}
}