import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HumanTest {

    private Human human;

    @Before
    public void before(){
        human = new Human(0);
    }

    @Test
    public void canTalk(){
        assertEquals("I can talk", human.canTalk());
    }

}
