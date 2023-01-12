package Allthings;

import Enums.*;
import Interfaces.Adverbable;
import Interfaces.Visible;

public abstract class Thing implements Visible, Adverbable {
    public Statusofthing statusofthing;
    public Adverb adverb;
    public Place place;
    public String name;
    public Statusofvision sov=Statusofvision.INVISIBLE;
    public Thing(){}
    public Thing(String name, Place place){
        this.name=name;
        this.place=place;
    }
    public Thing(String name, Place place, Statusofthing statusofthing){
        this.name=name;
        this.place=place;
        this.statusofthing=statusofthing;
    }
    abstract void getPlace();
    abstract void getStatusofthing();
}
