import java.util.Scanner;
public class Test3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //Сканируем строку
	System.out.println("Ведите строку");
	String number = scanner.nextLine();
	char[] numberStringToArray = number.toCharArray(); //Строку в массив для дальнейшего извлечения последнего индекса
	System.out.println("Последний символ строки:" + numberStringToArray[numberStringToArray.length -1]); //Получеам последний символ через длинну массива
	}
}