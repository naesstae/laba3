package Allthings;

import Allthings.*;
import Enums.*;

public class Dresser extends Thing {
    public Dresser(){
        super("комод",Place.REDROOM, Statusofthing.DIRTY);
    }
    public void adverbing(Thing th){
        if(th.name=="оттоманка"){
            this.adverb= Adverb.RIGHT;
        }
    };
    @Override
    public void getPlace() {
        this.place.toString();
    }
    @Override
    public void getStatusofthing(){
        this.statusofthing.toString();
    }
    public SecretDrawer secretDrawer=new SecretDrawer();
}
