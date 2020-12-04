package interview;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestMultiples {

	@Test
	void testWriteEquation() {
		String s = Multiples.writeEquation(1, 10);
		assertTrue(s != null);
		assertTrue(!s.isBlank());
	}

}
