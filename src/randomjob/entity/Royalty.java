package randomjob.entity;

import lombok.ToString;

public class Royalty extends Unit {

    public Royalty(String unitId, String name, int age, String gender) {
        super(unitId, name, age, gender);
        setTierLevel(3);
        setJobName("왕족");
    }

    @Override
    void Attack(Unit unit){
        if (unit.getTierLevel() != getTierLevel()){
            System.out.println("사형 집행령");
        } else {
            System.out.println("정치적 중립 시전!");
        }
    }
}
