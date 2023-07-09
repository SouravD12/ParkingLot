package repositories;

import Models.Tickets;

import java.util.Map;
import java.util.TreeMap;

public class Ticketrepository {
    private Map<Long,Tickets> ticketsMap = new TreeMap<>();
    private int previousId = 0;
    public Tickets saveTicket(Tickets tickets) {
//        for(Tickets ti
        previousId+=1;
//        tickets.setId(long(previousId));
        tickets.setId(previousId);
        ticketsMap.put((long) previousId,tickets);

        return null;

        }

    }

