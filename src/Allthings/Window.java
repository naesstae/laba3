package Allthings;

import Enums.Adverb;
import Enums.Place;
import Enums.Statusofthing;

public class Window extends Thing {
    public Window() {
        super("окно", Place.REDROOM);
    }
    public void adverbing(Thing th){
        if(th.name=="оттоманка"){
            this.adverb= Adverb.LEFT;
        }
    };
    @Override
    public void getPlace() {
        this.place.toString();
    }

    @Override
    public void getStatusofthing() {
        Statusofthing.CLEAN.toString();
    }
}