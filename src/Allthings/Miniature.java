package Allthings;

import Enums.Place;
import Enums.Statusofthing;
import Interfaces.Visible;

public class Miniature extends Thing {
    public Miniature(){
        super("миниатюра поконого мистера Рида",Place.REDROOM);
    }
    @Override
    public void getPlace(){
        this.place.toString();
    }
    @Override
    public void getStatusofthing(){ Statusofthing.CLEAN.toString();
    }
}
