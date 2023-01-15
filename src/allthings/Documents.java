package allthings;

import enums.Place;
import enums.StatusOfThing;

public class Documents extends Thing{
    public Documents(){
        super("документы",Place.REDROOM);
    }
    @Override
    public StatusOfThing getStatusOfThing(){
        return StatusOfThing.CLEAN;
    }
    @Override
    public void setStatusOfThing(StatusOfThing statusOfThing){ }
}
