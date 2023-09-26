package Assignment_04;

import Assignment_04.Game;
import static org.junit.Assert.*;

import org.junit.Test;

public class GameTest {
    @Test
    public void testwinner() {
        assertEquals("userwins", "user", Assignment_04.Game.checkforwinner("Melltorp", "Olserod"));
        assertEquals("computerwinssamemove", "odin", Assignment_04.Game.checkforwinner("Melltorp", "Melltorp"));
        assertEquals("computerwinsdifferentmove", "odin", Assignment_04.Game.checkforwinner("Olserod", "Melltorp"));
    }
}
