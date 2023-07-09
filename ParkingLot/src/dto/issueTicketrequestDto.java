package dto;

import Models.VehicleType;

import java.util.function.LongFunction;

public class issueTicketrequestDto {
    private VehicleType vehicleType;
    private String number;
    private String vehicleOwnerName;
    private Long GateId;

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getVehicleOwnerName() {
        return vehicleOwnerName;
    }

    public void setVehicleOwnerName(String vehicleOwnerName) {
        this.vehicleOwnerName = vehicleOwnerName;
    }

    public Long getGateId() {
        return GateId;
    }

    public void setGateId(Long GateId) {
        this.GateId = GateId;
    }
}
