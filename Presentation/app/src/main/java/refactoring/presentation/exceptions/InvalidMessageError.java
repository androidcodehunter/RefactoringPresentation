package refactoring.presentation.exceptions;

/**
 * Created by Sharif on 2/15/2015.
 */
public class InvalidMessageError extends Exception{

    /**
     * Constructs a new {@code Exception} with the current stack trace and the
     * specified detail message.
     *
     * @param detailMessage
     *            the detail message for this exception.
     */
    public InvalidMessageError(String detailMessage) {
        super(detailMessage);
    }
}
