package workshop;

import org.junit.Test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import static org.junit.Assert.assertEquals;

public class Reflection4 {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        WorkShopTaskOneClass s = new WorkShopTaskOneClass();
        Method m = s.getClass().getDeclaredMethod("subtractNumbers", double.class, double.class);
        m.setAccessible(true);
        Object result = m.invoke(s, 5.5, 8.5);
        System.out.println(result);
    }

    static class WorkShopTaskOneClassTest {

        @Test
        public void getNum1() {
            WorkShopTaskOneClass w = new WorkShopTaskOneClass();
            w.setNum1(5.0);
            assertEquals(5, w.getNum1(), 0.001);
        }

        @Test
        void setNum1() {
            //already tested
        }

        @Test
        void getNum2() {
        }

        @Test
        void setNum2() {
        }

        @Test
        void addNumbers() {
        }

        @Test
        void testToString() {
        }
    }
}
