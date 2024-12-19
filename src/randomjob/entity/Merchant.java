package randomjob.entity;

public class Merchant extends Unit {
    public Merchant(String unitId, String name, int age, String gender) {
        super(unitId, name, age, gender);
        setTierLevel(2);
    }
}
