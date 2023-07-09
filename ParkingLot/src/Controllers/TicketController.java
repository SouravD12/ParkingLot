package Controllers;

import Models.Tickets;
import Services.TicketService;
import dto.ResponseStatus;
import dto.issueTicketrequestDto;
import dto.issueTicketresponseDto;

public class TicketController {

    private TicketService ticketService;
    issueTicketresponseDto response = new issueTicketresponseDto();

    public TicketController(TicketService ticketService){
        this.ticketService = ticketService;
    }

    public issueTicketresponseDto issueTicket(issueTicketrequestDto request){
        Tickets tickets;
        try {
            tickets = ticketService.issueTicket(request.getVehicleType(),
                    request.getNumber(),request.getVehicleOwnerName(),request.getGateId());
        }catch (Exception e){
            response.setResponseStatus(ResponseStatus.FAILURE);
            return response;

        }



        response.setResponseStatus(ResponseStatus.SUCCESS);
        response.setTickets(tickets);

        return response;
    }
}
