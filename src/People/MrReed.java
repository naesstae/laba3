package People;

import Allthings.Thing;
import Enums.*;

public class MrReed extends Person{
    public MrReed(){
        super("Мистер Рид", Gender.MALE, Place.ANYWHEREELSE);
    }
    @Override
    public String getName(){
        return this.name;
    }
    @Override
    public Place getPlace(){ return this.place;}
    public void lying(Thing th){
        this.statusofbeing= Statusofbeing.LYING;
    }
    public void dying(Time time){
        if(time==Time.NINEYEARS) {
            this.place = Place.REDROOM;
            lying(this.place.bed);
            this.statusoflife = Statusoflife.DEAD;
            lying(this.place.coffin);
            System.out.print(time.toString()+getName()+" лежал на кровати в Красной комнате, умер, а затем лежал в гробу в этой же комнате. ");
            Undertaker undertaker=new Undertaker();
            undertaker.bury(this);
        }
    }
}
