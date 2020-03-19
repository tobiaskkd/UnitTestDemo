package tests;

import com.company.DemoApp;
import com.company.Shop;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

public class DemoTest {

    DemoApp demoApp = new DemoApp();

    @Test
    public void testAddition() {

        assertEquals(demoApp.addition(1, 1), 2);
        assertNotEquals(demoApp.addition(1, 0), 2);
    }

    @Test
    public void testSubtraction() {

        assertEquals(demoApp.subtraction(1, 1), 0);
        assertNotEquals(demoApp.subtraction(1, 0), 0);
    }

    @Test
    public void testEvenNumber() {

        assertFalse(demoApp.isEven(7));
        assertTrue(demoApp.isEven(8));
    }

    @Test
    public void testHighest() {

        assertEquals(demoApp.getHighest(0, -1), 0);
        assertEquals(demoApp.getHighest(100000, -100000), 100000);
    }

    @Test
    public void addDemoAppWithDummyTest() {
        DemoApp dummy = mock(DemoApp.class);
        Shop shop = new Shop();
        shop.addDemoApp(dummy);
        assertEquals(1, shop.countDemoApps());
    }
}
