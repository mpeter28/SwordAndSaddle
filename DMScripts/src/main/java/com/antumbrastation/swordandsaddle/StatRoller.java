package com.antumbrastation.swordandsaddle;

public class StatRoller {

    public static StatBundle rollStatBundle() {
        return new StatBundle(
                convertDiceRollToStatNumber(roll4d6()),
                convertDiceRollToStatNumber(roll4d6()),
                convertDiceRollToStatNumber(roll4d6()),
                convertDiceRollToStatNumber(roll4d6()),
                convertDiceRollToStatNumber(roll4d6()),
                convertDiceRollToStatNumber(roll4d6())
        );
    }

    public static int roll4d6() {
        return (int) ((Math.random() * 6) + (Math.random() * 6) + (Math.random() * 6) + (Math.random() * 6) + 4);
    }

    private static int[] rollToStat = {
            -1,
            0,
            0,
            1,
            1,
            1,
            2,
            2,
            2,
            3,
            3,
            3,
            4,
            4,
            4,
            5,
            5,
            5,
            6,
            6,
            7
    };

    public static int convertDiceRollToStatNumber(int diceRoll) {
        if (diceRoll < 4) {
            return -1;
        }

        if (diceRoll > 24) {
            return 7;
        }

        return rollToStat[diceRoll - 4];
    }
}
