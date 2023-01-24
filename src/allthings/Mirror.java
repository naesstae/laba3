package allthings;

import enums.*;
import interfaces.Visible;
import people.JaneEyre;
import people.Person;

public class Mirror extends Thing {
    public Mirror(){
        super("зеркало", Place.REDROOM, StatusOfThing.DIRTY, Adverb.BETWEEN);
    }
    @Override
    public StatusOfThing getStatusOfThing(){
        return this.statusOfThing;
    }
    @Override
    public void setStatusOfThing(StatusOfThing statusOfThing){this.statusOfThing=statusOfThing;}
    public void anotherWorld(JaneEyre janeEyre){
        janeEyre.setThought(" Этот другой мир темнее и холоднее.");
        System.out.print(janeEyre.getThought());
        class JEnew extends Person{
            public JEnew(){
                super("отражение", Gender.FEMALE, Place.REDROOM);
            }
            @Override
            public String getName() {
                return this.name;
            }

            @Override
            public Place getPlace() {
                return this.place;
            }
        }
        JEnew jEnew=new JEnew();
        Visible visible = new Visible() {};
        visible.vision(jEnew.getStatusOfVision());
        janeEyre.mysteryThinking(jEnew);
    }
}
