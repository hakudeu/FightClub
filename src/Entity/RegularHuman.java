package Entity;

import java.util.List;

public class RegularHuman extends  Person{

    public List<Ability> Weaknesses;
    public List<Ability> AbilityList;


    public RegularHuman(String name, int age) {
        super(name, age);
    }
}
