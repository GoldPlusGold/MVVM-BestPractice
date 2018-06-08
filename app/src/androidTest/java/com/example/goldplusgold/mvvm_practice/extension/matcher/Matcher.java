package com.example.goldplusgold.mvvm_practice.extension.matcher;

import android.view.View;

import org.hamcrest.Description;
import org.hamcrest.TypeSafeMatcher;


public class Matcher {

    public static org.hamcrest.Matcher<View> withIndex(final org.hamcrest.Matcher<View> matcher, final int index) {
        return new TypeSafeMatcher<View>() {
            int currentIndex = 0;

            @Override
            public void describeTo(Description description) {
                description.appendText("with index: ");
                description.appendValue(index);
                matcher.describeTo(description);
            }

            @Override
            public boolean matchesSafely(View view) {
                return matcher.matches(view) && currentIndex++ == index;
            }
        };
    }

}
