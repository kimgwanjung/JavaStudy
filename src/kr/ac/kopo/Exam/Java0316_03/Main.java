package kr.ac.kopo.Exam.Java0316_03;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Main {
    public static void main(String[] args) {

        Date Date = new Date();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(Date);
        int day = calendar.get(Calendar.DAY_OF_MONTH);
        
        calendar.set(Calendar.DAY_OF_MONTH, day + 100);
        Date after100 = calendar.getTime();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy년 MM월 dd일");
        
        System.out.println(dateFormat.format(after100));
    }
}