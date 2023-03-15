package kr.ac.kopo.Exam.Java0315_02;

public abstract class TangibleAsset extends Asset implements Thing {
    private double weight;
    private String color;
    
    public TangibleAsset(String name, int price, String color) {
        super(name, price);
        this.color = color;
    }
    public double getWeight() {
        return weight;
    }
    public void setWeight(double weight) {
        this.weight = weight;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
}
