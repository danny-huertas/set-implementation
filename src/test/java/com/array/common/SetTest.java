package com.array.common;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;



/**
 * Created by daniel.huertas on 9/16/2015.
 */
public class SetTest {
    Set empty = new Set();
    Set one = new Set();
    Set many= new Set();

    @Before
    public void initSetTest(){
        one.add("1");
        many.add("1");
        many.add("2");
        many.add("3");
    }

    @Test
    public void isEmpty(){
        Assert.assertTrue(empty.isEmpty());
        Assert.assertFalse(one.isEmpty());
        Assert.assertFalse(many.isEmpty());
    }

    @Test
    public void size(){
        Assert.assertEquals(0, empty.size());
        Assert.assertEquals(1, one.size());
        Assert.assertEquals(3, many.size());
    }

    @Test
    public void add(){
        Set set = new Set();
        Assert.assertEquals(0, set.size());
        set.add("1");
        Assert.assertEquals(1, set.size());
        Assert.assertTrue(set.contains("1"));
    }

    @Test
    public void remove(){
        Set set = new Set();
        set.add("1");
        set.add("2");
        set.add("3");
        Assert.assertEquals(3, set.size());

        set.remove("2");
        Assert.assertEquals(2, set.size());
        Assert.assertFalse(set.contains("2"));
        System.out.println(set);
    }

    @Test
    public void indexOf(){
        Assert.assertEquals(2, many.indexOf("3"));
    }

    @Test
    public void contains(){
        Assert.assertTrue(many.contains("2"));
    }

    @Test
    public void handleDuplicates(){
        Set set = new Set();
        set.add("1");
        set.add("1");
        set.add("2");

        Assert.assertEquals(2, set.size());
        System.out.println(set);
    }

    @Test
    public void isFull(){
        Set set = new Set();
        set.add("1");
        set.add("2");
        set.add("3");
        set.add("4");
        set.add("5");
        set.add("6");
        set.add("7");
        set.add("8");
        set.add("9");
        set.add("10");
        Assert.assertTrue(set.isFull());
        set.add("11");
        set.add("12");
        Assert.assertFalse(set.isFull());
        System.out.println(set);
    }
}
