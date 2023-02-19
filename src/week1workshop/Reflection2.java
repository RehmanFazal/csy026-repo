package week1workshop;

public class Reflection2 {
    public static void main(String[] args) {
        WorkShopTaskOneClass workShopTaskOneClass = new WorkShopTaskOneClass();

        workShopTaskOneClass.num2 = 7;
        double newNum = workShopTaskOneClass.addNumbers();
        System.out.println("addition = "+ newNum);
        System.out.println("class object = "+ workShopTaskOneClass);
        System.out.println("class Name = "+ workShopTaskOneClass.getClass().getName());
    }
}
