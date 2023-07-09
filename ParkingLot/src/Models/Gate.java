package Models;

public class Gate extends BaseModel {
//    int id;
    private GateType gateType;
    private int GateNum;
    private Operators currentOperator;
    private GatesStatus gatesStatus;

    public GateType getGateType() {
        return gateType;
    }

    public void setGateType(GateType gateType) {
        this.gateType = gateType;
    }

    public int getGateNum() {
        return GateNum;
    }

    public void setGateNum(int gateNum) {
        GateNum = gateNum;
    }

    public Operators getCurrentOperator() {
        return currentOperator;
    }

    public void setCurrentOperator(Operators currentOperator) {
        this.currentOperator = currentOperator;
    }

    public GatesStatus getGatesStatus() {
        return gatesStatus;
    }

    public void setGatesStatus(GatesStatus gatesStatus) {
        this.gatesStatus = gatesStatus;
    }
}
