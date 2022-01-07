package com.company;

public class Boss {

    Boss(){}

    public Boss (int BossDamage, int BossHealth, String BossDefence){}

    private int BossHealth;
    private int BossDamage;
    private String BossDefence [] = {"Physical","Magical","Energy"};

    public int getBossDamage(int BossDamage) {
        return  BossDamage;
    }

    public void setDemonDamage(int BossDamage) {
        this.BossDamage = BossDamage;
    }

    public int getBossHealth(int BossnHealth) {
        return BossHealth;
    }

    public void setDemonHealth(int BossHealth) {
        this.BossHealth = BossHealth;
    }

    public String[] getBossDefence() {
        return BossDefence;
    }

    public void setDemonDefence(String[] BossDefence) {
        this.BossDefence = BossDefence;
    }

    public String setDemonDefence(String magical) {
        return magical;
    }
}
