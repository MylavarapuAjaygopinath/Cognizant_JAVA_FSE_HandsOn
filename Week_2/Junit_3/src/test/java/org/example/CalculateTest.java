package org.example;


import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class CalculateTest {
    Calculate cal;
    @BeforeEach
    void setUp() {
        cal=new Calculate();
        System.out.println("Setting up Calculator instance...");
    }

    @AfterEach
    void tearDown() {
        System.out.println("Cleaning up after test...\n");
    }

    @Test
    void testAddition() {
        int a=10;
        int b=5;
        int result=cal.add(a,b);
        assertEquals(15,result);
    }

    @Test
    void testSubtraction() {
        int a=10;
        int b=3;
        int result = cal.subtract(a,b);
        assertEquals(7,result);
    }
}