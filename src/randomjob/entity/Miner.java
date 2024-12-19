package randomjob.entity;

import java.awt.*;

public class Miner extends Unit {
    public Miner(String unitId, String name, int age, String gender) {
        super(unitId, name, age, gender);
        setTierLevel(1);
        setJobName("광부");
    }

    @Override
    void Attack(Unit unit) {
        if (unit.getTierLevel() < getTierLevel()){
            System.out.println("곡괭이 휠윈드!");
        } else if (unit.getTierLevel() == getTierLevel()){
            System.out.println("빗나감!");
        } else {
            System.out.println("죽음!");
        }
    }
}
