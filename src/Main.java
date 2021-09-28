import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.ROOT);

        int x = readNumber("Введите количество команды N = ");
        checkNum(x);
        int y = readNumber("Введите количество очков команды M = ");
        checkNum(y);
        if (x > y) {
            System.out.println("Количество очков команды N = 3, количество очков команды M = 0");
        }
        else if (x < y) {
            System.out.println("Количество очков команды N = 0, количество очков команды M = 3");
        }
        else {
            System.out.println("Количество очков команды N = 1, количество очков команды M = 1");
        }

    }
        static int readNumber(String text){
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
}