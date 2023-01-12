package People;

import Allthings.Door;
import Enums.Gender;
import Enums.Place;
import Enums.Statusofbeing;
import Enums.Statusofdoor;

public class MissAbbott extends Person {
    public MissAbbott() {
        super("Мисс Эббот", Gender.FEMALE, Place.ANYWHEREELSE);
    }

    @Override
    public String getName() {
        return this.name;
    }
    public void lockthedoor(Door door) {
        door.statusofdoor= Statusofdoor.CLOSE;
    }
    public void openthedoor(Door door) {
        door.statusofdoor=Statusofdoor.OPEN;
    }
    @Override
    public void walk(Place place){
        this.statusofbeing= Statusofbeing.GOING;
        this.place=place;
        this.statusofbeing=Statusofbeing.STANDING;
    }
    @Override
    public Place getPlace() {
        return this.place;
    }
    public void forcetositwithBessie(JaneEyre p, Bessie bessie){
        bessie.forcetositwithAbbott();
        walk(Place.REDROOM);
        p.walk(Place.REDROOM);
        openthedoor(this.place.door);
        p.sitting(this.place.ottoman);
        lockthedoor(this.place.door);
        walk(Place.KITCHEN);
        System.out.print(", так как меня заставили Бесси и Мисс Эббот. ");
    }
}
