package com.example.labtestpractice;

import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static org.junit.Assert.assertNotNull;

import androidx.test.core.app.ActivityScenario;
import androidx.test.espresso.Espresso;
import androidx.test.espresso.assertion.ViewAssertions;
import androidx.test.espresso.matcher.ViewMatchers;
import androidx.test.ext.junit.rules.ActivityScenarioRule;

import org.junit.Rule;
import org.junit.Test;

public class MainActivityTest {
    @Rule
    public ActivityScenarioRule<MainActivity> activityTestRule = new ActivityScenarioRule<>(MainActivity.class);

    @Test
    public void testButtonClickSquare() {
        Espresso.onView(withId(R.id.btnCreateSquare)).perform(click());
        Espresso.onView(ViewMatchers.withId(R.id.tvShapeInfo))
                .check(ViewAssertions.matches(ViewMatchers.withText("Shape: Square")));
        }
@Test
    public void testButtonClickCircle() {
    Espresso.onView(withId(R.id.btnCreateCircle)).perform(click());
    Espresso.onView(ViewMatchers.withId(R.id.tvShapeInfo))
            .check(ViewAssertions.matches(ViewMatchers.withText("Shape: Circle")));
}
@Test
    public void testButtonClickTriangle() {
    Espresso.onView(withId(R.id.btnCreateTriangle)).perform(click());
    Espresso.onView(ViewMatchers.withId(R.id.tvShapeInfo))
            .check(ViewAssertions.matches(ViewMatchers.withText("Shape: Triangle")));

    }
@Test
    public void testNewActivityButton(){
    Espresso.onView(withId(R.id.buttonNewAct)).perform(click());
    assertNotNull(ActivityScenario.launch(MainActivity2.class));
}


}

