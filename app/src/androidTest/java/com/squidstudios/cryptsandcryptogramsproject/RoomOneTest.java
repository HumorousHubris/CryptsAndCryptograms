package com.squidstudios.cryptsandcryptogramsproject;


import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;

import androidx.test.espresso.ViewInteraction;
import androidx.test.filters.LargeTest;
import androidx.test.rule.ActivityTestRule;
import androidx.test.runner.AndroidJUnit4;

import org.hamcrest.Description;
import org.hamcrest.Matcher;
import org.hamcrest.TypeSafeMatcher;
import org.hamcrest.core.IsInstanceOf;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withClassName;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.Matchers.allOf;
import static org.hamcrest.Matchers.is;

@LargeTest
@RunWith(AndroidJUnit4.class)
public class RoomOneTest {

    @Rule
    public ActivityTestRule<MainActivity> mActivityTestRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void roomOneTest_displaysFragmentOnScreen() {
        ViewInteraction appCompatButton = onView(
                allOf(withId(R.id.btnLoad), withText("Load"),
                        childAtPosition(
                                childAtPosition(
                                        withClassName(is("androidx.constraintlayout.widget.ConstraintLayout")),
                                        0),
                                2),
                        isDisplayed()));
        appCompatButton.perform(click());

        ViewInteraction appCompatButton2 = onView(
                allOf(withId(R.id.RoomOne), withText("Room One"),
                        childAtPosition(
                                childAtPosition(
                                        withClassName(is("androidx.constraintlayout.widget.ConstraintLayout")),
                                        0),
                                0),
                        isDisplayed()));
        appCompatButton2.perform(click());

        ViewInteraction viewGroup = onView(
                allOf(childAtPosition(
                        childAtPosition(
                                withId(android.R.id.content),
                                0),
                        0),
                        isDisplayed()));
        viewGroup.check(matches(isDisplayed()));
    }

    @Test
    public void roomOneTest_displaysMessageFragmentOnScreen_EnsureTextIsWhatIsExpected() {
        ViewInteraction appCompatButton = onView(
                allOf(withId(R.id.btnLoad), withText("Load"),
                        childAtPosition(
                                childAtPosition(
                                        withClassName(is("androidx.constraintlayout.widget.ConstraintLayout")),
                                        0),
                                2),
                        isDisplayed()));
        appCompatButton.perform(click());

        ViewInteraction appCompatButton2 = onView(
                allOf(withId(R.id.RoomOne), withText("Room One"),
                        childAtPosition(
                                childAtPosition(
                                        withClassName(is("androidx.constraintlayout.widget.ConstraintLayout")),
                                        0),
                                0),
                        isDisplayed()));
        appCompatButton2.perform(click());

        ViewInteraction gifImageView = onView(
                allOf(withId(R.id.hamtaro),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                0),
                        isDisplayed()));
        gifImageView.perform(click());

        ViewInteraction textView = onView(
                allOf(withId(R.id.main_box_text), withText("Hamtaro, known in Japan as Trotting Hamtaro, is a Japanese children's manga and storybook series created and illustrated by Ritsuko Kawai. The manga is serialized in Shogakukan's all-girl's magazine Ciao in 1997, focusing on a hamster named Hamtaro who has a variety of adventures with other hamsters, known as \"Ham-Hams\" (\"Hamuchans\" in the Japanese version). "),
                        childAtPosition(
                                allOf(withId(R.id.message_fragment),
                                        childAtPosition(
                                                IsInstanceOf.<View>instanceOf(android.view.ViewGroup.class),
                                                0)),
                                1),
                        isDisplayed()));
        textView.check(matches(withText("Hamtaro, known in Japan as Trotting Hamtaro, is a Japanese children's manga and storybook series created and illustrated by Ritsuko Kawai. The manga is serialized in Shogakukan's all-girl's magazine Ciao in 1997, focusing on a hamster named Hamtaro who has a variety of adventures with other hamsters, known as \"Ham-Hams\" (\"Hamuchans\" in the Japanese version). ")));
    }


    private static Matcher<View> childAtPosition(
            final Matcher<View> parentMatcher, final int position) {

        return new TypeSafeMatcher<View>() {
            @Override
            public void describeTo(Description description) {
                description.appendText("Child at position " + position + " in parent ");
                parentMatcher.describeTo(description);
            }

            @Override
            public boolean matchesSafely(View view) {
                ViewParent parent = view.getParent();
                return parent instanceof ViewGroup && parentMatcher.matches(parent)
                        && view.equals(((ViewGroup) parent).getChildAt(position));
            }
        };
    }
}
