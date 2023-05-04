
public class Main {
    public static void main(String[] args) {
        String[][] myArray = {{"1", "2", "3", "4"}, {"1", "2", "3", "4"}, {"1", "2", "3", "4"}};
        try {
            try {
                int result = sumOfArrayElements(myArray);
                System.out.println(result);
            } catch (MyArraySizeException e) {
                System.out.println(e.getMessage());
            }
        }catch (MyArrayDataException e){
            System.out.printf("%s [%d,%d]", e.getMessage(), e.errorI,e.errorJ);
        }
    }

    public static int sumOfArrayElements(String[][] arr) throws MyArraySizeException, MyArrayDataException {
        int answer = 0;
        if (arr.length!=4){
            throw new MyArraySizeException("Invalid array size");
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length != 4) {
                throw new MyArraySizeException("Invalid array size");
            }
            for (int j = 0; j < arr[i].length; j++) {
                try {
                    answer = answer + Integer.parseInt(arr[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException("Invalid data at:", i, j);
                }

            }

        }
        return answer;
    }
}

