package Entity;

import jdk.internal.instrumentation.Logger;

import java.util.Date;

public class Person   {
    public String name;
   // public String surname;
    public int age;

    public int HealthPoint;

    public Person(String name,int age,int HealthPoint){
        this.age=age;
        this.name=name;
        this.HealthPoint=HealthPoint;
    }


}
