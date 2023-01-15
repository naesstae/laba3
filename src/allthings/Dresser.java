package allthings;

import enums.*;

public class Dresser extends Thing {
    public Dresser(){
        super("комод",Place.REDROOM, StatusOfThing.DIRTY);
    }
    public void adverbing(Thing th){
        if(th.equals(Place.REDROOM.ottoman)){
            this.adverb= Adverb.RIGHT;
        }
    }
    @Override
    public StatusOfThing getStatusOfThing(){
        return this.statusOfThing;
    }
    @Override
    public void setStatusOfThing(StatusOfThing statusOfThing){this.statusOfThing=statusOfThing;}
    public SecretDrawer secretDrawer=new SecretDrawer();
}
