import junit.framework.*;
import org.junit.Test;
import org.junit.Assert;

public class TennisTest extends TestCase {

	@Test
	public void testTrue() throws Exception {
		assertEquals(true, true);
	}

	@Test
	public void test1() throws Exception {
        String[] tab = {"15", "40"};
        int[] score = {2, 1, 2, 2};
		Assert.assertArrayEquals(tab, Tennis.match(score));
	}

    @Test
	public void test2() throws Exception {
        String[] tab = {"40", "advantage"};
        int[] score = {2, 1, 2, 1, 1, 2, 2, 1, 2};
		Assert.assertArrayEquals(tab, Tennis.match(score));
	}
}
