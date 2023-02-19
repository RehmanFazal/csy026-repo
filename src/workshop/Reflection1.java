package workshop;

public class Reflection1 {
    public static void main(String[] args) {
        WorkShopTaskOneClass workShopTaskOneClass = new WorkShopTaskOneClass();

        System.out.println("class object = "+ workShopTaskOneClass);
        System.out.println("class = "+ workShopTaskOneClass.getClass());
        System.out.println("class Name = "+ workShopTaskOneClass.getClass().getName());
    }
}
