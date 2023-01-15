package allthings;
import enums.Adverb;
import enums.Place;
import enums.StatusOfThing;

public class Window extends Thing {
    public Window() {
        super("окно", Place.REDROOM, StatusOfThing.DIRTY, Adverb.LEFT);
    }
    @Override
    public StatusOfThing getStatusOfThing(){
        return this.statusOfThing;
    }
    @Override
    public void setStatusOfThing(StatusOfThing statusOfThing){this.statusOfThing=statusOfThing;}
}