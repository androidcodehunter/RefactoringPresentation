package refactoring.presentation.comments;

/**
 * Created by Sharif on 2/15/2015.
 * Email: sharif.iit.du@gmail.com
 */
public class Comments {

    // We write comment cause for our failure to express our self in code

    // This code is confusing, I would better place a comment here, Please Stop here!!

    // Please clean your code before writing single line of comment


    // Programming is an art!! Explain yourself in code

    void getMonthlySalary(){

        if(isEligible){
            getSalaryWithBonus();
        }else {
            getNormalSalary();
        }

        //we can write it like this

        if(isEligibleForBonus()){
            getSalaryWithBonus();
        }else {
            getNormalSalary();
        }
    }



    // Sometimes comments are good

    // Here is an warning before running this code

    /**
     * Don't call this until you have lots of available memory in your phone.
     * Now-a-days camera can capture big size image. If we load 5 to 10 images, it can cause memory overflow exception.
     * */
    void showExtraLargeImages(){
    }

    // Javadocs in Public API. Don't confused with it. We should provide JavaDocs if we want to release anything for public use.
    // Or sometimes client pay for JavaDocs

    // Beginning programmer write Scary comments because they excited when they know the existing of JavaDocs
    // For an example
/*
    *//** The name *//*
    private String mName;
    *//** The version *//*
    private String mVersion;
    *//** The licence name *//*
    private String mLicenceName;*/


    // Please remove commented out code, it is duplicate code and very bad practice
    // You remove the code but still version control system store it. Copy the code whenever you need this code
    // But until remove the code please from here.

    //private String mVersion;
   // private String mLicenceName;




    private boolean isEligibleForBonus() {
        return true;
    }


    private void getNormalSalary() {
    }

    private void getSalaryWithBonus() {

    }

    boolean isEligible = true;
}
