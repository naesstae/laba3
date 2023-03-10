package allthings;

import enums.Adverb;
import enums.Place;
import enums.StatusOfThing;

public class Bed extends Thing{
    public Bed(){
        super("кровать", Place.REDROOM, StatusOfThing.DIRTY, Adverb.STRIGHT);
    }

    @Override
    public StatusOfThing getStatusOfThing(){
        return this.statusOfThing;
    }
    @Override
    public void setStatusOfThing(StatusOfThing statusOfThing){this.statusOfThing=statusOfThing;}
}
