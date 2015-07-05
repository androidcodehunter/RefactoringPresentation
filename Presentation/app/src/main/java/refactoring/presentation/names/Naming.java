package refactoring.presentation.names;

/**
 * Created by Sharif on 2/15/2015.
 * Email: sharif.iit.du@gmail.com
 */
public class Naming {

    // We name our variables, functions, methods, classes and packages

    // Use intention revealing name

    void variableNaming(){
        String a = "Mukla.C";
        String b = "Sharifur";
        String c = "Orange";

        // we can write above name like this, it is more readable

        String nameOfMukla = "Mukla.C";
        String nameOfSharifur = "Sharifur";
        String nameOfOrange = "Orange";

        // more names here

        int d; // elapsed time in days

        // we can write more things here

        int elapsedTimeInDays;
        int daysSinceCreation;
        int daysSinceModification;
        int fileAgeInDays;


        // boolean naming
        boolean x = true;
        boolean isSwitchedOn = true;

        boolean mySwitch = true;

        if (mySwitch == isSwitchedOn){
            //
        }

        // some improvement
        
        if (isSwitchedOn()){

        }
    }

    // Give Meaningful parameter name.
    static void copyCharBad(char a1[], char a2[]){
        for (int i = 0; i<a1.length; i++){
            a2[i] = a1[i];
        }
    }

    static void copyCharGood(char source[], char destination[]){
        for (int i = 0; i<source.length; i++){
            destination[i] = source[i];
        }
    }

    // Android naming convention. You should follow what is following current developer community
    // We can search internet what is Java naming convention, PHP naming convention etc

    // private variable naming, we use m because in android m means member variable
    private String mNameOfAndroid = "Android";
    // public variable naming
    public String nameOfIPhone = "iPhone";
    // static filed should be upper case
    public static final int INVALID_ARGUMENT_CODE = 104;















    private boolean isSwitchedOn() {
        return true;
    }

}
