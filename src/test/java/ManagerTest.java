import org.junit.Before;
import org.junit.Test;
import staff.management.Manager;

import static org.junit.Assert.assertEquals;

public class ManagerTest {

    Manager albert;

    @Before
    public void before() {
        albert = new Manager("Albert", "ST6543RC", 55000.00, "HR");
    }

    @Test
    public void canGetName() {
        assertEquals("Albert", albert.getName());
    }

    @Test
    public void canSetName() {
        albert.setName("Marie");
        assertEquals("Marie", albert.getName());
    }

    @Test
    public void canGetNiNumber() {
        assertEquals("ST6543RC", albert.getNiNumber());
    }


    @Test
    public void canGetSalary() {
        assertEquals(55000.00, albert.getSalary(),0.00);
    }

    @Test
    public void canGetDeptName() {
        assertEquals("HR",albert.getDeptName());
    }


    @Test
    public void canRaiseSalary() {
        albert.raiseSalary(3000.00);
        assertEquals(58000.00,albert.getSalary(),0.00);
    }

    @Test
    public void canNotLowerSalary() {
        albert.raiseSalary(-3000.00);
        assertEquals(55000.00,albert.getSalary(),0.00);
    }

    @Test
    public void canPayBonus() {
        assertEquals(550.00,albert.payBonus(),0.01);
    }
}
