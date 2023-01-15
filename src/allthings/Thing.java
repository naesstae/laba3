package allthings;

import enums.*;
import interfaces.Adverbable;
import interfaces.Visible;

public abstract class Thing implements Visible, Adverbable {
    protected StatusOfThing statusOfThing;
    public Adverb adverb;
    protected Place place;
    protected String name;
    public StatusOfVision statusOfVision=StatusOfVision.INVISIBLE;
    public Thing(){}
    public Thing(String name, Place place){
        this.name=name;
        this.place=place;
    }
    public Thing(String name, Place place, StatusOfThing statusOfThing){
        this.name=name;
        this.place=place;
        this.statusOfThing=statusOfThing;
    }
    abstract StatusOfThing getStatusOfThing();
    abstract void setStatusOfThing(StatusOfThing statusOfThing);
    public Place getPlace() {
        return this.place;
    }
    public String getName(){
        return this.name;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Thing that = (Thing) o;

        if (statusOfThing != that.statusOfThing) return false;
        if (place != that.place) return false;
        return name.equals(that.name);
    }
}
