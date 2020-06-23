import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TriathleteTest {

    Triathlete triathlete;

    @Before
    public void before() {
        triathlete = new Triathlete();
    }

    @Test
    public void hasDistanceAtBeginning() {
        assertEquals(0, triathlete.getDistanceTravelled());
    }

    @Test
    public void run() {
        triathlete.run(1000);
        assertEquals(1000,triathlete.getDistanceTravelled());
    }

    @Test
    public void cycle() {
        triathlete.cycle(1000);
        assertEquals(1000,triathlete.getDistanceTravelled());
    }

    @Test
    public void swim() {
        triathlete.swim(1000);
        assertEquals(1000,triathlete.getDistanceTravelled());
    }
}
