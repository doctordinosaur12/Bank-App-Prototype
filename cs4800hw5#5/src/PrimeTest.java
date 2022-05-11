import static org.junit.Assert.*;

import org.junit.Test;

public class PrimeTest {

	@Test
	public void test2() {
		boolean b=Prime.isPrime(2);
		assertTrue(b);
	}
	@Test
	public void test3() {
		boolean b=Prime.isPrime(3);
		assertTrue(b);
	}
	@Test
	public void test4() {
		boolean b=Prime.isPrime(4);
		assertTrue(b);
	}
	@Test
	public void test5() {
		boolean b=Prime.isPrime(5);
		assertTrue(b);
	}
	@Test
	public void test6() {
		boolean b=Prime.isPrime(6);
		assertTrue(b);
	}

}
