package Services;

import Exceptions.GateNotFoundException;
import Models.*;
import Stratergies.SpotAssignmentStrategyFactory;
import Stratergies.SpotAssignmentStratergy;
import repositories.GateRepository;
import repositories.ParkingLotRepository;
import repositories.Ticketrepository;
import repositories.VehicleRepositories;

import java.util.Date;
import java.util.Optional;

public class TicketService {

//    Tickets tickets = new Tickets();
    private GateRepository gateRepository;
    private VehicleRepositories vehicleRepositories;
//    private SpotAssignmentStratergyType spotAssignmentStrategy;
    private ParkingLotRepository parkingLotRepository;
    private Ticketrepository ticketrepository;

    public TicketService(GateRepository gateRepository,
                         VehicleRepositories vehicleRepositories,
                         ParkingLotRepository parkingLotRepository,
                         Ticketrepository ticketrepository){
        this.gateRepository = gateRepository;
        this.vehicleRepositories = vehicleRepositories;
        this.parkingLotRepository = parkingLotRepository;
        this.ticketrepository = ticketrepository;
    };


    public Tickets issueTicket(VehicleType vehicleType, String number, String vehicleOwnerName, Long GateId) throws GateNotFoundException {
        Tickets tickets = new Tickets();
        tickets.setEntry_time(new Date());
        Optional<Gate> gateOptional = gateRepository.findGateById(GateId);
        if (gateOptional.isEmpty()){
            throw new GateNotFoundException();
        }
        Gate gate = gateOptional.get();
        tickets.setGenerated_At(gate);
        tickets.setGenerated_By(gate.getCurrentOperator());
        Vehicle saveVehicle;

//        String Number = null;
        Optional<Vehicle>vehicleOptional = vehicleRepositories.getVehicleNumber(number);
        if (vehicleOptional.isEmpty()){
//            throw new
            Vehicle vehicle = new Vehicle();
            vehicle.setNumber(number);
            vehicle.setVehicleType(vehicleType);
            vehicle.setOwner_name(vehicleOwnerName);

            saveVehicle = vehicleRepositories.saveVehicle(vehicle);
        }
        else{
            saveVehicle = vehicleOptional.get();
        }
        tickets.setVehicle(saveVehicle);
        SpotAssignmentStratergyType assignmentStratergyType = parkingLotRepository.getParkingLotForGate(gate).
                getSpotAssignmentStratergyType();
        SpotAssignmentStratergy spotAssignmentStratergy = SpotAssignmentStrategyFactory.getSpotForType
                (assignmentStratergyType);
        tickets.setParkingSpots(spotAssignmentStratergy.getSpot(gate,vehicleType));
//        tickets.setParkingSpots();

        tickets.setNumber("TICKET"+tickets.getId());
        return ticketrepository.saveTicket(tickets);
//        return tickets;

    }

}
