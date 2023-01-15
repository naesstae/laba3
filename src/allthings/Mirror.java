package allthings;

import enums.*;
import people.JEnew;
import people.JaneEyre;
import people.Person;

public class Mirror extends Thing {
    public Mirror(){
        super("зеркало", Place.REDROOM, StatusOfThing.DIRTY);
    }
    @Override
    public void adverbing(Thing th1, Thing th2){
        if((th1.equals(Place.REDROOM.window) && th2.equals(Place.REDROOM.dresser))||(th1.equals(Place.REDROOM.dresser) && th2.equals(Place.REDROOM.window))){
            this.adverb= Adverb.BETWEEN;
        }
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
        JEnew jEnew=new JEnew();
        mysteryThinking(jEnew, janeEyre);
    }
    public void mysteryThinking(Person p, JaneEyre janeEyre){
        if(p.getName().equals("отражение")) {
            janeEyre.setThought(" И другая я более всего походила на привидение. Мне она напомнила тех маленьких духов из рассказов Бесси. ");
            System.out.print(janeEyre.getThought());
        }
    }
}
