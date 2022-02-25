package com.zaah;

import org.junit.Test;

import static org.junit.Assert.*;

public class MainTest2 {

    @Test
    public void udskriv() {
        Main test = new Main();
        String res = test.udskriv(99, "ja");
        assertEquals("Godkend 1", res);
    }

    @Test
    public void udskriv1() {
        Main test = new Main();
        String res = test.udskriv(101, "ja");
        assertEquals("Godkend 2", res);
    }

    @Test
    public void udskriv2() {
        Main test = new Main();
        String res = test.udskriv(99, "nej");
        assertEquals("Ikke Godkend 4", res);
    }
    @Test
    public void udskriv3() {
        Main test = new Main();
        String res = test.udskriv(101, "nej");
        assertEquals("Ikke Godkend 5", res);
    }
    // Sidste test her, skal den have en string værdi i testen, trods der ikke ligger en string værdi i det den tester
    // Hvis første krav bliver specifikt overholdt, så checker den ikke på den efterfølgende string værdi
    @Test
    public void udskriv4() {
        Main test = new Main();
        String res = test.udskriv(100, "ja");
        assertEquals("Godkend", res);
    }

}