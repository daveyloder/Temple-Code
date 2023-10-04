package Assignment_04;

import static org.junit.Assert.*;

import org.junit.Test;

public class GameTest extends Game {
    @Test
    public void testwinner() {
        assertEquals("userwins", "user", Game.checkforwinner("Melltorp", "Olserod"));
        assertEquals("computerwinssamemove", "odin", Game.checkforwinner("Melltorp", "Melltorp"));
        assertEquals("computerwinsdifferentmove", "odin", Game.checkforwinner("Olserod", "Melltorp"));
    }

}
