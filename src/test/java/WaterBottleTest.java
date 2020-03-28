import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WaterBottleTest {

    private WaterBottle waterBottle;

    @Before
    public void setUp(){
        waterBottle = new WaterBottle();
    }

    @Test
    public void hasCorrectVolume(){
        assertEquals(100, waterBottle.getVolume());
    }

    @Test
    public void drinkRemoves10(){
        waterBottle.drink();
        assertEquals(90, waterBottle.getVolume());
    }

    @Test
    public void emptyReducesTo0(){
        waterBottle.empty();
        assertEquals(0,waterBottle.getVolume());
    }

    @Test
    public void fillReturnsTo100(){
        waterBottle.fill();
        assertEquals(100, waterBottle.getVolume());
    }

}
