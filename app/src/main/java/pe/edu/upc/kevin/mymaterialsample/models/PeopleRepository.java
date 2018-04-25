package pe.edu.upc.kevin.mymaterialsample.models;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by KEVIN on 24/04/2018.
 */

public class PeopleRepository {
    private static PeopleRepository instance;
    private List<Person> people;

    public PeopleRepository(){instance=this;}

    public static PeopleRepository getInstance(){
    if(instance==null) instance=new PeopleRepository();
    return instance;
    }

    public List<Person> getPeople(){
        if(people==null) init();
        return people;
    }

    private PeopleRepository init(){
        people=new ArrayList<>();
        people.add(new Person("John","Doe"));
        people.add(new Person("Kevin","Ore"));
        return this;
    }
}
