package Entity;

import java.util.Dictionary;

public class Ability {
    public String  Name;
    public int AbilityPower;

    public  boolean isAttack;
    public Dictionary<Enviroment,Integer>  AbiltyEnviroment;

/*
    public  Ability(String name,int abilityPower,boolean isAttack
            ,Dictionary<Enviroment,Integer> AbiltyEnviroment )
    {
        this.AbilityPower=
    }
*/

    public Ability(String name, int abilityPower, boolean isAttack, Dictionary<Enviroment, Integer> abiltyEnviroment) {
        Name = name;
        AbilityPower = abilityPower;
        this.isAttack = isAttack;
        AbiltyEnviroment = abiltyEnviroment;
    }

    public Ability(String name, int abilityPower, boolean isAttack) {
        Name = name;
        AbilityPower = abilityPower;
        this.isAttack = isAttack;
    }
}
