import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;


public class DEMOTest {
	 DEMO calc=new  DEMO();


@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}


	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Test
	public void testAdd1() {
	assertEquals(calc.add1(5, 5),10);
	}



	@Test
	public void testSub1() {
	assertEquals(calc.sub1(5, 5),0);
	}


}



	


