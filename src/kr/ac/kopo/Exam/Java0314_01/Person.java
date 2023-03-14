package kr.ac.kopo.Exam.Java0314_01;
import java.util.ArrayList;

public class Person {
    private String name;
    
    public Person(String name) {
        this.name = name;
    }
    
    public String getName() {
        return name;
    }
    
    public static void main(String[] args) {
        ArrayList<Person> personList = new ArrayList<>();
        
        Person person1 = new Person("홍길동");
        Person person2 = new Person("한석봉");
        
        personList.add(person1);
        personList.add(person2);
        
        for (Person person : personList) {
            System.out.println(person.getName());
        }
    }
}
