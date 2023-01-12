package Allthings;

import Enums.*;

public class Mirror extends Thing {
    public Mirror(){
        super("зеркало", Place.REDROOM, Statusofthing.DIRTY);
    }
    @Override
    public void adverbing(Thing th1, Thing th2){
        if((th1.name=="окно" && th2.name=="комод")||(th2.name=="окно" && th1.name=="комод")){
            this.adverb= Adverb.BETWEEN;
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
