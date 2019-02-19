package com.example.rania.testalgo;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() throws Exception {
        assertEquals(4, 2 + 2);
    }

    @Test
    public void testSimple() {
        MainActivity main = new MainActivity();
        assertEquals("12H", main.displayMagic(1, 3));
    }
    @Test
    public void testPermutPmaxPmin() {
        MainActivity main = new MainActivity();
        assertEquals("12H", main.displayMagic(3, 1));
    }

    @Test
    public void testZero() {
        MainActivity main = new MainActivity();
        assertEquals("HS12H", main.displayMagic(0, 3));
    }

    @Test
    public void testPlus() {
        MainActivity main = new MainActivity();
        assertEquals("HS12H", main.displayMagic(0, 1+2));
    }

    @Test
    public void testMulti() {
        MainActivity main = new MainActivity();
        assertEquals("12H4SH78HS11H1314HS1617H19S", main.displayMagic(1, 20));
    }
}
