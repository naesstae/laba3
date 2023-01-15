package allthings;

import enums.*;

public class Dresser extends Thing {
    public Dresser(){
        super("комод",Place.REDROOM, StatusOfThing.DIRTY, Adverb.RIGHT);
    }

    @Override
    public StatusOfThing getStatusOfThing(){
        return this.statusOfThing;
    }
    @Override
    public void setStatusOfThing(StatusOfThing statusOfThing){this.statusOfThing=statusOfThing;}
    public SecretDrawer secretDrawer=new SecretDrawer();
}
