public class Main {
    public static void main(String[] args) {
        Integer[] array = {1, 2, 3, null, 5, 6, 7, null, 8};
        Integer[] leftArray = {1,2,3,4,5,6,7};
        Integer[] rightArray = {9,8,7,6,5,4,3};
        Integer[] sum = sumOfArrays(leftArray, rightArray);
        printArray(sum);
        checkArray(array);
    }
    public static void printArray(Integer[] array){
        for (int i =0; i<array.length; i++){
            System.out.printf("%d ", array[i]);
        }
    }
    private static Integer[] sumOfArrays(Integer[] leftArray, Integer[] rightArray) {
        Integer[] result = new Integer[leftArray.length];
        if (leftArray==null || rightArray==null){
            System.out.println("Имеются пустые массивы");
        }
        if (leftArray.length != rightArray.length){
            System.out.println("Массивы имеют разную длину");
        }else{

            for (int i = 0; i<leftArray.length; i++){
                result[i] = leftArray[i]+rightArray[i];
            }
        }
        return result;
    }

    private static void checkArray(Integer[] array) {
        if (array == null) {
            System.out.println("Массив пуст, нужно больше элементов");
        } else {
            for (int i = 0; i < array.length; i++) {
                if (array[i] == null) {
                    System.out.printf("Null встретился в ячейке %d с индексом %d\n", i + 1, i);
                }
            }
        }
    }
}