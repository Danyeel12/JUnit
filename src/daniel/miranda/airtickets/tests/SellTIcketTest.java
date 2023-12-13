package daniel.miranda.airtickets.tests;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import com.cc.airline.passengers.PassengerName;
import com.cc.airline.passengers.Passenger;
import com.cc.airline.ticketing.Seat;
import com.cc.airline.ticketing.Ticket;
import com.cc.airline.ticketing.Seat;
import com.cc.airline.ticketing.SeatingClass;
import com.cc.airline.passengers.StaffPassenger;




public class SellTIcketTest {

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        System.out.println("Setting up SellTicketTest");
    }

    @AfterClass
    public static void tearDownAfterClass() throws Exception {
        System.out.println("Tearing down SellTicketTest");
    }

    @Test
    public void sellTIcket1() {
        // Step a: Create objects and call sellTicket() method
        SeatingClass sClass = SeatingClass.ECONOMY;
        Passenger passenger = new Passenger(new PassengerName("Daniel", "I", "Miranda"));
        Seat seat = new Seat();
        seat.setRow(3);
        seat.setLetter('D');
        double price = sClass.getPrice();
        Ticket ticket = new Ticket(passenger, seat, price);

        System.out.println("Ticket issued: " + ticket);

        // Step b: Verify the ticket price
        assertEquals(500.0, ticket.getPrice(), 0.005);
    }

    @Test
    public void sellTIcket2() {
    	
    	PassengerName pName = new
    			PassengerName("Daniel", "I", "Miranda");
    			StaffPassenger passenger = new StaffPassenger(pName, "EMP123");
    }

    @Test
    public void sellTIcket3() {
    	SeatingClass sClass = SeatingClass.BUSINESS;
    }

}
