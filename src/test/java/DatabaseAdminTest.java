import org.junit.Before;
import org.junit.Test;
import techStaff.DatabaseAdmin;

import static org.junit.Assert.assertEquals;

public class DatabaseAdminTest {

    DatabaseAdmin databaseAdmin;

    @Before
    public void before() {
        databaseAdmin = new DatabaseAdmin("Homo Bela", "ST09876C", 25000);
    }

    @Test
    public void hasName() {
        assertEquals("Homo Bela", databaseAdmin.getName());
    }

    @Test
    public void hasNIN() {
        assertEquals("ST09876C", databaseAdmin.getNIN());
    }

    @Test
    public void hasSalary() {
        assertEquals(25000, databaseAdmin.getSalary(), 0.1);
    }

    @Test
    public void canRaiseSalary() {
        databaseAdmin.raiseSalary(0.1);
        assertEquals(27500, databaseAdmin.getSalary(), 0.1);
    }

    @Test
    public void canPayBonus() {
        assertEquals(250, databaseAdmin.payBonus(), 0.1);
    }
}
