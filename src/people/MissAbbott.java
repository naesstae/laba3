package people;

import allthings.Door;
import enums.Gender;
import enums.Place;
import enums.StatusOfDoor;

public class MissAbbott extends Person {
    public MissAbbott() {
        super("Мисс Эббот", Gender.FEMALE, Place.ANYWHEREELSE);
    }

    @Override
    public String getName() {
        return this.name;
    }
    public void lockTheDoor(Door door) {
        door.statusOfDoor= StatusOfDoor.CLOSE;
    }
    public void openTheDoor(Door door) {
        door.statusOfDoor=StatusOfDoor.OPEN;
    }
    @Override
    public Place getPlace() {
        return this.place;
    }
    public void forceToSitWithBessie(JaneEyre p, Bessie bessie){
        bessie.forceToSitWithAbbott();
        walk(Place.REDROOM);
        p.walk(Place.REDROOM);
        openTheDoor(this.place.door);
        p.sitting(this.place.ottoman);
        lockTheDoor(this.place.door);
        walk(Place.KITCHEN);
        System.out.print(", так как меня заставили Бесси и Мисс Эббот. ");
    }
}
