package allthings;

import enums.Place;
import enums.StatusOfDoor;
import enums.StatusOfThing;

public class Door extends Thing{
    public Door(){
        super("дверь", Place.REDROOM);
    }
    public int health=100;
    @Override
    public StatusOfThing getStatusOfThing(){
        return StatusOfThing.CLEAN;
    }
    @Override
    public void setStatusOfThing(StatusOfThing statusOfThing){ }
    public StatusOfDoor statusOfDoor = StatusOfDoor.OPEN;
}
