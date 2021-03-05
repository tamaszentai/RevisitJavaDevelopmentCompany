import org.junit.Before;
import org.junit.Test;
import techStaff.Developer;

import static org.junit.Assert.assertEquals;

public class DeveloperTest {

    Developer developer;

    @Before
    public void before() {
        developer = new Developer("Istvan Szabo", "ST123456C", 80000);
    }

    @Test
    public void hasName() {
        assertEquals("Istvan Szabo", developer.getName());
    }

    @Test
    public void hasNIN() {
        assertEquals("ST123456C", developer.getNIN());
    }

    @Test
    public void hasSalary() {
        assertEquals(80000, developer.getSalary(), 0.1);
    }

    @Test
    public void canRaiseSalary() {
        developer.raiseSalary(0.05);
        assertEquals(84000, developer.getSalary(), 0.1);
    }

    @Test
    public void canPayBonus() {
        assertEquals(800, developer.payBonus(), 0.1);
    }
}
