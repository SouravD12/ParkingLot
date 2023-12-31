package repositories;

import Models.Gate;
import Models.ParkingLot;

import java.util.Map;
import java.util.TreeMap;

public class ParkingLotRepository {
    private Map<Long,ParkingLot> parkingLotMap = new TreeMap<>();
    public ParkingLot getParkingLotForGate(Gate gate){
        for(ParkingLot parkingLot: parkingLotMap.values()){
            if (parkingLot.getGates().contains(gate)){
                return parkingLot;
            }

        }
        return null;

    }
}
