import org.junit.Before;
import org.junit.Test;
import staff.techStaff.Developer;

import static org.junit.Assert.assertEquals;

public class DeveloperTest {

    Developer deveoper;

    @Before
    public void before(){
        deveoper = new Developer("John", "DJ123456N", 35000);
    }

    @Test
    public void deveoperBaseAdminHasName(){
        assertEquals("John", deveoper.getName());
    }

    @Test
    public void deveoperAdminChangeName(){
        deveoper.setName("James");
        assertEquals("James", deveoper.getName());
    }

    @Test
    public void deveoperAdminHasNINumber(){
        assertEquals("DJ123456N", deveoper.getNI());
    }

    @Test
    public void deveoperAdminChangeNI(){
        deveoper.setNI("D123");
        assertEquals("D123", deveoper.getNI());
    }

    @Test
    public void deveoperBaseAdminHasSalary(){
        assertEquals(35000, deveoper.getSalary());
    }

    @Test
    public void deveoperBaseAdminChangeSalary(){
        deveoper.setSalary(25000);
        assertEquals(25000, deveoper.getSalary());
    }

    @Test
    public void deveoperBaseAdminManagersSalary(){
        deveoper.raiseSalary(5000);
        assertEquals(40000, deveoper.getSalary());
    }

    @Test
    public void deveoperBaseAdminManagerBonus(){
        deveoper.payBonus();
        assertEquals(350, deveoper.payBonus());
    }

}
