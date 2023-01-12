package Allthings;

import Enums.Place;
import Enums.Statusofdoor;
import Enums.Statusofdrawer;
import Enums.Statusofthing;

public class SecretDrawer extends Thing{
    public SecretDrawer(){
        super("секретный ящик",Place.REDROOM, Statusofthing.DIRTY);
    }
    public Statusofdrawer statusofdrawer = Statusofdrawer.CLOSE;
    public JewelryBox jewelryBox=new JewelryBox();
    public Miniature miniature=new Miniature();
    public Documents documents=new Documents();
    @Override
    public void getPlace(){
        this.place.toString();
    }
    @Override
    public void getStatusofthing(){
        this.statusofthing.toString();
    }
}
