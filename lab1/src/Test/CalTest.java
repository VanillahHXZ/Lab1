package Test;


import static org.junit.Assert.assertEquals;

import org.junit.Test

import Lab.Cal;;

public class CalTest {
	
	Cal cal = new Cal();
	
	@Test
	public void test() {
		assertEquals( false, cal.coin(100) );
		assertEquals( true, cal.coin(20) );
		assertEquals( true, cal.coin(53) );
		assertEquals( true, cal.coin(50) );
		assertEquals( true, cal.coin(10) );
		assertEquals( true, cal.coin(11) );
		assertEquals( true, cal.coin(22) );
		assertEquals( true, cal.coin(55) );
		assertEquals( false, cal.coin(14) );
	}
	
	public static void main(String[] args) {
		
		CalTest te = new CalTest();
		te.test();
	}


}
