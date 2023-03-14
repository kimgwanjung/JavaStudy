package kr.ac.kopo0313;

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
        System.out.println(this.name+ sec);
    }
    void slip() {
        this.hp -= 5;
        System.out.println(this.name);
    }
    void sleep() {
        this.hp = 100;
        System.out.println(this.name);        
    }
    public void setHp(int hp) {
        this.hp = hp;
    }
    public int getHp() {
        return hp;
    }
}
