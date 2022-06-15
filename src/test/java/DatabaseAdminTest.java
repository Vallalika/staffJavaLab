import staff.techStaff.DatabaseAdmin;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DatabaseAdminTest {
    DatabaseAdmin kyle;

    @Before
    public void before() {
        kyle = new DatabaseAdmin("Kyle", "ST6543RC", 55000.00);
    }

    @Test
    public void canGetName() {
        assertEquals("Kyle", kyle.getName());
    }

    @Test
    public void canSetName() {
        kyle.setName("Leona");
        assertEquals("Leona", kyle.getName());
    }

    @Test
    public void canNotSetEmptyName() {
        kyle.setName("");
        assertEquals("Kyle", kyle.getName());
    }

    @Test
    public void canGetNiNumber() {
        assertEquals("ST6543RC", kyle.getNiNumber());
    }

    @Test
    public void canGetSalary() {
        assertEquals(55000.00, kyle.getSalary(),0.00);
    }


    @Test
    public void canRaiseSalary() {
        kyle.raiseSalary(3000.00);
        assertEquals(58000.00,kyle.getSalary(),0.00);
    }

    @Test
    public void canNotLowerSalary() {
        kyle.raiseSalary(-3000.00);
        assertEquals(55000.00,kyle.getSalary(),0.00);
    }

    @Test
    public void canPayBonus() {
        assertEquals(550.00,kyle.payBonus(),0.01);
    }
}
