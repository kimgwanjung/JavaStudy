package kr.ac.kopo0313;

import java.util.Random;

public class Cleric {
    final int MAX_HP = 50;
    final int MAX_MP = 10;
    
    String name;
    int hp = 50;
    int mp = 10;
    
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
        int recovery = 0;
        if((sec + prayRandom) + this.mp > MAX_MP) {
            recovery = MAX_MP - this.mp;
        }else {
            recovery = (sec + prayRandom);
        }
        return recovery; 
    }
}
