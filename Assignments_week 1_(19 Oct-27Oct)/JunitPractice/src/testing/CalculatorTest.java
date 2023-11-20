package testing;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.RepetitionInfo;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;

import calsy.Calculator;

class CalculatorTest {
	static Calculator cal;
	@BeforeAll
	public static void BeforeAll() {
		System.out.println("before all");
	cal=new Calculator();}
	@Test
	void testAdd() {
		int actual=cal.add(5,4);
		assertEquals(9,actual);
	}

	@Test
	void testSub() {
		int actual=cal.sub(5,4);
		assertEquals(1,actual);
		
	}
	@Test
	@DisplayName("Add operration test")
	@RepeatedTest (5)
	void testaddNumbers(TestInfo testInfo, RepetitionInfo repetitionInfo) {
		
		System.out.println("Running test -> " + repetitionInfo.getCurrentRepetition());
        Assertions.assertEquals(2, cal.add(1, 1), "1 + 1 should equal 2");
    }
		
		
	}


