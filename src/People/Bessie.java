package People;

import Enums.Gender;
import Enums.Place;

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
    public void forcetositwithAbbott(){
        walk(Place.REDROOM);
        walk(Place.PLAYROOM);
    }
}
