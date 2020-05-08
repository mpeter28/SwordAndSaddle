package com.antumbrastation.swordandsaddle;

import org.junit.Assert;
import org.junit.Test;

public class TestStatBundle {

    @Test
    public void testGetters() {
        StatBundle statBundle = new StatBundle(1, 4, 5, 3, 2, 7);

        Assert.assertEquals(1, statBundle.getLeadership());
        Assert.assertEquals(4, statBundle.getTrickery());
        Assert.assertEquals(5, statBundle.getDialogue());
        Assert.assertEquals(3, statBundle.getInsight());
        Assert.assertEquals(2, statBundle.getCombat());
        Assert.assertEquals(7, statBundle.getSkill());
    }

    @Test
    public void testAverageAptitude() {
        StatBundle statBundle = new StatBundle(7, 5, 3, 3, 2, 3);

        Assert.assertEquals(4, statBundle.averageAptitude());
    }

    @Test
    public void testDiffsFromAverage() {
        StatBundle statBundle = new StatBundle(7, 5, 3, 3, 2, 3);
        int[] diffs = statBundle.diffsFromAverage();

        Assert.assertEquals(3, diffs[0]);
        Assert.assertEquals(1, diffs[1]);
        Assert.assertEquals(-1, diffs[2]);
        Assert.assertEquals(-1, diffs[3]);
        Assert.assertEquals(-2, diffs[4]);
        Assert.assertEquals(-1, diffs[5]);
    }
}
