package kr.ac.kopo.Exam.Java0316_02;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Y> list = new ArrayList<>();
        list.add(new A());
        list.add(new B());
        for (Y y : list) {
            y.b();
        }
    }
}  

