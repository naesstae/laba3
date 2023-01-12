package Allthings;

import Enums.Place;
import Enums.Statusofthing;

public class Ottoman extends Thing{
    public Ottoman(){
        super("оттоманка", Place.REDROOM, Statusofthing.DIRTY);
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
