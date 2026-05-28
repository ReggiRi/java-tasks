import java.util.Scanner;
public class Test {
    public static void main(String[] args) {
        Scanner numberPlusOrMinus = new Scanner(System.in);
	System.out.println("Введите число");
	String numberChecerString = numberPlusOrMinus.nextLine();
	int numberChecer = Integer.parseInt(numberChecerString);
	if (numberChecer >= 0) {
		System.out.println("Число больше нуля");
		} else {
			System.out.println("Число меньше нуля");
		}
    }
}