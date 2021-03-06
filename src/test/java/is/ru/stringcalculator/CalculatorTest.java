package is.ru.stringcalculator;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CalculatorTest {

	public static void main(String args[]) {
      org.junit.runner.JUnitCore.main("is.ru.stringcalculator.CalculatorTest");
    }

	@Test
	public void testEmptyString() {
		assertEquals(0, Calculator.add(""));
	}

	@Test
	public void testOneNumber() {
		assertEquals(1, Calculator.add("1"));
<<<<<<< HEAD
=======
		assertEquals(2, Calculator.add("2"));
>>>>>>> 799af897aab0c4fcb287f341ae43ad200b0cc777
	}

	@Test
	public void testTwoNumbers() {
		assertEquals(3, Calculator.add("1,2"));
	}	

	@Test
<<<<<<< HEAD
    public void testMultipleNumbers(){
    	assertEquals(6, Calculator.add("1,2,3"));
    }

}
=======
    	public void testMultipleNumbers(){
    	assertEquals(6, Calculator.add("1,2,3"));
	}
	@Test
	public void testNewLine(){
	assertEquals(6, Calculator.add("1\n2,3"));
    	}
	
	@Test
	public void testNewDelimiter(){
	assertEquals(3, Calculator.add("//;\n1;2"));
	}

	@Test
	public void testsNegative(){
	try{
	Calculator.add("-1,2");
	}
	catch(RuntimeException ex){
	}
	}

	@Test
	public void ignoreBiggerThan1000(){
	assertEquals(2, Calculator.add("1001,2"));
	}
}
>>>>>>> 799af897aab0c4fcb287f341ae43ad200b0cc777
