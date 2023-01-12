package Allthings;

import Enums.Place;
import Enums.Statusofdoor;
import Enums.Statusofthing;

public class Door extends Thing{
    public Door(){
        super("дверь", Place.REDROOM);
    }
    @Override
    public void getPlace() {this.place.toString();}
    @Override
    public void getStatusofthing(){ Statusofthing.CLEAN.toString();}
    public Statusofdoor statusofdoor = Statusofdoor.OPEN;
}
