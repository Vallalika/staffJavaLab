import org.junit.Before;
import org.junit.Test;
import staff.management.Director;
import staff.management.Manager;

import static org.junit.Assert.assertEquals;


public class DirectorTest {

    Director alice;

    @Before
    public void before() {
        alice = new Director("Alice", "ST6543RC", 80000.00, "Operations",150000.00 );
    }

    @Test
    public void canGetName() {
        assertEquals("Alice", alice.getName());
    }

    @Test
    public void canSetName() {
        alice.setName("Marie");
        assertEquals("Marie", alice.getName());
    }

    @Test
    public void canGetNiNumber() {
        assertEquals("ST6543RC", alice.getNiNumber());
    }


    @Test
    public void canGetSalary() {
        assertEquals(80000.00, alice.getSalary(),0.00);
    }


    @Test
    public void canGetDeptName() {
        assertEquals("Operations",alice.getDeptName());
    }


    @Test
    public void canRaiseSalary() {
        alice.raiseSalary(3000.00);
        assertEquals(83000.00,alice.getSalary(),0.00);
    }

    @Test
    public void canNotLowerSalary() {
        alice.raiseSalary(-3000.00);
        assertEquals(80000.00,alice.getSalary(),0.00);
    }

    @Test
    public void canPayBonus() {
        assertEquals(1600.00,alice.payBonus(),0.01);
    }

    @Test
    public void canGetBudget() {
        assertEquals(150000.00,alice.getBudget(),0.00);
    }
}
