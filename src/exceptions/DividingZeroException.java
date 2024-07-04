package exceptions;

public class DividingZeroException extends Exception{

    public DividingZeroException() {
        super("Нельзя делить на ноль!");
    }
}