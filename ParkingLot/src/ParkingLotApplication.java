import Controllers.TicketController;
import Services.TicketService;
import repositories.GateRepository;
import repositories.ParkingLotRepository;
import repositories.Ticketrepository;
import repositories.VehicleRepositories;

public class ParkingLotApplication {
    public static void main(String[] args){
        GateRepository gateRepository = new GateRepository();
        ParkingLotRepository parkingLotRepository = new ParkingLotRepository();
        Ticketrepository ticketrepository = new Ticketrepository();
        VehicleRepositories vehicleRepositories = new VehicleRepositories();
        TicketService ticketService = new TicketService(gateRepository,vehicleRepositories,
                parkingLotRepository,ticketrepository);

        TicketController ticketController = new TicketController(ticketService);
    }
}