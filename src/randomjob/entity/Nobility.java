package randomjob.entity;

public class Nobility extends Unit {
    public Nobility(String unitId, String name, int age, String gender) {
        super(unitId, name, age, gender);
        setTierLevel(3);
        setJobName("귀족");
    }

    @Override
    void Attack(Unit unit) {
        if (unit.getTierLevel() != getTierLevel()){
            System.out.println("사형 집행령");
        } else {
            System.out.println("정치적 중립 시전!");
        }
    }
}
