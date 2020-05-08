package com.antumbrastation.swordandsaddle;

import java.util.*;

import static com.antumbrastation.swordandsaddle.HexacoModel.PersonalityTraits.*;

public class HexacoModel {

    public enum PersonalityTraitBuckets {
        HumbleHonest,
        DeceitfulBoastful,
        EmotionalAnxious,
        StableConfident,
        Extroverted,
        Introverted,
        Agreeable,
        Disagreeable,
        Organized,
        Disorganized,
        Curious,
        Conventional,
    }

    public enum PersonalityTraits {
        Fair,
        Honest,
        Loyal,
        Modest,

        Deceitful,
        Greedy,
        Boastful,
        Hypocritical,

        Anxious,
        Sentimental,
        Sensitive,
        Fearful,

        Confident,
        Practical,
        Calm,
        Brave,

        Outgoing,
        Cheerful,
        Talkative,
        Active,

        Shy,
        Reserved,
        Quiet,
        Passive,

        Patient,
        Agreeable,
        Lenient,
        Peaceful,

        Impulsive,
        Argumentative,
        Strict,
        Violent,

        Organized,
        Disciplined,
        Careful,
        Precise,

        Irresponsible,
        AbsentMinded,
        Reckless,
        Sloppy,

        Curious,
        Imaginative,
        Intellectual,
        Innovative,

        Disinterested,
        Boring,
        Shallow,
        Conventional,
    }

    public static List<PersonalityTraitBuckets> matchTraitsToStats(StatBundle statBundle) {
        int numberOfTraits = numberOfTraitsNeeded(statBundle.diffsFromAverage());

        List<PersonalityTraitBuckets> traitBuckets = new ArrayList<>();
        for (int i = 0; i < numberOfTraits; i++) {
            traitBuckets.add(PersonalityTraitBuckets.HumbleHonest);
        }

        List<PersonalityTraitBuckets> traitBias = Arrays.asList(PersonalityTraitBuckets.values());
        Collections.sort(traitBias);

        return evaluateMatch(
                0,
                numberOfTraits,
                traitBuckets,
                traitBias,
                statBundle.diffsFromAverage()
        );
    }

    private static List<PersonalityTraitBuckets> evaluateMatch(int index, int numberOfTraitsNeeded,
                                                               List<PersonalityTraitBuckets> traitBuckets,
                                                               List<PersonalityTraitBuckets> traitBias, int[] targetDeltas) {
        if (index >= numberOfTraitsNeeded) {
            return new ArrayList<>(traitBuckets);
        }

        List<PersonalityTraitBuckets> bestMatch = null;
        int smallestDiff = Integer.MAX_VALUE;
        for (PersonalityTraitBuckets bucket : traitBias) {
            traitBuckets.set(index, bucket);
            List<PersonalityTraitBuckets> candidate = evaluateMatch(index + 1, numberOfTraitsNeeded, traitBuckets, traitBias, targetDeltas);

            int candidateDiff = squareDiffSixValueArrays(targetDeltas, deltasForTraitList(candidate));
            if (candidateDiff < smallestDiff) {
                smallestDiff = candidateDiff;
                bestMatch = candidate;
            }
        }

        return bestMatch;
    }

    private static int numberOfTraitsNeeded(int[] diffFromAverage) {
        int absolutePointsFromAverage = 0;
        for (int statDiff: diffFromAverage) {
            absolutePointsFromAverage += Math.abs(statDiff);
        }

        return Math.min(6, (int) Math.ceil(absolutePointsFromAverage / 2.0));
    }

    private static int squareDiffSixValueArrays(int[] a, int[] b) {
        int diff = 0;
        for (int i = 0; i < 6; i++) {
            diff += (Math.abs(a[i] - b[i]) * Math.abs(a[i] - b[i]));
        }

        return diff;
    }

    private static int[] deltasForTraitList(List<PersonalityTraitBuckets> traitList) {
        int[] deltas = new int[6];

        for (PersonalityTraitBuckets traitBucket : traitList) {
            int[] deltaForTrait = statEquivalentForTraitBucket(traitBucket);

            for (int i = 0; i < 6; i++) {
                deltas[i] += deltaForTrait[i];
            }
        }

        return deltas;
    }

    private static int[] statEquivalentForTraitBucket(PersonalityTraitBuckets bucket) {
        switch (bucket) {
            case HumbleHonest:
                return new int[] {1, -1, 0, 0, 0, 0};
            case DeceitfulBoastful:
                return new int[] {-1, 1, 0, 0, 0, 0};
            case EmotionalAnxious:
                return new int[] {0, 1, 0, -1, 0, 0};
            case StableConfident:
                return new int[] {0, -1, 0, 1, 0, 0};
            case Extroverted:
                return new int[] {0, 0, 1, 0, 0, -1};
            case Introverted:
                return new int[] {0, 0, -1, 0, 0, 1};
            case Agreeable:
                return new int[] {0, 0, 1, 0, -1, 0};
            case Disagreeable:
                return new int[] {0, 0, -1, 0, 1, 0};
            case Organized:
                return new int[] {1, 0, 0, 0, -1, 0};
            case Disorganized:
                return new int[] {-1, 0, 0, 0, 1, 0};
            case Curious:
                return new int[] {0, 0, 0, -1, 0, 1};
            case Conventional:
                return new int[] {0, 0, 0, 1, 0, -1};
            default:
                return new int[] {0, 0, 0, 0, 0, 0};
        }
    }

    public static PersonalityTraits[] traitsForBucket(PersonalityTraitBuckets traitBucket) {
        switch (traitBucket) {
            case HumbleHonest:
                return new PersonalityTraits[] { Fair, Honest, Loyal, Modest };
            case DeceitfulBoastful:
                return new PersonalityTraits[] { Deceitful, Greedy, Boastful, Hypocritical };
            case EmotionalAnxious:
                return new PersonalityTraits[] {};
            case StableConfident:
                return new PersonalityTraits[] {};
            case Extroverted:
                return new PersonalityTraits[] {};
            case Introverted:
                return new PersonalityTraits[] {};
            case Agreeable:
                return new PersonalityTraits[] {};
            case Disagreeable:
                return new PersonalityTraits[] {};
            case Organized:
                return new PersonalityTraits[] {};
            case Disorganized:
                return new PersonalityTraits[] {};
            case Curious:
                return new PersonalityTraits[] {};
            case Conventional:
                return new PersonalityTraits[] {};
            default:
                return new PersonalityTraits[] {};
        }
    }
}
