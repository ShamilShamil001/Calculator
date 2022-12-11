import java.util.Scanner;
public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int first;
        int second;
        String operator;

        System.out.print("Введите выражение: ");

        first = scanner.nextInt();
        operator = scanner.next();
        second = scanner.nextInt();

        if (operator.equals("*")){
            System.out.println(first * second);
        }
        else if (operator.equals("/")){
            System.out.println(first / second);
        }
        else if (operator.equals("+")){
            System.out.println(first + second);
        }
        else if (operator.equals("-")){
            System.out.println(first - second);
        }
        else
            System.out.println("Ошибка!");

    }
}