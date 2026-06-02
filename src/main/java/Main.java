import java.lang.reflect.Method;
import java.util.Scanner;

public class Main {

    private static final String[][][] DESCRIPTIONS = new String[10][9][5];

    static {
        for (int l = 0; l < 10; l++)
            for (int s = 0; s < 9; s++)
                for (int t = 0; t < 5; t++)
                    DESCRIPTIONS[l][s][t] = "Задача ещё не решена";

        DESCRIPTIONS[0][0][0] = "Проверяет, положительное число или отрицательное";
        DESCRIPTIONS[0][0][1] = "Выводит последний символ строки";
        DESCRIPTIONS[0][0][2] = "Выводит последний символ строки через массив символов";
        DESCRIPTIONS[0][0][3] = "Определяет: число равно нулю, чётное или нечётное (с валидацией ввода)";
        DESCRIPTIONS[0][0][4] = "Сравнивает первые буквы двух слов";

        DESCRIPTIONS[0][1][0] = "Выводит первую цифру числа (с учётом знака минус)";
        DESCRIPTIONS[0][1][1] = "Выводит последнюю цифру числа";
        DESCRIPTIONS[0][1][2] = "Выводит сумму первой и последней цифр числа";
        DESCRIPTIONS[0][1][3] = "Выводит количество цифр в числе (без учёта знака минус)";
        DESCRIPTIONS[0][1][4] = "Сравнивает первые цифры двух чисел";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Выберите уровень (1-10):");
        int level = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Выберите подуровень (1-9):");
        int sublevel = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Выберите номер задачи (1-5):");
        int taskNumber = scanner.nextInt();
        scanner.nextLine();

        String description = DESCRIPTIONS[level - 1][sublevel - 1][taskNumber - 1];
        System.out.println("\n" + description);

        if (description.equals("Задача ещё не решена")) {
            scanner.close();
            return;
        }

        System.out.println("Запустить? (да/нет)");
        String answer = scanner.nextLine().trim().toLowerCase();

        if (!answer.equals("да")) {
            System.out.println("Отменено");
            scanner.close();
            return;
        }

        scanner.close();

        String className = "tasks.level" + level + ".sublevel" + sublevel + ".Task" + taskNumber;

        try {
            ProcessBuilder pb = new ProcessBuilder(
                "java", "-cp", "build/classes/java/main", className
            );
            pb.inheritIO();
            Process process = pb.start();
            process.waitFor();
        } catch (Exception e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
}
