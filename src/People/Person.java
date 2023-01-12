package People;

import Enums.*;
import Interfaces.Visible;

public abstract class Person implements Visible {
    protected String name;
    protected Statusofbeing statusofbeing=Statusofbeing.STANDING;
    protected Statusoflife statusoflife = Statusoflife.ALIVE;
    protected Gender gender;
    protected Place place;
    protected Statusofvision sov=Statusofvision.INVISIBLE;
    public Person(){}
    public Person(String name, Gender gender, Place place){
        this.name=name;
        this.gender=gender;
        this.place=place;
    }
    public void walk(Place place){};
    public abstract String getName();
    public abstract Place getPlace();
}
