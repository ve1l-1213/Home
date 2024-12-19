package randomjob.entity;

public class Farmer extends Unit{

    public Farmer(String unitId, String name, int age, String gender) {
        super(unitId, name,age, gender);
        setTierLevel(1);
        setJobName("농부");
    }

    void Attack(Unit unit){
        if (unit.getTierLevel() < getTierLevel()){
            System.out.println("괭이 휘두르기!");
        } else {
            System.out.println("공격 실패!");
        }
    }


}
