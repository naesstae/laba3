package people;

import enums.Gender;
import enums.Place;

public class JEnew extends Person{
    public JEnew(){
            super("отражение", Gender.FEMALE, Place.REDROOM);
        }
    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public Place getPlace() {
        return this.place;
    }
}
