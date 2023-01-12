package Allthings;

import Enums.Place;
import Enums.Statusofthing;

public class Coffin extends Thing{
    public Coffin(){
        super("кровать", Place.REDROOM, Statusofthing.DIRTY);
    }
    @Override
    public void getPlace() {
        this.place.toString();
    }
    @Override
    public void getStatusofthing(){
        this.statusofthing.toString();
    }
}
