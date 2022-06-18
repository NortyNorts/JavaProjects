import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RoomTest {

    Room room;

    @Before
    public void before(){
        room = new Room(RoomType.DOUBLE);
    }

    @Test
    public void canGetRoomType() {
        assertEquals(RoomType.DOUBLE, room.getRoomType());
    }

    @Test
    public void doubleHasValueOf2(){
        assertEquals(2, room.getValueFromEnum());
    }



//    @Test
//    public void canMispellRoomType(){
//        Room room1 = new Room("Douuble");
//        assertEquals("Douuble", room1.getRoomType());
//    }
//
//    @Test
//    public void canBeAConfusingName(){
//        Room room2 = new Room("Spagnana");
//        assertEquals("Spagnana", room2.getRoomType());
//    }

}
