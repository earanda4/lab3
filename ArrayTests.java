import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
	@Test 
	public void testReverseInPlace() {
    int[] input1 = { 3 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 3 }, input1);

    int[] input2 = { 3, 4, 5};
    ArrayExamples.reverseInPlace(input2);
    assertArrayEquals(new int[]{5,4,3},input2);
	}

  


  @Test
  public void testReversed() {
    int[] input1 = { };
    assertArrayEquals(new int[]{ }, ArrayExamples.reversed(input1));
    
  }

  @Test
  public void newTest(){
    int[] input2 = {4, 5, 3, 2};
    assertArrayEquals(new int[]{2, 3, 5, 4}, ArrayExamples.reversed(input2));
    int[] input3 = {2, 1};
    assertArrayEquals(new int[]{1,2}, ArrayExamples.reversed(input3));
    int[] input4 = {1,2,3,4,5,6,7,8,9};
    assertArrayEquals(new int[]{9,8,7,6,5,4,3,2,1},ArrayExamples.reversed(input4));
  }

  
}


