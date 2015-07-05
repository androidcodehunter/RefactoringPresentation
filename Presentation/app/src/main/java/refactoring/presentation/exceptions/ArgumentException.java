package refactoring.presentation.exceptions;
import static refactoring.presentation.exceptions.ArgumentException.ErrorCode.*;

/**
 * Created by Sharif on 2/15/2015.
 * Email: sharif.iit.du@gmail.com
 */
public class ArgumentException extends Exception{

    private char errorArgumentId = '\0';
    private String errorParameter = null;
    private ErrorCode errorCode = OK;

    public ArgumentException(){}

    public ArgumentException(ErrorCode errorCode){
        this.errorCode = errorCode;
    }

    public ArgumentException(ErrorCode errorCode, String errorParameter){
        this.errorCode = errorCode;
        this.errorParameter = errorParameter;
    }

    public ArgumentException(ErrorCode errorCode, char errorArgumentId ,
                             String errorParameter){
        this.errorCode = errorCode;
        this.errorArgumentId = errorArgumentId;
        this.errorParameter = errorParameter;
    }


    public ErrorCode getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(ErrorCode errorCode) {
        this.errorCode = errorCode;
    }

    public char getErrorArgumentId() {
        return errorArgumentId;
    }

    public String getErrorParameter() {
        return errorParameter;
    }

    public void setErrorArgumentId(char errorArgumentId) {
        this.errorArgumentId = errorArgumentId;
    }

    public void setErrorParameter(String errorParameter) {
        this.errorParameter = errorParameter;
    }


    public String errorMessage(){
        switch (errorCode){
            case OK:
                return "Should not get here.";
            case INVALID_INTEGER:
                return String.format("Arguemtn %c expects an integer but was %s", errorArgumentId, errorParameter);
        }

        return "";
    }



    public enum ErrorCode{
        OK, INVALID_ARGUMENT_FORMAT, UNEXPECTED_ARGUMENT, INVALID_ARGUMENT_NAME,
        MISSING_STRING,
        MISSING_INTEGER, INVALID_INTEGER,
        MISSING_DOUBLE, INVALID_DOUBLE
    }
}
