package People;

import Allthings.Door;
import Allthings.Mirror;
import Allthings.Secret;
import Allthings.Thing;
import Enums.*;

public class JaneEyre extends Person {
    public JaneEyre(){
        super("Я ", Gender.FEMALE, Place.REDROOM);
    }
    private Time time=Time.NOW;
    private String thought=new String();
    @Override
    public void walk(Place place){
        this.statusofbeing=Statusofbeing.GOING;
        this.place=place;
        this.statusofbeing=Statusofbeing.STANDING;
    }
    @Override
    public String getName(){
        return this.name;
    }
    @Override
    public Place getPlace(){ return this.place; }
    public void sitting(Thing th){
        statusofbeing=Statusofbeing.SITTING;
        System.out.print(this.name+statusofbeing.toString()+" на "+th.name);
    }
    public  void trythedoor(Door door){
        this.thought=this.name+this.statusofbeing.toString()+" когда набралась смелости. ";
        System.out.print(this.thought);
        System.out.print(door.statusofdoor.toString());
        this.thought="Никакая темница не запиралась столь надежно. ";
        System.out.print(this.thought);
    }
    public void describetheroom(){
        this.thought=this.place.temperature.toString()+this.place.fireplace.statusoffireplace.toString();
        System.out.print(this.thought);
        this.thought=this.place.silence.toString();
        System.out.print(this.thought);
    }
    public void rememberaboutdeath(MrReed mr){
        time=Time.NINEYEARS;
        mr.dying(time);
        time=Time.NOW;
    }
    public void tellthesecret(Secret s, MrReed mr){
        System.out.print(this.place.dresser.secretDrawer.documents.name+" , "+this.place.dresser.secretDrawer.jewelryBox.name+" и "+this.place.dresser.secretDrawer.miniature.name+" и есть "+s.name);
        rememberaboutdeath(mr);
        this.thought=" С тех пор священный страх оберегает Красную комнату от частых вторжений";
        System.out.println(this.thought);
    }
    public void thinkinginredroom(){
        see(this.place.fireplace);
        see(this.place.bed);
        see(this.place.dresser);
        see(this.place.window);
        see(this.place.mirror);
        this.thought="Я не знаю, заперли ли дверь. ";
        System.out.print(this.thought);
        this.statusofbeing=Statusofbeing.STANDING;
        trythedoor(this.place.door);
        seethedeep(this.place.mirror);
        sitting(this.place.ottoman);
    }
    public void see(Thing th){
        th.vision(th.sov);
        th.invision(th.sov);
        if(this.statusofbeing==Statusofbeing.SITTING) {
            if(th.name=="зеркало"){
                th.adverbing(this.place.dresser, this.place.window);
                System.out.print(th.adverb.toString()+this.place.dresser.name+" и "+ this.place.window.name + " находится " + th.name+". ");
            }
            else{
                th.adverbing(this.place.ottoman);
                System.out.print(th.adverb.toString() + "находится " + th.name+". ");
                if(th.name=="комод"){
                    this.thought="Отражения в его стенке как узоры. ";
                    System.out.print(this.thought);
                }
            }
        }
    }
    public void seethedeep(Mirror mirror){
        mirror.vision(mirror.sov);
        System.out.print(" Я измерила взглядом невольно глубину зеркала, проходя мимо.");
        anotherworld();
        mirror.invision(mirror.sov);
    }
    public void anotherworld(){
        this.thought=" Этот другой мир темнее и холоднее.";
        System.out.print(this.thought);
        JEnew jEnew=new JEnew();
        misterythinking(jEnew);
    }
    public void misterythinking(Person p){
        if(p.name=="отражение") {
            this.thought = " И другая я более всего походила на привидение. Мне она напомнила тех маленьких духов из рассказов Бесси. ";
            System.out.print(this.thought);
        }
    }
}

