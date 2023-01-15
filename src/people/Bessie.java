package people;

import enums.Gender;
import enums.Place;

public class Bessie extends Person {
    public Bessie() {
        super("Мисс Эббот", Gender.FEMALE, Place.ANYWHEREELSE);
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public Place getPlace() {
        return this.place;
    }
    public void forceToSitWithAbbott(){
        walk(Place.REDROOM);
        walk(Place.PLAYROOM);
    }
}
