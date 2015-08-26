package core;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class AllaTest {

	@BeforeClass
	public static void BeforeClass() throws Exception {}
	
	@AfterClass
	public static void AfterClass() throws Exception {}
	
	@Before
	public void Before() throws Exception {}
	
	@After
	public void After() throws Exception {}
	
	@Test
	public void Test_01_assertEquals_Positive() {assertEquals("Strings are different", "Koshka_Mashka", Alla.str);}
	
	@Test
	public void Test_02_assertEquals_Negative() {assertEquals("Strings are different", "Kot Filya", Alla.str);}
	
	@Ignore
	@Test
	public void Test_03_assertEquals_Ignored() {assertEquals("Strings are different", "Koty i Koshki", Alla.str);}
	
	@Test
	public void Test_04_assertSame_Positive(){assertSame("Integer is wrong", 89, Alla.num);}
	
	@Test
	public void Test_05_assertSame_Negative(){assertSame("Integer is wrong", 98, Alla.num);}
	
	@Ignore
	@Test
	public void Test_06_assertSame_Ignored() {assertSame("Integer is wrong", 157, Alla.num);}
	
	@Test
	public void Test_07_assertFalse_Positive() {assertFalse("Boolean should be false", Alla.fl);}

	@Test
	public void Test_08_assertFalse_Negative() {assertFalse("Boolean should be false", Alla.tr);}
	
	@Test
	public void Test_09_assertTrue_Positive() {assertTrue("Boolean should be true", Alla.tr);}
	
	@Test
	public void Test_10_assertTrue_Negative() {assertTrue("Boolean should be true", Alla.fl);}
}
