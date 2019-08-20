package com.leejungfoonpeter.songr;

import org.junit.Test;

import static org.junit.Assert.*;

public class HomeControllerTest {

    @Test
    public void reverseStringTest() {
        String test = "This is my test of private method reverseString()";
        HomeController hc = new HomeController();
        String reversedString = hc.reverseString(test);
        assertTrue(reversedString.equals("reverseString() method private of test my is This"));
    }
}