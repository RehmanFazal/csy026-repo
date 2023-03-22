package week5workshop.singleton;
//a creational pattern
// Only one instance of a class can exist
// in this example, the instance is always created - eager Singleton
public class Singleton_v1 {

    private static Singleton_v1 instance = new Singleton_v1();
 // singleton data

    protected Singleton_v1() { }  // for inheritance

    public static Singleton_v1 getInstance() {
        return instance;
    }
}