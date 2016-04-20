package tests;

import android.test.ActivityInstrumentationTestCase2;

import com.android.lab3exercise.MainActivity;

/**
 * Created by Simon on 4/20/2016.
 */
public class JUnit_test extends ActivityInstrumentationTestCase2<MainActivity> {
    MainActivity mainActivity;

    public JUnit_test() {
        super(MainActivity.class);
    }

    public void test_first() {
        mainActivity = getActivity();

        assertEquals(mainActivity.add(2,4), 6);
        assertEquals(mainActivity.add(1,3), 4);
    }
}
