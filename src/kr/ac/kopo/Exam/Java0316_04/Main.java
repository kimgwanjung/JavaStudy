package kr.ac.kopo.Exam.Java0316_04;


public class Main {
    public static void main(String[] args) {
        Account a = new Account("4649", 1592);
        System.out.println(a);
        Account b = new Account("4649 ",1592);
        
        System.out.println(b);
        
        if(a.equals(b)) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}
