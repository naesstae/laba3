package allthings;

import enums.Place;
import enums.StatusOfThing;

public class JewelryBox extends Thing{
    public JewelryBox(){
        super("шкатулка с драгоценностями",Place.REDROOM);
    }
    @Override
    public StatusOfThing getStatusOfThing(){
        return StatusOfThing.CLEAN;
    }
    @Override
    public void setStatusOfThing(StatusOfThing statusOfThing){ }
}
