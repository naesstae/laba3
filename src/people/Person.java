package people;

import enums.*;
import interfaces.Visible;

public abstract class Person implements Visible {
    protected String name;
    protected StatusOfBeing statusOfBeing=StatusOfBeing.STANDING;
    protected StatusOfLife statusOfLife = StatusOfLife.ALIVE;
    protected Gender gender;
    protected Place place;

    protected StatusOfVision statusOfVision= StatusOfVision.INVISIBLE;
    public Person(String name, Gender gender, Place place){
        this.name=name;
        this.gender=gender;
        this.place=place;
    }
    public void walk(Place place){
        this.statusOfBeing= StatusOfBeing.GOING;
        this.place=place;
        this.statusOfBeing=StatusOfBeing.STANDING;
    }
    public abstract String getName();
    public abstract Place getPlace();
}
