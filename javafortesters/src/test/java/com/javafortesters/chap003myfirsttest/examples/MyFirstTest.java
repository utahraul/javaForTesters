/**
 * Created by rhernandez on 24/03/2015.
 */

package com.javafortesters.chap003myfirsttest.examples;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MyFirstTest {
    @Test
    public void canAddTwoPlusTwo(){
        int answer = 6/2;
        assertEquals("4/2=2", 3, answer);
    }
}
