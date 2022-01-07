package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {

        Hero holy = new Hero(250,27, (int) (Math.random()*184));
        Boss devil = new Boss(44,340,"");


        System.out.print("Hero's damage [" + holy.getDamage() + "]" );
        System.out.print(", health " + " [" +  holy.getHealth() + "]");
        System.out.println(", critical damage " +  " [" + holy.getSkill() + "]");

        System.out.print("Demon's damage [" + devil.getBossDamage(55)+ "]" );
        System.out.print(", health " + " [" +  devil.getBossHealth(566) + "]");
        System.out.println(", defence " +  " [" + devil.setDemonDefence("Magical") + "]");





    }
}