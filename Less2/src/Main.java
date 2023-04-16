import java.util.InputMismatchException;
import java.util.Scanner;

//Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float), и возвращает введенное значение.
//        Ввод текста вместо числа не должно приводить к падению приложения,
//        вместо этого, необходимо повторно запросить у пользователя ввод данных.
public class Main {
    public static void main(String[] args) {

        while (true) {
            try {
                System.out.println("Введите float число");
                float input = getFloatInput();
                showInputOfFloat(input);
            } catch (InputMismatchException e) {
                System.out.println("Введите число");
            }
        }
    }


    private static void showInputOfFloat(float input) {
        System.out.println(input);
    }

    private static float getFloatInput() {
        Scanner scanner = new Scanner(System.in);
        final float v = scanner.nextFloat();
        return v;
    }
}