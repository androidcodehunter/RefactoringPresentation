package refactoring.presentation.myswitchcase;

import android.support.v4.app.Fragment;

import refactoring.presentation.myswitchcase.refactored.ScreenFactory;

/**
 * Created by Sharif on 2/14/2015.
 * Email: sharif.iit.du@gmail.com
 */
public class SwitchTest {

    public void onSpinnerItemSelectedExampleOne(int position){

        Fragment fragment = null;

        if (position== 0){
            fragment = new ScreenOne();
        }else if (position == 1){
            fragment = new ScreenTwo();
        }else if(position==2){
            fragment = new ScreenThree();
        }

        else{
            throw new IllegalArgumentException("Can't instantiate Fragment"+ fragment.getClass().getName());
        }

        showFragment(fragment);

    }

    public void onSpinnerItemSelectedExampleTwo(int position){

        Fragment fragment = null;

        switch (position){
            case 0:
                fragment = new ScreenOne();
                break;
            case 1:
                fragment = new ScreenTwo();
                break;
            case 2:
                fragment = new ScreenThree();
                break;
            default:
                throw new IllegalArgumentException("Can't instantiate Fragment"+ fragment.getClass().getName());

        }
        showFragment(fragment);

    }


    public void onSpinnerItemSelectedExampleThree(int position){

        Fragment fragment = ScreenFactory.createScreen(position);

        showFragment(fragment);
    }


    private void showFragment(Fragment fragment) {
        // here we load our fragment
    }

}
