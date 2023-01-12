package People;

import Enums.Gender;
import Enums.Place;

public class Undertaker extends Person {
    public Undertaker() {
        super(" ", Gender.MALE, Place.ANYWHEREELSE);
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public Place getPlace() {
        return this.place;
    }
    public void bury(Person p){
        p.place=Place.CEMETRY;
        System.out.print("Подручные гробовщика унесли гроб с телом "+p.getName()+" на кладбище.");
    }
}
