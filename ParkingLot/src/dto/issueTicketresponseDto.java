package dto;

import Models.Tickets;

public class issueTicketresponseDto {

    private ResponseStatus responseStatus;

    private Tickets tickets;


    // Returning the entire Tickets object because all the data in the tickets class can be presented to the client.

    public Tickets getTickets() {
        return tickets;
    }

    public void setTickets(Tickets tickets) {
        this.tickets = tickets;
    }

    public ResponseStatus getResponseStatus() {
        return responseStatus;
    }

    public void setResponseStatus(ResponseStatus responseStatus) {
        this.responseStatus = responseStatus;
    }
}
