package Lv5;

public enum Discount {
    SOLDIER(0.3), STUDENT(0.2), ORDINARY_PERSON(0.1);

    private double rate;

    Discount(double rate){
        this.rate = rate;
    }

    // getter
    public double getRate(){
        return this.rate;
    }
}