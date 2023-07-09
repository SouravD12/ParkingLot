package Models;

//import java.sql.Time;
import java.util.Date;

public class Tickets extends BaseModel{
//    private int id;
    private String number;
    private Date entry_time;
    private Vehicle vehicle;
    private ParkingSpots parkingSpots;
    private Gate generated_At;
    private Operators generated_By;

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Date getEntry_time() {
        return entry_time;
    }

    public void setEntry_time(Date entry_time) {
        this.entry_time = entry_time;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public ParkingSpots getParkingSpots() {
        return parkingSpots;
    }

    public void setParkingSpots(ParkingSpots parkingSpots) {
        this.parkingSpots = parkingSpots;
    }

    public Gate getGenerated_At() {
        return generated_At;
    }

    public void setGenerated_At(Gate generated_At) {
        this.generated_At = generated_At;
    }

    public Operators getGenerated_By() {
        return generated_By;
    }

    public void setGenerated_By(Operators generated_By) {
        this.generated_By = generated_By;
    }
}
