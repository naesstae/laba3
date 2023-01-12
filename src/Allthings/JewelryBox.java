package Allthings;

import Enums.Place;
import Enums.Statusofthing;
import Interfaces.Visible;

public class JewelryBox extends Thing{
    public JewelryBox(){
        super("шкатулка с драгоценностями",Place.REDROOM);
    }
    @Override
    public void getPlace(){
        this.place.toString();
    }
    @Override
    public void getStatusofthing(){ Statusofthing.CLEAN.toString();
    }
}
