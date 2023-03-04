package ru.netology.unit;

import org.junit.Test;

import static org.junit.Assert.*;

public class CashBackHackerServiceTest {

    @Test
    public void testRemain() {
        CashBackHackerService service = new CashBackHackerService();

        int amount = 0;

        int expected = 1000;
        int actual = service.remain(amount);

        assertEquals(actual, expected);
    }

    @Test
    public void testRemain1() {
        CashBackHackerService service = new CashBackHackerService();

        int amount = 1;

        int expected = 999;
        int actual = service.remain(amount);

        assertEquals(actual, expected);
    }

    @Test
    public void testRemain2() {
        CashBackHackerService service = new CashBackHackerService();

        int amount = 546;

        int expected = 454;
        int actual = service.remain(amount);

        assertEquals(actual, expected);
    }

    @Test
    public void testRemain3() {
        CashBackHackerService service = new CashBackHackerService();

        int amount = 999;

        int expected = 1;
        int actual = service.remain(amount);

        assertEquals(actual, expected);
    }

    @Test
    public void testRemain4() {
        CashBackHackerService service = new CashBackHackerService();

        int amount = 1000;

        int expected = 0;
        int actual = service.remain(amount);

        assertEquals(actual, expected);
    }

    @Test
    public void testRemain5() {
        CashBackHackerService service = new CashBackHackerService();

        int amount = 20;

        int expected = 980;
        int actual = service.remain(amount);

        assertEquals(actual, expected);
    }

    @Test
    public void testRemain6() {
        CashBackHackerService service = new CashBackHackerService();

        int amount = 1001;

        int expected = 999;
        int actual = service.remain(amount);

        assertEquals(actual, expected);
    }
}