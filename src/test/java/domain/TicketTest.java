package domain;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class TicketTest {
        private Ticket first=new Ticket(1,2000,"DME","EGO",320);
        private Ticket second=new Ticket(2,3000,"DME","EGO",230);
        private Ticket third=new Ticket(3,2500,"DME","EGO",450);
        private Ticket forth=new Ticket(4,2200,"DME","EGO",200);
        private Ticket fifth=new Ticket(5,3500,"DME","EGO",180);

        @Test
        public void shouldTicketTest() {
            Ticket[] expected=new Ticket[]{first,forth,third,second,fifth};
            Ticket[] actual=new Ticket[]{first,second,third,forth,fifth};
            Arrays.sort(actual);
            assertArrayEquals(expected,actual);

        }

}