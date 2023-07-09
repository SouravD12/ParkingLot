package repositories;

import Models.Gate;

import java.util.Map;
import java.util.Optional;
import java.util.TreeMap;

public class GateRepository {
    private Map<Long,Gate> gates = new TreeMap<>();

    //May return a Gate object , may return nothing . Optional is like a wrapper over an object
    public Optional<Gate> findGateById(long gateId){
        if (gates.containsKey(gateId)){
            return Optional.of(gates.get(gateId));
        }
        return Optional.empty();
    }
}
