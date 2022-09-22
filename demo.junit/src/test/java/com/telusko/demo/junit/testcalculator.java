<<<<<<< HEAD
package com.telusko.demo.junit;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class testcalculator {
	calculator c=null;
	@Before
	public void setup()
	{
		c=new calculator();
	}

	@Test
	public void test() {
		assertEquals(5,c.add(2, 3));
	}

}
=======
package com.telusko.demo.junit;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class testcalculator {
	calculator c=null;
	@Before
	public void setup()
	{
		c=new calculator();
	}

	@Test
	public void test() {
		assertEquals(5,c.add(2, 3));
	}

}
>>>>>>> ad496f27f395f5932f9e6cec6d7ceaef4b9e576b
