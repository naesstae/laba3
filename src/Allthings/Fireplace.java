package Allthings;

import Enums.*;

public class Fireplace extends Thing{
    public Fireplace(){
        super("камин",Place.REDROOM, Statusofthing.DIRTY);
    }
    public Statusoffireplace statusoffireplace = Statusoffireplace.OFF;
    @Override
    public void adverbing(Thing th){
        if(th.name=="оттоманка"){
            this.adverb=Adverb.NEAR;
        }
    };
    @Override
    public void getPlace(){
        this.place.toString();
    }
    @Override
    public void getStatusofthing(){
        this.statusofthing.toString();
    }
}
