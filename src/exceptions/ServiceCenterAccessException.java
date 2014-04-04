package exceptions;

public class ServiceCenterAccessException extends Exception {
    public ServiceCenterAccessException(String message) {
        super(message);
    }

    public ServiceCenterAccessException(String message, Throwable cause) {
        super(message, cause);
    }
}
