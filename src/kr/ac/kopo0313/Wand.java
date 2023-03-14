package kr.ac.kopo0313;

public class Wand {
    public double power = 0;
    private String name;
    
    public void setPower(double power) {
        if(power < 0.5 || power > 100.0) {
            throw new IllegalArgumentException(("에러요~"));
        }
        this.power = power;
    }
    public double getPower() {
        return power;
    }
    public void setName(String name) {
        if(name == null || name.length() < 3 ) {
            throw new IllegalArgumentException(("에러요~"));
        }
        this.name = name;
    }
    public String getHp() {
        return name;
    }
}

 