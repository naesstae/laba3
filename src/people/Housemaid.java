package people;

import allthings.Door;
import allthings.Dresser;
import allthings.Fireplace;
import allthings.Mirror;
import enums.*;

public class Housemaid extends Person {
    public Housemaid(){
        super(" ", Gender.FEMALE, Place.ANYWHEREELSE);
    }
    @Override
    public String getName(){
        return this.name;
    }
    @Override
    public Place getPlace(){ return this.place; }
    public void lockTheDoor(Door door) {
        door.statusOfDoor= StatusOfDoor.LOCK;
    }
    public void openTheDoor(Door door) {
        door.statusOfDoor=StatusOfDoor.OPEN;
    }
    public void washTheDust(Mirror mirror, Fireplace fireplace, Dresser dresser, Days today)
    {
        if(today==Days.SATURDAY) {
            walk(Place.REDROOM);
            openTheDoor(this.place.door);
            if(dresser.getStatusOfThing()==StatusOfThing.DIRTY) {
                dresser.setStatusOfThing(StatusOfThing.CLEAN);
            }
            if(mirror.getStatusOfThing()==StatusOfThing.DIRTY) {
                mirror.setStatusOfThing(StatusOfThing.CLEAN);
            }
            if(dresser.getStatusOfThing()==StatusOfThing.DIRTY) {
                fireplace.setStatusOfThing(StatusOfThing.CLEAN);
            }
            System.out.print("Горничные убираются " + today.toString());
            lockTheDoor(this.place.door);
            walk(Place.ANYWHEREELSE);
        }
    }
    public void turningOnTheFire(Fireplace fireplace){
        fireplace.statusOfFireplace= StatusOfFireplace.ON;
        fireplace.getPlace().silence=Silence.OFF;
        fireplace.getPlace().temperature=Temperature.HIGH;

    }
    public void turningOffTheFire(Fireplace fireplace){
        fireplace.statusOfFireplace= StatusOfFireplace.OFF;
        fireplace.getPlace().silence=Silence.ON;
        fireplace.getPlace().temperature=Temperature.LOW;
    }
}
