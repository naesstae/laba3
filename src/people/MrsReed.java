package people;

import allthings.Documents;
import allthings.Door;
import allthings.JewelryBox;
import allthings.Miniature;
import enums.*;

public class MrsReed extends Person {
    public MrsReed(){
        super("Миссис Рид", Gender.FEMALE, Place.ANYWHEREELSE);
    }
    @Override
    public String getName(){
        return this.name;
    }
    @Override
    public Place getPlace(){ return this.place;}
    public void lockTheDoor(Door door) {
        door.statusOfDoor= StatusOfDoor.CLOSE;
    }
    public void openTheDoor(Door door) {
        door.statusOfDoor=StatusOfDoor.OPEN;
    }
    public void see(Documents documents, JewelryBox jewelryBox, Miniature miniature){
        documents.vision(documents.statusOfVision);
        jewelryBox.vision(jewelryBox.statusOfVision);
        miniature.vision(miniature.statusOfVision);
        documents.invision(documents.statusOfVision);
        jewelryBox.invision(jewelryBox.statusOfVision);
        miniature.invision(miniature.statusOfVision);
    }
    public void checkTheDrawer(){
        if(Math.random()<0.1){
            walk(Place.REDROOM);
            openTheDoor(this.place.door);
            this.place.dresser.secretDrawer.statusOfDrawer= StatusOfDrawer.OPEN;
            this.see(this.place.dresser.secretDrawer.documents, this.place.dresser.secretDrawer.jewelryBox, this.place.dresser.secretDrawer.miniature);
            this.place.dresser.secretDrawer.statusOfDrawer= StatusOfDrawer.CLOSE;
            lockTheDoor(this.place.door);
            walk(Place.ANYWHEREELSE);
        }
        System.out.println("редко ящик комода открыт из-за Миссис Рид. Миссис Рид видит документы, шкатулку с драгоценностями и миниатюру с митсером Ридом. ");
    }
}
