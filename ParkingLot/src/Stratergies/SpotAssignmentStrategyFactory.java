package Stratergies;

import Models.ParkingSpots;
import Models.SpotAssignmentStratergyType;
import repositories.ParkingLotRepository;

public class SpotAssignmentStrategyFactory {
//    ParkingLotRepository parkingLotRepository;

    static ParkingLotRepository parkingLotRepository = new ParkingLotRepository();
    public static SpotAssignmentStratergy getSpotForType(SpotAssignmentStratergyType type){
        return new RandomSpotAssignmentStratergy(parkingLotRepository);
    }
}
