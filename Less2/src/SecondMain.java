public class SecondMain {
    public static void main(String[] args) {
        int[] intArray = null;
        try {
            int d = 0;
            double catchedRes1 = intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);

        } catch (NullPointerException e) {
            System.out.println("Массив пуст, Карл!");

        } catch (IndexOutOfBoundsException e) {
            System.out.println("Массив не имеет 8-го элемента");

        } catch (ArithmeticException e) {
            System.out.println("Catching exception: " + e);
        }

    }
}
