package Entity;

import java.util.List;

public class SuperHero extends  Person {

    public String surname;
    public List<Ability> Weaknesses;
    public List<Ability> AbilityList;

    public SuperHero(String name, int age,String surname,int HealthPoint) {
        super(name, age,HealthPoint);
        this.surname=surname;
    }
}
