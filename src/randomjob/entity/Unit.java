package randomjob.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import randomjob.repository.UnitRepository;

@ToString
public class Unit {

    private String unitId;
    private String name;
    @Setter
    private String jobName;
    private int age;
    private String gender;
    @Setter
    @Getter
    private int tierLevel;

    public Unit(String unitId, String name, int age, String gender) {
        this.unitId = unitId;
        this.name = name;
        this.jobName = jobName;
        this.age = age;
        this.gender = gender;
    }

    void Attack(Unit unit) {

    }

}
