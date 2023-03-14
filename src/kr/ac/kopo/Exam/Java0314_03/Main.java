package kr.ac.kopo.Exam.Java0314_03;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {        
        Person person1 = new Person("홍길동");
        Person person2 = new Person("한석봉");
        
        List<Person> personList = new ArrayList<>();
        personList.add(person1);
        personList.add(person2);
        
        for(Person person : personList) {
            System.out.println(person.name);
        }
    }

}
