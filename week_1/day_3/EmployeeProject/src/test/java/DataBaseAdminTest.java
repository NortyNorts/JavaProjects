import org.junit.Before;
import org.junit.Test;
import staff.techStaff.DataBaseAdmin;


import static org.junit.Assert.assertEquals;

public class DataBaseAdminTest {

    DataBaseAdmin dataBaseAdmin;

    @Before
    public void before(){
        dataBaseAdmin = new DataBaseAdmin("John", "DJ123456N", 35000);
    }

    @Test
    public void dataBaseAdminHasName(){
        assertEquals("John", dataBaseAdmin.getName());
    }

    @Test
    public void dataBaseAdminChangeName(){
        dataBaseAdmin.setName("James");
        assertEquals("James", dataBaseAdmin.getName());
    }

    @Test
    public void dataBaseAdminHasNINumber(){
        assertEquals("DJ123456N", dataBaseAdmin.getNI());
    }

    @Test
    public void dataBaseAdminChangeNI(){
        dataBaseAdmin.setNI("D123");
        assertEquals("D123", dataBaseAdmin.getNI());
    }

    @Test
    public void dataBaseAdminHasSalary(){
        assertEquals(35000, dataBaseAdmin.getSalary());
    }

    @Test
    public void dataBaseAdminChangeSalary(){
        dataBaseAdmin.setSalary(25000);
        assertEquals(25000, dataBaseAdmin.getSalary());
    }

    @Test
    public void dataBaseAdminManagersSalary(){
        dataBaseAdmin.raiseSalary(5000);
        assertEquals(40000, dataBaseAdmin.getSalary());
    }

    @Test
    public void dataBaseAdminManagerBonus(){
        dataBaseAdmin.payBonus();
        assertEquals(350, dataBaseAdmin.payBonus());
    }

}
