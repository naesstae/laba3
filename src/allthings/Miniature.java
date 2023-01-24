package allthings;

import enums.Place;
import enums.StatusOfThing;

public class Miniature extends Thing {
    public Miniature(){
        super("миниатюра поконого мистера Рида",Place.REDROOM);
    }
    @Override
    public StatusOfThing getStatusOfThing(){
        return StatusOfThing.CLEAN;
    }
    @Override
    public void setStatusOfThing(StatusOfThing statusOfThing){ }
}
