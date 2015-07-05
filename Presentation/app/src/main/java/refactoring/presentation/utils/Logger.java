package refactoring.presentation.utils;

import android.util.Log;

/**
 * Created by Sharif on 2/15/2015.
 */
public class Logger {
    public static final String TAG="ERROR LOG: ";


    public static void Log(String errorMessage){
        Log.e(TAG, errorMessage);
    }

}
