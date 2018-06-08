package com.example.goldplusgold.mvvm_practice;

import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.Espresso.pressBack;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.swipeDown;
import static android.support.test.espresso.action.ViewActions.swipeUp;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static com.example.goldplusgold.mvvm_practice.extension.matcher.Matcher.withIndex;

/**
 * Instrumented test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(AndroidJUnit4.class)
public class ExampleInstrumentedTest {

    @Rule
    public ActivityTestRule<MainActivity> mActivityRule = new ActivityTestRule<>(
            MainActivity.class);

    @Test
    public void testHomePageActivity() throws Exception {
        onView(withId(R.id.homePageButton)).perform(click());
        onView(withIndex(withId(R.id.refreshLayout), 0)).perform(swipeUp());
        onView(withIndex(withId(R.id.refreshLayout), 0)).perform(swipeDown());
        onView(withIndex(withId(R.id.refreshLayout), 0)).perform(swipeDown());
        onView(withId(R.id.articleButton1)).perform(click());
        onView(withIndex(withId(R.id.refreshLayout), 1)).perform(swipeUp());
        onView(withIndex(withId(R.id.refreshLayout), 1)).perform(swipeDown());
        onView(withIndex(withId(R.id.refreshLayout), 1)).perform(swipeDown());
        pressBack();
    }


}
