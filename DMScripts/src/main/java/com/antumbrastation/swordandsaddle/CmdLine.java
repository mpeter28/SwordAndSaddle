package com.antumbrastation.swordandsaddle;

public class CmdLine {

    public static void main(String[] args) {
        StatBundle statBundle = StatRoller.rollStatBundle();

        System.out.println("Stats");
        System.out.println("==========\n");
        System.out.println("L: " + statBundle.getLeadership());
        System.out.println("T: " + statBundle.getTrickery());
        System.out.println("D: " + statBundle.getDialogue());
        System.out.println("I: " + statBundle.getInsight());
        System.out.println("C: " + statBundle.getCombat());
        System.out.println("S: " + statBundle.getSkill());
        System.out.println("\n==========");
        System.out.println("Average: " + statBundle.averageAptitude());
        System.out.println("\n==========");
        System.out.println(HexacoModel.matchTraitsToStats(statBundle));
    }
}
