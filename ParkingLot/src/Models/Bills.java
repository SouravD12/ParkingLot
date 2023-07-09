package Models;

import java.sql.Time;
import java.util.Date;
import java.util.List;

public class Bills extends BaseModel {
//    private int id;
    private int amount;
    private Date exit_time;
    private Tickets tickets;
    private Gate gates;
    private Operators generatedBy;
//    private BillStatus billStatus;
    private BillStatus billStatus;
    private List<Payments> payments;
    private FeesCalculatorStratergyType feesCalculatorStratergyTypes;

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public Date getExit_time() {
        return exit_time;
    }

    public void setExit_time(Date exit_time) {
        this.exit_time = exit_time;
    }

    public Tickets getTickets() {
        return tickets;
    }

    public void setTickets(Tickets tickets) {
        this.tickets = tickets;
    }

    public Gate getGates() {
        return gates;
    }

    public void setGates(Gate gates) {
        this.gates = gates;
    }

    public Operators getGeneratedBy() {
        return generatedBy;
    }

    public void setGeneratedBy(Operators generatedBy) {
        this.generatedBy = generatedBy;
    }

    public BillStatus getBillStatus() {
        return billStatus;
    }

    public void setBillStatus(BillStatus billStatus) {
        this.billStatus = billStatus;
    }

    public List<Payments> getPayments() {
        return payments;
    }

    public void setPayments(List<Payments> payments) {
        this.payments = payments;
    }

    public FeesCalculatorStratergyType getFeesCalculatorStratergyTypes() {
        return feesCalculatorStratergyTypes;
    }

    public void setFeesCalculatorStratergyTypes(FeesCalculatorStratergyType feesCalculatorStratergyTypes) {
        this.feesCalculatorStratergyTypes = feesCalculatorStratergyTypes;
    }
}
