import org.junit.Before;
import org.junit.Test;
import staff.management.Manager;

import static org.junit.Assert.assertEquals;

public class ManagerTest {

    Manager manager;

    @Before
    public void before(){
        manager = new Manager("John", "DJ123456N", 35000, "Tech");
    }

    @Test
    public void managerHasName(){
        assertEquals("John", manager.getName());
    }

    @Test
    public void managerChangeName(){
        manager.setName("James");
        assertEquals("James", manager.getName());
    }

    @Test
    public void managerHasNINumber(){
        assertEquals("DJ123456N", manager.getNI());
    }

    @Test
    public void managerChangeNI(){
        manager.setNI("D123");
        assertEquals("D123", manager.getNI());
    }

    @Test
    public void mangerHasSalary(){
        assertEquals(35000, manager.getSalary());
    }

    @Test
    public void managerChangeSalary(){
        manager.setSalary(25000);
        assertEquals(25000, manager.getSalary());
    }

    @Test
    public void checkDepartment(){
        assertEquals("Tech", manager.getDeptName());
    }

    @Test
    public void raiseManagersSalary(){
        manager.raiseSalary(5000);
        assertEquals(40000, manager.getSalary());
    }

    @Test
    public void payManagerBonus(){
        manager.payBonus();
        assertEquals(350, manager.payBonus());
    }

}
