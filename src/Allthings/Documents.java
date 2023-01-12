package Allthings;

import Enums.Place;
import Enums.Statusofthing;
import Enums.Statusofvision;
import Interfaces.Visible;

public class Documents extends Thing{
    public Documents(){
        super("документы",Place.REDROOM);
    }
    @Override
    public void getPlace(){
        this.place.toString();
    }
    @Override
    public void getStatusofthing(){ Statusofthing.CLEAN.toString();}
}
