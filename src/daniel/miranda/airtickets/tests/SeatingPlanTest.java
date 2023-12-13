package daniel.miranda.airtickets.tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import com.cc.airline.ticketing.SeatingPlan;

public class SeatingPlanTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println(
				"Starting test of the SeatingPlan default constructor:setUpBeforeClass");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println(
				"Starting test of the SeatingPlan default constructor:setUpBeforeClass:tearDownAfterClass()");
	}


	@Before
	public void setUp() throws Exception {
		System.out.println(
				"Starting test of the SeatingPlan default constructor:setUpBeforeClass:setUp()");
	}
	
	@After
	public void tearDown() throws Exception {
		System.out.println(
				"Starting test of the SeatingPlan default constructor:setUpBeforeClass:tearDownAfterClass():tearDown()");
	
	}

	@Test
	public void testSeatingPlan() {
		//fail("Not yet implemented");
		SeatingPlan sp = new SeatingPlan();
		assertNotNull(sp);
		assertEquals(sp.getSeats().size(), 14);
		assertNotNull(sp.getSeatReserver());
		
		int actualNumBusSeats = sp.getNumBusSeats();
		int actualNumTotalRows = sp.getTotalRows();
		int actualTotalSeats = sp.getTotalSeats();
		
		int expectedNumBusSeats = 2;
		int expectedNumTotalRows = 4;
		int expectedNumTotalSeats = 14;
		
		assertEquals(expectedNumBusSeats, actualNumBusSeats);
		assertEquals(expectedNumTotalRows, actualNumTotalRows);
		assertEquals(expectedNumTotalSeats, actualTotalSeats);
	}

}
