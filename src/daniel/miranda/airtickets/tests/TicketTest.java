package daniel.miranda.airtickets.tests;

import static org.junit.Assert.*;

import org.junit.Test;

import com.cc.airline.passengers.PassengerName;
import com.cc.airline.passengers.Passenger;
import com.cc.airline.ticketing.Seat;
import com.cc.airline.ticketing.Ticket;

public class TicketTest {

    @Test
    public void testTicketGood() {
        // Step iii: Create a Passenger object
    	Passenger passenger = new Passenger(new PassengerName("Mary", "I", "Worth"));

        // Step iv: Create a Seat object
        Seat seat = new Seat();
        seat.setRow(3);
        seat.setLetter('D');

        // Step v: Create a Ticket object
        double price = 500.0;
        Ticket ticket = new Ticket(passenger, seat, price);

        // Step b: Verify that the ticket number is greater than 1,000,000
        assertTrue(ticket.getTicketNo() > 1000000);
    }

    @Test( expected=Exception.class)
    public void testTicketBad() {
    Ticket ticket = new Ticket(null, new Seat(), -100);
    assertTrue(ticket.getTicketNo() > 1000000 );
    }
}
