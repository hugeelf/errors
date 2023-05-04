import java.io.IOException;

public class MyArrayDataException extends Exception {
    public int errorI;
    public int errorJ;

    MyArrayDataException (String message,int firstIndex, int secondIndex){
        super(message);
        this.errorI=firstIndex;
        this.errorJ=secondIndex;
    }
}
