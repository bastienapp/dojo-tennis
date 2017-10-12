import junit.framework.*;
import org.junit.Test;
import java.util.HashMap;

public class TennisTest extends TestCase {

	@Test
	public void testTrue() throws Exception {
		assertEquals(true, true);
	}

	@Test
	public void test1() throws Exception {
		Tennis tennis = new Tennis("a", "b");
		HashMap scores = new HashMap<String, String>();
        scores.put(tennis.getPlayer1(), "15");
        scores.put(tennis.getPlayer2(), "0");
        int[] points = new int[]{1};

		assertEquals(scores, tennis.getScore(points));
	}

	@Test
	public void test2() throws Exception {
		Tennis tennis = new Tennis("a", "b");
		HashMap scores = new HashMap<String, String>();
        scores.put(tennis.getPlayer1(), "30");
        scores.put(tennis.getPlayer2(), "40");
        int[] points = new int[]{1,2,1,2,2};

		assertEquals(scores, tennis.getScore(points));
	}

	@Test
	public void test3() throws Exception {
		Tennis tennis = new Tennis("a", "b");
		HashMap scores = new HashMap<String, String>();
        scores.put(tennis.getPlayer1(), "40");
        scores.put(tennis.getPlayer2(), "advantage");
        int[] points = new int[]{1,2,1,2,2,1,1,2,2};

		assertEquals(scores, tennis.getScore(points));
	}
}