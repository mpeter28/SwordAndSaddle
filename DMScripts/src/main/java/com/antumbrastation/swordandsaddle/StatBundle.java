package com.antumbrastation.swordandsaddle;

public class StatBundle {

    private int leadership;
    private int trickery;
    private int dialogue;
    private int insight;
    private int combat;
    private int skill;

    public StatBundle(int leadership, int trickery, int dialogue, int insight, int combat, int skill) {
        this.leadership = leadership;
        this.trickery = trickery;
        this.dialogue = dialogue;
        this.insight = insight;
        this.combat = combat;
        this.skill = skill;
    }

    public int averageAptitude() {
        return (int) Math.round((this.leadership + this.trickery + this.dialogue + this.insight + this.combat + this.skill) / 6.0);
    }

    public int[] diffsFromAverage() {
        int averageAptitude = this.averageAptitude();

        return new int[] {
            this.leadership - averageAptitude,
            this.trickery - averageAptitude,
            this.dialogue - averageAptitude,
            this.insight - averageAptitude,
            this.combat - averageAptitude,
            this.skill - averageAptitude
        };
    }

    public int getLeadership() {
        return leadership;
    }

    public int getTrickery() {
        return trickery;
    }

    public int getDialogue() {
        return dialogue;
    }

    public int getInsight() {
        return insight;
    }

    public int getCombat() {
        return combat;
    }

    public int getSkill() {
        return skill;
    }
}
