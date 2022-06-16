import org.junit.Before;
import org.junit.Test;
import staff.management.Director;

import static org.junit.Assert.assertEquals;

public class DirectorTest {

    Director director;

    @Before
    public void before(){
        director = new Director("John", "DJ123456N", 35000, 200000);
    }

    @Test
    public void directorHasName(){
        assertEquals("John", director.getName());
    }

    @Test
    public void directorChangeName(){
        director.setName("James");
        assertEquals("James", director.getName());
    }

    @Test
    public void directorHasNINumber(){
        assertEquals("DJ123456N", director.getNI());
    }

    @Test
    public void directorChangeNI(){
        director.setNI("D123");
        assertEquals("D123", director.getNI());
    }

    @Test
    public void directorHasSalary(){
        assertEquals(35000, director.getSalary());
    }

    @Test
    public void directorChangeSalary(){
        director.setSalary(25000);
        assertEquals(25000, director.getSalary());
    }

    @Test
    public void checkBudget(){
        assertEquals(200000, director.getBudget(), 0.0);
    }

    @Test
    public void raiseDirectorSalary(){
        director.raiseSalary(5000);
        assertEquals(40000, director.getSalary());
    }

    @Test
    public void payDirectorBonus(){
        director.payBonus();
        assertEquals(700, director.payBonus());
    }

}
