package allthings;

import enums.Place;
import enums.StatusOfThing;

public class Ottoman extends Thing{
    public Ottoman(){
        super("оттоманка", Place.REDROOM, StatusOfThing.DIRTY);
    }
    @Override
    public StatusOfThing getStatusOfThing(){
        return this.statusOfThing;
    }
    @Override
    public void setStatusOfThing(StatusOfThing statusOfThing){this.statusOfThing=statusOfThing;}
}
