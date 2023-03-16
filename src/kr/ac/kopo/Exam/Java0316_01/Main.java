package kr.ac.kopo.Exam.Java0316_01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        
        Book book1 = new Book("수학", new Date(1647469200000L), "숫자공부~!~!~!~");
        Book book2 = new Book("수학", new Date(1647469200000L), "외국인~!~!~!~!");
        Book book3 = new Book("컴퓨터", new Date(1647469000000L), "오준석 교수님과 공부~!~!~~!~!");

        System.out.println("book1(수학) 과 book2(수학) : " + book1.equals(book2));
        System.out.println("book1(수학) 과 book3(컴퓨터) : " + book1.equals(book3));

        ArrayList<Book> bookList = new ArrayList<>();
        bookList.add(new Book("수학", new Date(1647469200000L), "숫자공부~!~!~!~"));
        bookList.add(new Book("수학", new Date(1647469200000L), "외국인~!~!~!~!"));
        bookList.add(new Book("컴퓨터", new Date(1647469000000L), "오준석 교수님과 공부~!~!~~!~!"));
        
        System.out.println("정렬 전:");
        for (Book book : bookList) {
            System.out.println(book);
        }
        System.out.println("정렬 후:");
        Collections.sort(bookList);
        for (Book book : bookList) {
            System.out.println(book);
        }

        Book book4 = book1.clone();
        System.out.println("book1(수학)과 book2(수학 복제본) : " + book1.equals(book4));
    }
}
