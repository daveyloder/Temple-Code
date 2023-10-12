package Assignment_06;

import static org.junit.Assert.assertEquals;
import org.junit.*;

public class WebifyTest extends Webify_v4 {

    @Test
    public void testChecks() {
        assertEquals("<a href=\"https://davidloder.com\">DavidLoderWebsite</a>",
                Webify_v4.checkUrl("[[https://davidloder.com][DavidLoderWebsite]]"));
        assertEquals("<ul><li>This is a list item</li></ul>",
                Webify_v4.checkList("- This is a list item"));
    }

}
