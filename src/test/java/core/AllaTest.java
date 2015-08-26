package core;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.omg.Messaging.SyncScopeHelper;

public class AllaTest {

	@BeforeClass
	public static void BeforeClass() {
		System.out.println("BeforeClass method is being executed before the very first test starts");
	}
	
	@AfterClass
	public static void AfterClass() {
		System.out.println("AFterClass method is being executed after the very last test");
	}
	
	@Before
	public void Before() {
		System.out.println("Before method is being executed before EACH test");
	}
	
	@After
	public void After() {
		System.out.println("After method is being executed after each test");
	}
	
	@Test
	public void Test_01_assertEquals_Positive() {
		System.out.println("Test_01-assertEquals_Positive");
	}
	
	@Test
	public void Test_02_assertEquals_Negative() {
		System.out.println("Test_02_assertEquals_Negative");
	}
	
	@Ignore
	@Test
	public void Test_03_assertEquals_Ignored() {
		System.out.println("Test_03_assertEquals_Ignored");
	}
	
	@Test
	public void Test_04_assertSame_Positive(){
		System.out.println("Test_04_assertSame_Positive");
	}
	
	@Test
	public void Test_05_assertSame_Negative(){
		System.out.println("Test_05_assertSame_Negative");
	}
	
	@Ignore
	@Test
	public void Test_06_assertSame_Ignored() {
		System.out.println("Test_06_assertSame_Ignored");
	}
	
	@Test
	public void Test_07_assertFalse_Positive() {
		System.out.println("Test_07_assertFalse_Positive");
	}

	@Test
	public void Test_08_assertFalse_Negative() {
		System.out.println("Test_08_assertFalse_Negative");
	}
	
	@Test
	public void Test_09_assertTrue_Positive() {
		System.out.println("Test_09_assertTrue_Positive");
	}
	
	@Test
	public void Test_10_assertTrue_Negative() {
		System.out.println("Test_10_assertTrue_Negative");
	}
}
