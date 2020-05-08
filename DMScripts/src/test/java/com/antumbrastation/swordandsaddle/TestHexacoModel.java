package com.antumbrastation.swordandsaddle;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class TestHexacoModel {

    @Test
    public void testWithExactSolution() {
        List<HexacoModel.PersonalityTraitBuckets> results = HexacoModel.matchTraitsToStats(new StatBundle(5, 1, 3, 4, 3, 2));

        Assert.assertTrue(results.remove(HexacoModel.PersonalityTraitBuckets.HumbleHonest));
        Assert.assertTrue(results.remove(HexacoModel.PersonalityTraitBuckets.HumbleHonest));
        Assert.assertTrue(results.remove(HexacoModel.PersonalityTraitBuckets.Conventional));
        Assert.assertEquals(0, results.size());
    }
}
