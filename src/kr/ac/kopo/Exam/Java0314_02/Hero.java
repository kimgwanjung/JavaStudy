package kr.ac.kopo.Exam.Java0314_02;

import kr.ac.kopo.Exam.Java0313.Sword;

public class Hero {
    String name;
    int hp;
    Sword sword;
    
    void attack() {}
    void run() {
        System.out.println(this.name);
        System.out.println("GAME OVER");
        System.out.println(this.hp);
    }
    void sit(int sec) {
        this.hp += sec;
        System.out.println(this.name + sec);
    }
    void slip() {
        this.hp -= 5;
        System.out.println(this.name);
    }
    void sleep() {
        this.hp = 100;
        System.out.println(this.name);        
    }
    public void die() {
        System.out.println(this.name + "는 죽었다");
        System.out.println("Game Over");
    }
    
    public void setHp(int hp) {
        this.hp = hp;
    }
    public int getHp() {
        return hp;
    }
}
