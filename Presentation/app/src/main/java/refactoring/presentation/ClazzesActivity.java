package refactoring.presentation;

import android.app.Activity;
import android.content.Intent;

import refactoring.presentation.myswitchcase.ScreenOne;
import refactoring.presentation.myswitchcase.ScreenThree;
import refactoring.presentation.myswitchcase.ScreenTwo;

/**
 * Created by Sharif on 2/15/2015.
 */
public class ClazzesActivity extends Activity {

    void clickedButtonOneBad(){
        Intent intent =  new Intent(this, ScreenOne.class);
        startActivity(intent);
    }

    void clickedButtonTwoBad(){
        Intent intent =  new Intent(this, ScreenTwo.class);
        startActivity(intent);
    }


    void clickedButtonThreeBad(){
        Intent intent =  new Intent(this, ScreenThree.class);
        startActivity(intent);
    }




    /**
     * A generic method to Launch a class by name.
     *
     * @param clasz
     */
    private void launchClass(Class<?> clasz) {
        final Intent intent = new Intent(this, clasz);
        startActivity(intent);
    }



    void clickedButtonOneGood(){
        launchClass(ScreenOne.class);
    }

    void clickedButtonTwoGood(){
        launchClass(ScreenTwo.class);
    }


    void clickedButtonThreeGood(){
        launchClass(ScreenThree.class);
    }



}
