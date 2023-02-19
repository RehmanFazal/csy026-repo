package week1workshop;

import org.junit.Test;

import static org.junit.Assert.*;

public class WorkShopTaskOneClassTest {

    @Test
    public void getNum1() {
        WorkShopTaskOneClass w = new WorkShopTaskOneClass();
        w.setNum1(5);
        assertEquals(5.0, w.getNum1(), 0.001);
    }

    @Test
    public void setNum1() {
        //already tested
    }

    @Test
    public void getNum2() {
        WorkShopTaskOneClass w = new WorkShopTaskOneClass();
        w.setNum2(5);
        assertEquals(5.0, w.getNum2(), 0.001);
    }

    @Test
    public void setNum2() {
        //already tested
    }

    @Test
    public void addNumbers() {
        WorkShopTaskOneClass w = new WorkShopTaskOneClass();
        w.setNum1(5);
        w.setNum2(6);
        assertEquals(11.0, w.addNumbers(), 0.001);
    }
}