package allthings;

import enums.*;

public class Fireplace extends Thing{
    public Fireplace(){
        super("камин",Place.REDROOM, StatusOfThing.DIRTY);
    }
    public StatusOfFireplace statusOfFireplace = StatusOfFireplace.OFF;
    @Override
    public void adverbing(Thing th){
        if(th.equals(Place.REDROOM.ottoman)){
            this.adverb=Adverb.NEAR;
        }
    }
    @Override
    public StatusOfThing getStatusOfThing(){
        return this.statusOfThing;
    }
    @Override
    public void setStatusOfThing(StatusOfThing statusOfThing){this.statusOfThing=statusOfThing;}
}
