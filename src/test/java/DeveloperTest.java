import staff.techStaff.Developer;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DeveloperTest {

        Developer alan;

        @Before
        public void before() {
            alan = new Developer("Alan", "ST6543RC", 55000.00);
        }

        @Test
        public void canGetName() {
            assertEquals("Alan", alan.getName());
        }

        @Test
        public void canSetName() {
            alan.setName("Leona");
            assertEquals("Leona", alan.getName());
        }

        @Test
        public void canGetNiNumber() {
            assertEquals("ST6543RC", alan.getNiNumber());
        }


        @Test
        public void canGetSalary() {
            assertEquals(55000.00, alan.getSalary(),0.00);
        }


        @Test
        public void canRaiseSalary() {
            alan.raiseSalary(3000.00);
            assertEquals(58000.00,alan.getSalary(),0.00);
        }

        @Test
        public void canNotLowerSalary() {
            alan.raiseSalary(-3000.00);
            assertEquals(55000.00,alan.getSalary(),0.00);
        }

        @Test
        public void canPayBonus() {
            assertEquals(550.00,alan.payBonus(),0.01);
        }


}
