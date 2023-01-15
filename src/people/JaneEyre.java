package people;

import allthings.Door;
import allthings.Mirror;
import allthings.Thing;
import enums.*;

public class JaneEyre extends Person {
    public JaneEyre(){
        super("Я ", Gender.FEMALE, Place.REDROOM);
    }

    private String thought;
    @Override
    public String getName(){
        return this.name;
    }
    @Override
    public Place getPlace(){ return this.place; }
    public void sitting(Thing th){
        statusOfBeing=StatusOfBeing.SITTING;
        System.out.print(this.name+statusOfBeing.toString()+" на "+th.getName());
    }
    public  void tryTheDoor(Door door){
        this.thought=this.name+this.statusOfBeing.toString()+" когда набралась смелости. ";
        System.out.print(this.thought);
        System.out.print(door.statusOfDoor.toString());
        this.thought="Никакая темница не запиралась столь надежно. ";
        System.out.print(this.thought);
    }
    public void describeTheRoom(){
        this.thought=this.place.temperature.toString()+this.place.fireplace.statusOfFireplace.toString();
        System.out.print(this.thought);
        this.thought=this.place.silence.toString();
        System.out.print(this.thought);
    }
    public void rememberAboutDeath(MrReed mr){
        Time time = Time.NINEYEARS;
        mr.dying(time);
        time =Time.NOW;
    }
    public void tellTheSecret(MrReed mr){
        Place.Secret secret=this.place.new Secret();
        System.out.print(this.place.dresser.secretDrawer.documents.getName()+" , "+this.place.dresser.secretDrawer.jewelryBox.getName()+" и "+this.place.dresser.secretDrawer.miniature.getName()+" и есть "+secret.name);
        rememberAboutDeath(mr);
        this.thought=" С тех пор священный страх оберегает Красную комнату от частых вторжений";
        System.out.println(this.thought);
    }
    public void thinkingInRedRoom(){
        see(this.place.fireplace);
        see(this.place.bed);
        see(this.place.dresser);
        see(this.place.window);
        see(this.place.mirror);
        this.thought="Я не знаю, заперли ли дверь. ";
        System.out.print(this.thought);
        this.statusOfBeing=StatusOfBeing.STANDING;
        tryTheDoor(this.place.door);
        seeTheDeep(this.place.mirror);
        sitting(this.place.ottoman);
    }
    public void see(Thing th){
        th.vision(th.statusOfVision);
        th.invision(th.statusOfVision);
        if(this.statusOfBeing==StatusOfBeing.SITTING) {
            if(th.getName().equals("зеркало")){
                th.adverbing(this.place.dresser, this.place.window);
                System.out.print(th.adverb.toString()+this.place.dresser.getName()+" и "+ this.place.window.getName() + " находится " + th.getName()+". ");
            }
            else{
                th.adverbing(this.place.ottoman);
                System.out.print(th.adverb.toString() + "находится " + th.getName()+". ");
                if(th.getName().equals("комод")){
                    this.thought="Отражения в его стенке как узоры. ";
                    System.out.print(this.thought);
                }
            }
        }
    }
    public void seeTheDeep(Mirror mirror){
        mirror.vision(mirror.statusOfVision);
        System.out.print(" Я измерила взглядом невольно глубину зеркала, проходя мимо.");
        anotherWorld();
        mirror.invision(mirror.statusOfVision);
    }
    public void anotherWorld(){
        this.thought=" Этот другой мир темнее и холоднее.";
        System.out.print(this.thought);
        JEnew jEnew=new JEnew();
        misteryThinking(jEnew);
    }
    public void misteryThinking(Person p){
        if(p.name.equals("отражение")) {
            this.thought = " И другая я более всего походила на привидение. Мне она напомнила тех маленьких духов из рассказов Бесси. ";
            System.out.print(this.thought);
        }
    }
}

