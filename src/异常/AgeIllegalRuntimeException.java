package 异常;

public class AgeIllegalRuntimeException extends RuntimeException{
    public AgeIllegalRuntimeException() {}

    public AgeIllegalRuntimeException(String message) {
        super(message);
    }

}
