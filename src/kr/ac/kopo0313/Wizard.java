package kr.ac.kopo0313;

public class Wizard {
    private int hp;
    private int mp;
    private String name;
    public Wand wand;
    
    public void heal(Hero hero) {
        int basePoint = 10;
        int recovPoint = (int) (basePoint + this.wand.power);
        hero.setHp(hero.getHp() + recovPoint);
    }
    public void setHp(int hp) {
        if(hp < 0) {
            this.hp = 0;
        }
        this.hp = hp;
    }
    public int getHp() {
        return hp;
    }
    public void setMp(int mp) {
        if(mp < 0) {
            throw new IllegalArgumentException(("에러요~"));
        }
        this.mp = hp;
    }
    public int getMp() {
        return mp;
    }
    public void setName(String name) {
        if(name == null || name.length() < 3 ) {
            throw new IllegalArgumentException(("에러요~"));
        }
        this.name = name;
    }
    public String getName() {
        return name;
    }
}
