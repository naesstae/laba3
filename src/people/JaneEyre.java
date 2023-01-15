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
    public Place.West west=place.new West();
    public Place.East east=place.new East();
    public Place.North north=place.new North();
    public Place.South south=place.new South();
    @Override
    public String getName(){
        return this.name;
    }
    @Override
    public Place getPlace(){ return this.place; }

    public void setThought(String thought) {
        this.thought = thought;
    }
    public String getThought(){
        return this.thought;
    }

    public void sitting(Thing th){
        statusOfBeing=StatusOfBeing.SITTING;
        System.out.print(this.name+statusOfBeing.toString()+" на "+th.getName());
    }
    public  void tryTheDoor(Door door){
        this.thought=this.name+this.statusOfBeing.toString()+" когда набралась смелости. ";
        System.out.print(this.thought);
        int i=0;
        while (i<2){
            i++;
            door.statusOfDoor=(door.statusOfDoor==StatusOfDoor.CLOSE)? StatusOfDoor.OPEN : StatusOfDoor.LOCK;
            door.health--;
        }
        System.out.print(door.statusOfDoor.toString());
        if(door.statusOfDoor==StatusOfDoor.LOCK) {
            this.thought = "Никакая темница не запиралась столь надежно. ";
            System.out.print(this.thought);
        }
    }
    public void describeTheRoom(){
        this.thought=this.place.temperature.toString()+this.west.fireplace.statusOfFireplace.toString();
        System.out.print(this.thought);
        this.thought=this.place.silence.toString();
        System.out.print(this.thought);
    }
    public void rememberAboutDeath(MrReed mr){
        Time time = Time.NINEYEARS;
        try {
            mr.dying(time);
        } catch (MrReedIsAlreadyDeadException e) {
            System.out.println(e.getMessage());
            System.out.println(" Проверяем статус Мистера Рида. "+ mr.statusOfLife);
        }
        time =Time.NOW;
    }
    public void tellTheSecret(MrReed mr) {
        Place.Secret secret=this.place.new Secret();
        System.out.print(this.south.dresser.secretDrawer.documents.getName()+" , "+this.south.dresser.secretDrawer.jewelryBox.getName()+" и "+this.south.dresser.secretDrawer.miniature.getName()+" и есть "+secret.name);
        rememberAboutDeath(mr);
        this.thought=" С тех пор священный страх оберегает Красную комнату от частых вторжений";
        System.out.println(this.thought);
    }
    public void thinkingInRedRoom(){
        see(this.west.fireplace);
        see(this.east.bed);
        see(this.south.dresser);
        see(this.north.window);
        see(this.place.mirror);
        this.thought="Я не знаю, заперли ли дверь. ";
        System.out.print(this.thought);
        this.statusOfBeing=StatusOfBeing.STANDING;
        tryTheDoor(this.place.door);
        seeTheDeep(this.place.mirror);
        sitting(this.west.ottoman);
    }
    public void see(Thing th){
        th.vision(th.statusOfVision);
        th.invision(th.statusOfVision);
        if(this.statusOfBeing==StatusOfBeing.SITTING) {
            if(th.getName().equals("зеркало")){
                System.out.print(th.adverb.toString()+this.south.dresser.getName()+" и "+ this.north.window.getName() + " находится " + th.getName()+". ");
            }
            else{
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
        mirror.anotherWorld(this);
        mirror.invision(mirror.statusOfVision);
    }
    public void mysteryThinking(Person p){
        if(p.getName().equals("отражение")) {
            this.setThought(" И другая я более всего походила на привидение. Мне она напомнила тех маленьких духов из рассказов Бесси. ");
            System.out.print(this.getThought());
        }
    }
}

