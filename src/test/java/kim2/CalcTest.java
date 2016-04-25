package kim2;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalcTest {

	@Test
	public void addTest() {

		clac c1=new clac();
		c1.add(5, 6);
		assertEquals(11,c1.getResult());
		
	}

}
