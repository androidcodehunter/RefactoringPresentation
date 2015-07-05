package refactoring.presentation.exceptions;

import android.os.Message;

import refactoring.presentation.utils.Logger;

/**
 * Created by Sharif on 2/15/2015.
 */
public class UnCheckedException {

    public static final int INVALID_MESSAGE = 0;
    public static final int INVALID_MESSAGE_CODE = 101;

    // Throw exception whenever it happens
    public static void loadUserDataBad(String userName) {

        String userData = "";

        switch (userName) {
            case "NaharApu":
                userData = "Awesome Nahar Apu :)";
                break;
            case "Sharif":
                userData = "Hashi Khushi Sharif :)";
                break;
            default:

                break;
        }

        printUserDateToConSole(userData);

    }

    /**
     * Throw exception whenever it happens
     */
    public static void loadUserDataGood(String userName) {

        String userData = "";

        switch (userName) {
            case "NaharApu":
                userData = "Awesome Nahar Apu";
                break;
            case "Sharif":
                userData = "Hashi Khushi Sharif";
                break;
            default:
                throw new IllegalArgumentException("Entered Argument is Invalid" + userName);
        }

        printUserDateToConSole(userData);

    }


    // Use Exceptions Rather Than Return Codes

    public void sendMessageBad(){
        Message message = getMessage();

        if (message.what != INVALID_MESSAGE){
            runMessage();
        }else{
            Logger.Log("Invalid message for "+ INVALID_MESSAGE_CODE);
        }
    }


    // If you throw Exception than client will know what problem is happen inside your code

    public void sendMessageGood() throws InvalidMessageError{
        Message message = getMessage();

        if (message.what != INVALID_MESSAGE){
            runMessage();
        }else{
            throw new InvalidMessageError("Invalid message for " + INVALID_MESSAGE_CODE);
        }
    }

    // Good method throws exception so you should handle try and catch other than
    // compiler must give you warning
    void clientCall(){
        try {
            sendMessageGood();
        } catch (InvalidMessageError invalidMessageError) {
            Logger.Log("Invalid message for "+ invalidMessageError);
        }
    }




    private static void printUserDateToConSole(String userData) {
    }

    private Message getMessage() {
        return Message.obtain();
    }
    private void runMessage() {}
}
