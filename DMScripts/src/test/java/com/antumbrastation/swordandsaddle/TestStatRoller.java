package com.antumbrastation.swordandsaddle;

import org.junit.Assert;
import org.junit.Test;

public class TestStatRoller {

    @Test
    public void testRoll4d6FallsWithinBounds() {
        int roll = StatRoller.roll4d6();
        Assert.assertTrue(4 <= roll && 24 >= roll);

        roll = StatRoller.roll4d6();
        Assert.assertTrue(4 <= roll && 24 >= roll);

        roll = StatRoller.roll4d6();
        Assert.assertTrue(4 <= roll && 24 >= roll);

        roll = StatRoller.roll4d6();
        Assert.assertTrue(4 <= roll && 24 >= roll);
    }

    @Test
    public void testRollToStatTooLow() {
        Assert.assertEquals(-1, StatRoller.convertDiceRollToStatNumber(3));
    }

    @Test
    public void testRollToStatTooHigh() {
        Assert.assertEquals(7, StatRoller.convertDiceRollToStatNumber(25));
    }

    @Test
    public void testRollToStatExpectedInBoundNumbers() {
        Assert.assertEquals(0, StatRoller.convertDiceRollToStatNumber(5));
        Assert.assertEquals(2, StatRoller.convertDiceRollToStatNumber(10));
        Assert.assertEquals(4, StatRoller.convertDiceRollToStatNumber(18));
        Assert.assertEquals(7, StatRoller.convertDiceRollToStatNumber(24));
    }
}
