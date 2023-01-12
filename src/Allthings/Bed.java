package Allthings;

import Enums.Adverb;
import Enums.Place;
import Enums.Statusofthing;

public class Bed extends Thing{
    public Bed(){
        super("кровать", Place.REDROOM, Statusofthing.DIRTY);
    }
    @Override
    public void adverbing(Thing th){
        if(th.name=="оттоманка"){
            this.adverb= Adverb.STRIGHT;
        }
    };
    @Override
    public void getPlace() {
        this.place.toString();
    }
    @Override
    public void getStatusofthing(){
        this.statusofthing.toString();
    }
}
