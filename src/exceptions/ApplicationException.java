package exceptions;

public class ApplicationException extends ServiceCenterAccessException{
    public ApplicationException(String message) {
        super(message);
    }

    public ApplicationException(String message, Throwable cause) {
        super(message, cause);
    }
}
