package kr.ac.kopo.Exam.Java0315_02;

public abstract class IntangibleAsset extends Asset {
    private String color;
    public IntangibleAsset(String name, int price, String color) {
        super(name, price);
        this.color = color;
        // TODO Auto-generated constructor stub
    }

}
