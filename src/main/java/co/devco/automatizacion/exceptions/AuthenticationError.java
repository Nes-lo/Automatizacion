package co.devco.automatizacion.exceptions;

public class AuthenticationError extends AssertionError {

    public static final String MESSAGE_FAILED_AUTHENTICATION="Authentication Failed";


    public AuthenticationError(String message, Throwable cause) {
        super(message, cause);
    }
}
