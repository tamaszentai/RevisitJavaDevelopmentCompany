import management.Director;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DirectorTest {

    Director director;

    @Before
    public void before() {
        director = new Director("Random Person", "ST234567C", 100000, "Everything", 500000);
    }

    @Test
    public void hasName() {
        assertEquals("Random Person", director.getName());
    }

    @Test
    public void hasNIN() {
        assertEquals("ST234567C", director.getNIN());
    }

    @Test
    public void hasSalary() {
        assertEquals(100000, director.getSalary(), 0.1);
    }

    @Test
    public void hasDeptName() {
        assertEquals("Everything", director.getDeptName());
    }

    @Test
    public void hasBudget() {
        assertEquals(500000, director.getBudget(), 0.1);
    }

    @Test
    public void canRaiseSalary() {
        director.raiseSalary(0.5);
        assertEquals(150000, director.getSalary(), 0.1);
    }

    @Test
    public void canPayBonus() {
        assertEquals(2000, director.payBonus(), 0.1);
    }
}
