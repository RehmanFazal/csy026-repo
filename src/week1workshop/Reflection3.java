package week1workshop;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Reflection3 {
    public static void main(String[] args) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        WorkShopTaskOneClass workShopTaskOneClass = new WorkShopTaskOneClass();

        Field[] fields = workShopTaskOneClass.getClass().getFields();
        Field[] declareFields = workShopTaskOneClass.getClass().getDeclaredFields();
        System.out.printf("There are %d fields\n", fields.length);
        System.out.printf("There are %d fields\n", declareFields.length);

        for (Field f : fields) {
            System.out.printf("field name=%s type=%s accessible=%s\n", f.getName(),
                    f.getType(), f.canAccess(workShopTaskOneClass));
        }

        for (Field f : declareFields) {
            f.setAccessible(true);
            double x = f.getDouble(workShopTaskOneClass);
            x++;
            f.setDouble(workShopTaskOneClass, x);
            System.out.printf("field name=%s type=%s value=%,.2f\n", f.getName(),
                    f.getType(), f.getDouble(workShopTaskOneClass));
        }

        Method[] methods = workShopTaskOneClass.getClass().getMethods();
        System.out.printf("There are %d methods\n", methods.length);

        for (Method m : methods) {
            System.out.printf("method name=%s type=%s parameters = ", m.getName(),
                    m.getReturnType());
            Class[] types = m.getParameterTypes();
            for (Class c : types) {
                System.out.print(c.getName() + " ");
            }
            System.out.println();
        }


    }
}
