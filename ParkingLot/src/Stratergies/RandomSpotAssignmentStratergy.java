package Stratergies;

import Models.*;
import repositories.ParkingLotRepository;

public class RandomSpotAssignmentStratergy implements SpotAssignmentStratergy {

    private ParkingLotRepository parkingLotRepository;

    public RandomSpotAssignmentStratergy(ParkingLotRepository parkingLotRepository){
        this.parkingLotRepository = parkingLotRepository;
    }

    @Override
    public ParkingSpots getSpot(Gate gate, VehicleType vehicleType) {
        ParkingLot parkingLot = parkingLotRepository.getParkingLotForGate(gate);
        for(ParkingFloor parkingFloor: parkingLot.getParkingFloors()){
            for (ParkingSpots parkingSpots : parkingFloor.getParkingSpots()){
//                if ((parkingSpots.getSupportedVehicleType(vehicleType)) && (parkingSpots.getParkingSpotStatus()
//                        .equals(ParkingSpotStatus.EMPTY)));
                if (parkingSpots.getSupportedVehicleType().contains(vehicleType) &&
                        parkingSpots.getParkingSpotStatus().equals(ParkingSpotStatus.EMPTY))
                return parkingSpots;
            }
        }
        return null;
    }
}
