package allthings;

import enums.Place;
import enums.StatusOfThing;

public class Coffin extends Thing{
    public Coffin(){
        super("кровать", Place.REDROOM, StatusOfThing.DIRTY);
    }
    @Override
    public StatusOfThing getStatusOfThing(){
        return this.statusOfThing;
    }
    @Override
    public void setStatusOfThing(StatusOfThing statusOfThing){this.statusOfThing=statusOfThing;}
}
