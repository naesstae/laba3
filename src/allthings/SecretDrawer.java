package allthings;

import enums.Place;
import enums.StatusOfDrawer;
import enums.StatusOfThing;

public class SecretDrawer extends Thing{
    public SecretDrawer(){
        super("секретный ящик",Place.REDROOM, StatusOfThing.DIRTY);
    }
    public StatusOfDrawer statusOfDrawer = StatusOfDrawer.CLOSE;
    public JewelryBox jewelryBox=new JewelryBox();
    public Miniature miniature=new Miniature();
    public Documents documents=new Documents();
    @Override
    public StatusOfThing getStatusOfThing(){
        return StatusOfThing.CLEAN;
    }
    @Override
    public void setStatusOfThing(StatusOfThing statusOfThing){this.statusOfThing=statusOfThing;}
}
