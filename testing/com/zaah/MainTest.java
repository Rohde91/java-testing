package com.zaah;

import org.junit.Test;

import static org.junit.Assert.*;

public class MainTest {

    @Test
    public void f() {
        Main test = new Main();
        int res = test.f(5);
        assertEquals(1,res);
    }

    @Test
    public void f1() {
        Main test = new Main();
        int res = test.f(8);
        assertEquals(2,res);
    }

    @Test
    public void f2() {
        Main test = new Main();
        int res = test.f(12);
        assertEquals(3,res);
    }

    @Test
    public void f3() {
        Main test = new Main();
        int res = test.f(14);
        assertEquals(4,res);
    }

}