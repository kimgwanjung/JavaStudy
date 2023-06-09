package kr.ac.kopo.Exam.Java0314_02;

public class Wizard {
    private int hp;
    private int mp;
    private String name;
    private Wand wand;
    
    public void heal(Hero hero) {
        int basePoint = 10;
        int recovPoint = (int) (basePoint + this.wand.getPower());
        hero.setHp(hero.getHp() + recovPoint);
    }
    public void setHp(int hp) {
        if(hp < 0) {
            this.hp = 0;
        }else {
            this.hp = hp;   
        }
    }
    public int getHp() {
        return hp;
    }
    public void setMp(int mp) {
        if(mp < 0) {
            throw new IllegalArgumentException(("에러요~"));
        }else {
            this.mp = mp;
        }
    }
    public int getMp() {
        return mp;
    }
    public void setName(String name) {
        if(name == null || name.length() < 3 ) {
            throw new IllegalArgumentException(("에러요~"));
        }else {
            this.name = name;
        }
    }
    public String getName() {
        return name;
    }
    public void setWand(Wand wand) {
        if(wand == null) {
            throw new IllegalArgumentException(("에러요~"));
        }else {
            this.wand = wand;
        }
    }
    public Wand getWand() {
        return wand;
    }
}
