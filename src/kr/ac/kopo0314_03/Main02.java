package kr.ac.kopo0314_03;

import java.util.HashMap;
import java.util.Map;

public class Main02 {
    public static void main(String[] args) {
        Map<String, Integer> personMap = new HashMap<>();
        personMap.put("홍길동", 20);
        personMap.put("한석봉", 25);

        for (String name : personMap.keySet()) {
            int age = personMap.get(name);
            System.out.println(name + "의 나이는 " + age + "살");
        }
    }
}
