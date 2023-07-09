package Stratergies;

import Models.Gate;
import Models.ParkingSpots;
import Models.VehicleType;

public interface SpotAssignmentStratergy {
    ParkingSpots getSpot(Gate gate, VehicleType vehicleType);
//        return null;

}
