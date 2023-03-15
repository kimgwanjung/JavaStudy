package kr.ac.kopo.Exam.Java0315_01;

import kr.ac.kopo.Exam.Java0314_02.Hero;

public class PoisonKinoko extends Kinoko {
    private int posionattack;
    public PoisonKinoko(char suffix) {
        super(suffix);
        // TODO Auto-generated constructor stub
        posionattack = 5;
    }
    public void attack(Hero hero) {
        super.attack(hero);
        if(posionattack > 0) {
            System.out.println("추가로, 독 포자를 살포했다!");
            int damage = hero.getHp() / 5;
            hero.setHp(hero.getHp() - damage);
            System.out.println(damage + " 포인트의 데미지");
            posionattack--;
        }
    }

}
