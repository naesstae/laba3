package People;

import Allthings.Door;
import Allthings.Dresser;
import Allthings.Fireplace;
import Allthings.Mirror;
import Enums.*;

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
    public void lockthedoor(Door door) {
        door.statusofdoor= Statusofdoor.CLOSE;
    }
    public void openthedoor(Door door) {
        door.statusofdoor=Statusofdoor.OPEN;
    }
    @Override
    public void walk(Place place){
        this.statusofbeing=Statusofbeing.GOING;
        this.place=place;
        this.statusofbeing=Statusofbeing.STANDING;
    }
    public void washthedust(Mirror mirror, Fireplace fireplace, Dresser dresser, Days today)
    {
        if(today==Days.SATURDAY) {
            walk(Place.REDROOM);
            openthedoor(this.place.door);
            dresser.statusofthing = Statusofthing.CLEAN;
            mirror.statusofthing = Statusofthing.CLEAN;
            fireplace.statusofthing = Statusofthing.CLEAN;
            System.out.print("Горничные убираются " + today.toString());
            lockthedoor(this.place.door);
            walk(Place.ANYWHEREELSE);
        }
    }
    public void turningonthefire(Fireplace fireplace){
        fireplace.statusoffireplace=Statusoffireplace.ON;

    }
    public void turningoffthefire(Fireplace fireplace){
        fireplace.statusoffireplace=Statusoffireplace.OFF;
        fireplace.place.silence=Silence.OFF;
        fireplace.place.temperature=Temperature.HIGH;
    }
}
