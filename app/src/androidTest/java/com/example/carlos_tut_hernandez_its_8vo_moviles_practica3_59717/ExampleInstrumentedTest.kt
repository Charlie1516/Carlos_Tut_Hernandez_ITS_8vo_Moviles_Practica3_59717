package com.example.carlos_tut_hernandez_its_8vo_moviles_practica3_59717

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.espresso.matcher.ViewMatchers.withText
import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import org.hamcrest.Matchers.anyOf
import org.hamcrest.Matchers.not
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

/**
 * Instrumented test, which will execute on an Android device.
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
@RunWith(AndroidJUnit4::class)
class ExampleInstrumentedTest {
    @get:Rule
    var activityRule = ActivityScenarioRule(MainActivity::class.java)

    @Test
    fun testNumberButtons() {
        onView(withId(R.id.btn1)).perform(click())
        onView(withId(R.id.txtResult)).check(matches(withText("1")))
    }

    @Test
    fun testAddition() {
        onView(withId(R.id.btn2)).perform(click())
        onView(withId(R.id.btnAdd)).perform(click())
        onView(withId(R.id.btn3)).perform(click())
        onView(withId(R.id.btnEquals)).perform(click())
        onView(withId(R.id.txtResult)).check(matches((withText("5.0"))))
    }

    @Test
    fun testSubtraction() {
        onView(withId(R.id.btn5)).perform(click())
        onView(withId(R.id.btnSubtract)).perform(click())
        onView(withId(R.id.btn2)).perform(click())
        onView(withId(R.id.btnEquals)).perform(click())
        onView(withId(R.id.txtResult)).check(matches(withText("3.0")))
    }

    @Test
    fun testMultiplication() {
        onView(withId(R.id.btn3)).perform(click())
        onView(withId(R.id.btnMultiply)).perform(click())
        onView(withId(R.id.btn4)).perform(click())
        onView(withId(R.id.btnEquals)).perform(click())
        onView(withId(R.id.txtResult)).check(matches(withText("12.0")))
    }

    @Test
    fun testDivision() {
        onView(withId(R.id.btn8)).perform(click())
        onView(withId(R.id.btnDivide)).perform(click())
        onView(withId(R.id.btn2)).perform(click())
        onView(withId(R.id.btnEquals)).perform(click())
        onView(withId(R.id.txtResult)).check(matches(withText("4.0")))
    }

    //Los de memoria fallan

    fun testNumberButtonsfailed() {
        onView(withId(R.id.btn1)).perform(click())
        onView(withId(R.id.txtResult)).check(matches(withText("4")))
    }

    @Test
    fun testAdditionfailed() {
        onView(withId(R.id.btn2)).perform(click())
        onView(withId(R.id.btnAdd)).perform(click())
        onView(withId(R.id.btn3)).perform(click())
        onView(withId(R.id.btnEquals)).perform(click())
        onView(withId(R.id.txtResult)).check(matches((withText("9.0"))))
    }

    @Test
    fun testSubtractionfailed() {
        onView(withId(R.id.btn5)).perform(click())
        onView(withId(R.id.btnSubtract)).perform(click())
        onView(withId(R.id.btn2)).perform(click())
        onView(withId(R.id.btnEquals)).perform(click())
        onView(withId(R.id.txtResult)).check(matches(withText("2.0")))
    }

    @Test
    fun testMultiplicationfailed() {
        onView(withId(R.id.btn3)).perform(click())
        onView(withId(R.id.btnMultiply)).perform(click())
        onView(withId(R.id.btn4)).perform(click())
        onView(withId(R.id.btnEquals)).perform(click())
        onView(withId(R.id.txtResult)).check(matches(withText("16.0")))
    }

    @Test
    fun testDivisionfailed() {
        onView(withId(R.id.btn8)).perform(click())
        onView(withId(R.id.btnDivide)).perform(click())
        onView(withId(R.id.btn2)).perform(click())
        onView(withId(R.id.btnEquals)).perform(click())
        onView(withId(R.id.txtResult)).check(matches(withText("8.0")))
    }


    //Puebas de nuevos botones
    @Test
    fun testPower() { //Potencia
        onView(withId(R.id.btn2)).perform(click())
        onView(withId(R.id.btnPower)).perform(click())
        onView(withId(R.id.btn3)).perform(click())
        onView(withId(R.id.btnEquals)).perform(click())
        onView(withId(R.id.txtResult)).check(matches(anyOf(withText("8.0"), withText("8.0000"))))
    }

    @Test
    fun failedPotencia() { //Potencia
        onView(withId(R.id.btn2)).perform(click())
        onView(withId(R.id.btnPower)).perform(click())
        onView(withId(R.id.btn3)).perform(click())
        onView(withId(R.id.btnEquals)).perform(click())
        onView(withId(R.id.txtResult)).check(matches(anyOf(withText("2.0"), withText("8.0000"))))
    }

    @Test
    fun testRoot() { //Raiz
        onView(withId(R.id.btn9)).perform(click())
        onView(withId(R.id.btnRoot)).perform(click())
        onView(withId(R.id.txtResult)).check(matches(anyOf(withText("3"), withText("3.0000"))))
    }

    @Test
    fun testPercent() { //Porcentaje
        onView(withId(R.id.btn5)).perform(click())
        onView(withId(R.id.btn0)).perform(click()) // 50
        onView(withId(R.id.btnPercent)).perform(click())
        onView(withId(R.id.txtResult)).check(matches(anyOf(withText("0.5"), withText("0.5000"))))
    }

    @Test
    fun failedPorcentaje() { //Porcentaje
        onView(withId(R.id.btn5)).perform(click())
        onView(withId(R.id.btn0)).perform(click()) // 50
        onView(withId(R.id.btnPercent)).perform(click())
        onView(withId(R.id.txtResult)).check(matches(anyOf(withText("0.7"), withText("0.5000"))))
    }
}