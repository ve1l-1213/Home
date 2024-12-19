package randomjob.entity;

public class Knight extends Unit {
    public Knight(String unitId, String name, int age, String gender) {
        super(unitId, name, age, gender);
        setTierLevel(2);
    }
}
