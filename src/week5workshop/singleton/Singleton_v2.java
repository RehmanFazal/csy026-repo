package week5workshop.singleton;
/*
lazy instantiation
we check before instatiating
 */

public class Singleton_v2 {
   // singleton data
   private static Singleton_v2 instance = null;
    protected Singleton_v2() {  }
    public static Singleton_v2 getInstance() {
        if (instance== null)
            instance = new Singleton_v2();
        return instance;
    }
}
