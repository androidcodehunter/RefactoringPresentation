package refactoring.presentation;

/**
 * Created by Sharif on 2/15/2015.
 */
public class Conditionals {


    void getUserResultBad() {

        if (isResultTrue) {
            if (resultScore > 10) {
                printResult();
            } else {
                // you are failed
            }
        }

    }


    void getUserResultGood() {

        if (isResultTrue && resultScore > 10) {
            printResult();
        } else {
            // you are failed
        }

    }


    void duplicateCodeInConditionBad() {

        String result = "";


        if (isFailedInExam) {
            result = "sad";
            sendResultToParents(result);
        } else if (isPassed) {
            result = "happy";
            sendResultToParents(result);
        } else {
            result = "Nothing!!";
            sendResultToParents(result);
        }


    }

    void duplicateCodeInConditionGood() {

        String result = "";

        if (isFailedInExam) {
            result = "sad";
        } else if (isPassed) {
            result = "happy";
        } else {
            result = "Nothing!!";
        }

        sendResultToParents(result);

    }


    int extraConditionalFlagBad() {

        boolean isFoundNumber = true;

        int result = 0;

        for (int i = 0; i < 100; i++) {
            if (isFoundNumber) {
                result = result + i;
                if (result == 20) {
                    isFoundNumber = false;
                }
            }
        }
        return result;

    }



    int extraConditionalFlagGood(){
        int result = 0;

        for (int i = 0; i < 100; i++) {
            result = result + i;
            if (result == 20) {
                return result;
            }
        }

        return result;
    }


    private void sendResultToParents(String result) {

    }


    private void printResult() {

    }


    private boolean isResultTrue = true;
    private int resultScore = 98;
    private boolean isFailedInExam;
    private boolean isPassed;
}
