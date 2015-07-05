package refactoring.presentation.myswitchcase.refactored;

import android.support.v4.app.Fragment;

import java.util.HashMap;
import java.util.Map;

import refactoring.presentation.myswitchcase.ScreenOne;
import refactoring.presentation.myswitchcase.ScreenThree;
import refactoring.presentation.myswitchcase.ScreenTwo;

/**
 * Created by Sharif on 2/14/2015.
 * Email: sharif.iit.du@gmail.com
 */
public class ScreenFactory {

    private static final Map<Integer, Fragment> spinnerFragments = new HashMap<>();

    private static Map<Integer, Fragment> getSpinnerFragments() {
        spinnerFragments.put(0, new ScreenOne());
        spinnerFragments.put(1, new ScreenTwo());
        spinnerFragments.put(2, new ScreenThree());
        spinnerFragments.put(3, new ScreenOne());
        return spinnerFragments;
    }




    public static Fragment createScreen(int position){
      return getSpinnerFragments().get(position);
    }

}
