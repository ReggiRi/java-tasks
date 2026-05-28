import java.util.Scanner;

public class Test5 {
	public static void main(String[] args) { 
		Scanner scanner = new Scanner(System.in); //Создаём сканнер
		System.out.println("Ввдите первое слово");
		String word1 = scanner.nextLine();
		System.out.println("Ведите второе слово");
		String word2 = scanner.nextLine();
		if (word1.charAt(0) == word2.charAt(0)) {
			System.out.println("Первые буквы слов совпадают!");	
		} else {
			System.out.println("Первые буквы слов не совпадают!");	
		}
	}
}