import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
	@Test 
	public void testReverseInPlace() {
    int[] input1 = { 3 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 3 }, input1);
	}


  @Test
  public void testReversed() {
    int[] input1 = { };
    assertArrayEquals(new int[]{ }, ArrayExamples.reversed(input1));
  }

  @Test 
  public void testReversed2() {
    int [] input2 = {1, 2, 3, 4, 5};
    assertArrayEquals(new int[]{5, 4, 3, 2, 1}, ArrayExamples.reversed(input2));
  }

  @Test 
	public void testReverseInPlace2() {
    int[] input3 = { 1, 2, 3, 4 };
    ArrayExamples.reverseInPlace(input3);
    assertArrayEquals(new int[]{ 4, 3, 2, 1 }, input3);
	}

  @Test
  public void testReversed3() {
    int[] input4 = {1, 2};
    assertArrayEquals(new int[]{2, 1}, ArrayExamples.reversed(input4));
  }

  @Test
  public void testAverage() {
    double[] input5 = {1, 2, 4, 6};
    assertArrayEquals(3.0, ArrayExamples.averageWithoutLowest(input5));

  }
}
