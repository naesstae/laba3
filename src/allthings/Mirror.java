package allthings;

import enums.*;

public class Mirror extends Thing {
    public Mirror(){
        super("зеркало", Place.REDROOM, StatusOfThing.DIRTY);
    }
    @Override
    public void adverbing(Thing th1, Thing th2){
        if((th1.equals(Place.REDROOM.window) && th2.equals(Place.REDROOM.dresser))||(th1.equals(Place.REDROOM.dresser) && th2.equals(Place.REDROOM.window))){
            this.adverb= Adverb.BETWEEN;
        }
    }
    @Override
    public StatusOfThing getStatusOfThing(){
        return this.statusOfThing;
    }
    @Override
    public void setStatusOfThing(StatusOfThing statusOfThing){this.statusOfThing=statusOfThing;}
}
