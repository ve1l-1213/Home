package randomjob.repository;

import randomjob.entity.Unit;

import java.util.ArrayList;
import java.util.List;

    public class UnitRepository {
    List<Unit> units;
    private static UnitRepository unitRepository;

    private UnitRepository(){
        units = new ArrayList<>();
    }

    public static UnitRepository getUitRepository(){
        if(unitRepository == null){
            unitRepository = new UnitRepository();
        }
        return unitRepository;
    }

    void addUnit(Unit unit){
        units.add(unit);
    }

}
