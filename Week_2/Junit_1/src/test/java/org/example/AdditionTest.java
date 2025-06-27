package org.example;

import static org.junit.jupiter.api.Assertions.*;

class AdditionTest {

    @org.junit.jupiter.api.Test
    void add() {
        Addition adding=new Addition();
        int res=adding.add(3,5);
        //System.out.println(8==res);
        assertEquals(8,res);
    }
}