import Entity.Ability;
import Entity.Enviroment;
import Entity.SuperHero;

import java.util.Arrays;
import java.util.Dictionary;
import java.util.List;

public class Main {
    public List<SuperHero> Heros;
    public List<Ability> abilityList;
    public List<Enviroment> EnviromentList;
    public void  Seed(){


        EnviromentList=Arrays.asList(
               new Enviroment("Dağ"),
                new Enviroment("Bayır"),
                new Enviroment("Deniz"),
                new Enviroment("Şehir"),
                new Enviroment("Çayır")

        );
         //dict.put("apple", 1);
       abilityList= Arrays.asList
               (
               new Ability("uçmak",-1,false)


              );


    };
    public static void main(String[] args)
    {

        /*
        System.out.println("Hello world!");

        Delegatefunc func= new Delegatefunc();
       String result= func.ExecuteFunc((x)->x.toUpperCase(),"hasan");
       System.out.println(result);

         */


    }
}