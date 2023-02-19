package week1workshop;

public class WorkShopTaskOneClass {
    private double num1 = 5.6;
    public double num2 = 6;
   // private char c = 'a';

    public double getNum1() {
        return num1;
    }

    public void setNum1(double num1) {
        this.num1 = num1;
    }

    public double getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

 /*   public char getC() {
        return c;
    }

    public void setC(char c) {
        this.c = c;
    }*/

    public double addNumbers() {
        return num1 + num2;
    }

    private double subtractNumbers(double n1, double n2) {
        return n2 - n1;
    }

    @Override
    public String toString() {
        return "WorkShopTaskOneClass{" +
                "num1=" + num1 +
                ", num2=" + num2 +
                //", c=" + c +
                '}';
    }
}
