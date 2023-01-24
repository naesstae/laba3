package allthings;

import enums.*;

public class Fireplace extends Thing{
    public Fireplace(){
        super("камин",Place.REDROOM, StatusOfThing.DIRTY, Adverb.NEAR);
    }
    public StatusOfFireplace statusOfFireplace = StatusOfFireplace.OFF;

    @Override
    public StatusOfThing getStatusOfThing(){
        return this.statusOfThing;
    }
    @Override
    public void setStatusOfThing(StatusOfThing statusOfThing){this.statusOfThing=statusOfThing;}
}
