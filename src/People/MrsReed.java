package People;

import Allthings.Documents;
import Allthings.Door;
import Allthings.JewelryBox;
import Allthings.Miniature;
import Enums.*;

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
    @Override
    public void walk(Place place){
        this.statusofbeing= Statusofbeing.GOING;
        this.place=place;
        this.statusofbeing=Statusofbeing.STANDING;
    }
    public void lockthedoor(Door door) {
        door.statusofdoor= Statusofdoor.CLOSE;
    }
    public void openthedoor(Door door) {
        door.statusofdoor=Statusofdoor.OPEN;
    }
    public void see(Documents documents, JewelryBox jewelryBox, Miniature miniature){
        documents.vision(documents.sov);
        jewelryBox.vision(jewelryBox.sov);
        miniature.vision(miniature.sov);
        documents.invision(documents.sov);
        jewelryBox.invision(jewelryBox.sov);
        miniature.invision(miniature.sov);
    }
    public void checkthedrawer(){
        if(Math.random()<0.1){
            walk(Place.REDROOM);
            openthedoor(this.place.door);
            this.place.dresser.secretDrawer.statusofdrawer= Statusofdrawer.OPEN;
            this.see(this.place.dresser.secretDrawer.documents, this.place.dresser.secretDrawer.jewelryBox, this.place.dresser.secretDrawer.miniature);
            this.place.dresser.secretDrawer.statusofdrawer=Statusofdrawer.CLOSE;
            lockthedoor(this.place.door);
            walk(Place.ANYWHEREELSE);
        }
        System.out.println("редко ящик комода открыт из-за Миссис Рид. Миссис Рид видит документы, шкатулку с драгоценностями и миниатюру с митсером Ридом. ");
    }
}
