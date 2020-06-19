package day42;

import org.junit.Assert;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class MethodsTest {
	static Methods obj;
	
	// when you test you will have always:
	// 1. input
	// 2. actual result
	// 3. expected result - always based on requirement 
	// Add JUnit5 Libraries
	
	//@BeforeEach
	public void setUp() {
		// runs before each test case
		System.out.println("Test is starting..");
		// Data prep
	}
	
	//@AfterEach
	public void tearDown() {
		// runs after each test case
		System.out.println("Test is completed.");
		// Clean up
		// Hooks
	}
	
	@BeforeAll
	public static void setUpAll() {
		// runs before all test cases (suit)
		System.out.println("TEST IS STARTING:");
		obj = new Methods();
	}
	
	@AfterAll
	public static void tearDownAll() {
		// runs after all test cases (suit)
		System.out.println("TEST IS COMPELETED.");
	}
	
	@Test
	public void testSum1() {	
		int actualResult = obj.sum(6, 4);
		int expectedResult = 10;
		
		Assert.assertEquals(expectedResult, actualResult);
	}
	
	@Test
	public void testSum2() {
		int actualResult = obj.sum(-2, 5);
		int expectedResult = 3;
		
		System.out.println("actual: " + actualResult);
		System.out.println("expected: " + expectedResult);
		
		Assert.assertEquals(expectedResult, actualResult);
	}
	
	@Test
	public void testSum3() {
		Assert.assertEquals(1000, obj.sum(500, 500));
	}
	
	@Test
	public void testIsEven1() {
		boolean actualResult = obj.isEven(7);
		boolean expectedResult = false;
		
		Assert.assertEquals(expectedResult, actualResult);
	}
	
	@Test
	public void testIsEven2() {
		boolean actualResult = obj.isEven(100);
		// Assert methods can accept messages. If failed will show this message
		Assert.assertTrue("Expecting true but was false", actualResult);
	}
	
	@Test
	public void testIsEven3() {
		boolean actualResult = obj.isEven(-3);
		Assert.assertFalse(actualResult);
	}
	
	
	@Test
	public void testIsOdd1() {
		boolean actualResult = obj.isOdd(5);
		Assert.assertTrue(actualResult);
	}
	
	@Test
	public void testIsOdd2() {	
		try {
			boolean actualResult = obj.isOdd(-8);
			
			Assert.fail("I was expecting Exception here, but nothing");
		}catch(IllegalArgumentException e) {
			System.out.println("All good");			
		}		
	}
	
	
	@Test
	public void testReverse1() {
		String actualResult = obj.reverse("apple");
		String expectedResult = "elppa";
		Assert.assertEquals(expectedResult, actualResult);
	}
	
	@Test
	public void testReverse2() {
		String actualResult = obj.reverse("");
		String expectedResult = "";
		Assert.assertEquals(expectedResult, actualResult);
	}
	
	//TODO TEST CASES FOR reverseArr(int[] arrNum). 3 test cases
	
	@Test
	public void testReverseArr() {
		int[] inputData = {1, 2, 3, 4, 5};		
		int[] expectedResult = {5, 4, 3, 2, 1};
		
		obj.reverseArr(inputData);
		
		Assert.assertArrayEquals(expectedResult, inputData);
	}
	
	@Test
	public void testReverseArr1() {
		int[] inputData = {};
		
		try {
			obj.reverseArr(inputData);
			
			Assert.fail("Exception was not there");
		}catch(IllegalArgumentException e) {
			// Exception as expected 
		}
	}
	
	@Test
	public void testReverseArr2() {
		int[] inputData = {1};
		int[] expectedResult = {1};
		
		obj.reverseArr(inputData);
		
		Assert.assertArrayEquals(expectedResult, inputData);
	}
	
}
