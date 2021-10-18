import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.ROOT);

        int x = readNumber("Введите количество команды N = ");
        checkNum(x);
        int y = readNumber("Введите количество очков команды M = ");
        checkNum(y);
        Result end = compareNum(x, y);
        NumOfPoints(end);
    }

    static int readNumber(String text) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(text);
        return scanner.nextInt();
    }

    static void checkNum(int num) {
        if (num < 0) {
            System.out.print("Ошибка, введите число > 0");
            System.exit(0);
        }
    }

    static Result compareNum(int num1, int num2) {
        if (num1 > num2) {
            return Result.FirstTeamWin;
        } else if (num1 < num2) {
            return Result.FirstTeamLoose;
        } else {
            return Result.Draw;
        }
    }

    static void NumOfPoints(Result end) {
        switch (end) {
            case Draw -> System.out.println("Количество очков команды N = 1, количество очков команды M = 1");
            case FirstTeamLoose -> System.out.println("Количество очков команды N = 0, количество очков команды M = 3");
            case FirstTeamWin -> System.out.println("Количество очков команды N = 3, количество очков команды M = 0");
        }
    }
}
