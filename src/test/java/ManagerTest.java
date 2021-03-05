import management.Manager;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ManagerTest {
    Manager manager;

    @Before
    public void before() {
        manager = new Manager("Chris Keith", "ST25472C", 23000, "Management");
    }

    @Test
    public void hasName() {
        assertEquals("Chris Keith", manager.getName());
    }

    @Test
    public void hasNIN() {
        assertEquals("ST25472C", manager.getNIN());
    }

    @Test
    public void hasSalary() {
        assertEquals(23000, manager.getSalary(), 0.1);
    }

    @Test
    public void hasDeptName() {
        assertEquals("Management", manager.getDeptName());
    }

    @Test
    public void canRaiseSalary() {
        manager.raiseSalary(0.05);
        assertEquals(24150, manager.getSalary(), 0.1);
    }

    @Test
    public void canPayBonus() {
        assertEquals(230, manager.payBonus(), 0.1);
    }

    @Test
    public void canChangeName() {
        manager.setName("Joska Pista");
        assertEquals("Joska Pista", manager.getName());
    }

    @Test
    public void cantChangeNameIfItsNull() {
        manager.setName(null);
        assertEquals("Chris Keith", manager.getName());
    }

}
