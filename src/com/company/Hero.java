package com.company;

    public class Hero {
        Hero() {
        }


        private int health;
        private int damage;
        private double skill;

        private Hero (int damage, int health){
            this.damage = damage;
            this.health = health;

        }

        public Hero(int health, int damage, double skill) {
            this.damage = damage;//
            this.health = health;//
            this.skill = skill;

   /*      public com.company.Hero(int health, int damage){
            this.damage = damage;//
            this.health = health;//
        }*/

        }

        public int getHealth() {
            return health;
        }

        public double getSkill() {
            return skill;

        }

        public int getDamage() {
            return damage;
        }
    }
