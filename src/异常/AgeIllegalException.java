package 异常;

public class AgeIllegalException extends Exception{
    public AgeIllegalException() {}

    public AgeIllegalException(String message) {
        super(message);
    }
}
