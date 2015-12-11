package com.javafortesters.chap004testswithotherclasses.examples;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by rhernandez on 11/12/2015.
 */
public class IntegerExamplesTest {

    @Test
    public void integerExploration(){
        Integer four = new Integer(4);
        assertEquals("intValue returns int 4",
                4, four.intValue());
        Integer five = new Integer("5");
        assertEquals("intValue returns int 5",
                5, five.intValue());
        Integer six = 6;
        assertEquals("autoboxing assignment for 6",
                6, six.intValue());
    }

    @Test
    public void convertIntToHex(){
        Integer eleven = 11;
        assertEquals("11 becomes b", "b", eleven.toHexString());
        Integer ten = 10;
        assertEquals("10 becomes a", "a", ten.toHexString());
        Integer three = 3;
        assertEquals("3 becomes 3", "3", three.toHexString());
        Integer twentyOne = 21;
        assertEquals("21 becomes b", "22", twentyOne.toHexString());
    }
}
