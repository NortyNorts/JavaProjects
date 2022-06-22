import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class NumberListTest {

    private NumberList myNumbers;

    @Before
    public void before(){
//        myNumbers = new NumberList();
        ArrayList<Integer> testNumbers = new ArrayList<>();
        testNumbers.add(1);
        testNumbers.add(2);
        testNumbers.add(3);
        testNumbers.add(4);
        myNumbers = new NumberList(testNumbers);
    }

    @Test
    public void hasNumberOfEntries(){
        assertEquals(4, myNumbers.getNumbersOfItems());
    }

    @Test
    public void canAddItemsToList(){
        myNumbers.addItems(1);
        assertEquals(5, myNumbers.getNumbersOfItems());
    }

    @Test
    public void canGetTheIndexItem(){
        assertEquals(1, myNumbers.getNumberAtInsdex(0));
    }

    @Test
    public void canClearArrayList(){
        myNumbers.clearArrayList();
        assertEquals(0, myNumbers.getNumbersOfItems());
    }

    @Test
    public void canAddItemsInTheList(){
        assertEquals(10, myNumbers.getTotal());
    }
}
