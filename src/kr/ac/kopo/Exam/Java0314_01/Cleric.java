package kr.ac.kopo.Exam.Java0314_01;

import java.util.Random;

public class Cleric {
    private static final int MAX_HP = 50;
    private static final int MAX_MP = 10;
    String name;
    int hp = MAX_HP;
    int mp = MAX_MP;
    
    public Cleric(String name, int hp, int mp){
        this.name = name;
        this.hp = hp;
        this.mp = mp;
        
    }
    public Cleric(String name, int hp) {
        this(name, hp, MAX_HP);
    }
    public Cleric(String name){
        this(name, MAX_HP, MAX_MP);
    }    
    void selfAid() {
        if(this.mp < 5) {
            System.out.println("MP가 부족해용");
        }else {
            this.mp -= 5;
            this.hp = MAX_HP;
        }
    }
    int pray(int sec) {
        Random random = new Random();
        int prayRandom = random.nextInt(3);
        int recovery;
        if(sec + prayRandom + this.mp > MAX_MP) {
            recovery = MAX_MP - this.mp;
        }else {
            recovery = sec + prayRandom;
        }
        return recovery; 
    }
}