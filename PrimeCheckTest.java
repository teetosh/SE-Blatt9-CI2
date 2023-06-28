import org.junit.Assert;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class PrimeCheckTest {
  // --------------------------------------------------------------- //
  @Test
  public void TestNegativeNumbers() {
    for (int i = -10; i < 0; ++i) {
      assertFalse("Test negative number " + i, PrimeCheck.isPrime(i));
    }
  }

  // --------------------------------------------------------------- //
  @Test
  public void TestEdgeCases() {
    assertFalse("Test 0", PrimeCheck.isPrime(0));
    assertFalse("Test 1", PrimeCheck.isPrime(1));
    assertTrue("Test 2", PrimeCheck.isPrime(2));
  }

  // --------------------------------------------------------------- //
  @Test
  public void testPrimes() {
    assertTrue("Testing for primes..", PrimeCheck.isPrime(17));
    assertTrue("Testing for primes..", PrimeCheck.isPrime(19));
    assertTrue("Testing for primes..", PrimeCheck.isPrime(97));
    assertTrue("Testing for primes..", PrimeCheck.isPrime(113));
  }

  // --------------------------------------------------------------- //
  @Test
  public void testNonPrimes() {
    assertFalse("Testing for non primes..", PrimeCheck.isPrime(90));
    assertFalse("Testing for non primes..", PrimeCheck.isPrime(78));
    assertFalse("Testing for non primes..", PrimeCheck.isPrime(33));
    assertFalse("Testing for non primes..", PrimeCheck.isPrime(56));
  }
}
