package in.subha;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import org.junit.jupiter.api.Test;

public class CalculatorTest {
	
	@Test
	public void testMultiplicationOfTwoNumbers() {
		Calculator c=new Calculator();
		Integer mul=c.multiplicationOfTwoNumbers(10, 20);
		assertEquals(200,mul);	
	}
	@Test
	public void testSumOfTwoNumbers() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		Method method = Calculator.class.getDeclaredMethod("sumOfTwoNumbers", Integer.class,Integer.class);
		method.setAccessible(true);
		Calculator c=new Calculator();
		int sum=(int)method.invoke(c, 10,20);
		assertEquals(30,sum);
	}

}
