package Enums;

import Allthings.*;

public enum Place {
    CEMETRY,
    REDROOM,
    KITCHEN,
    PLAYROOM,
    ANYWHEREELSE;
    public Silence silence;
    public Temperature temperature;
    public Secret secret=new Secret();
    public Ottoman ottoman=new Ottoman();
    public  Window window=new Window();
    public Bed bed=new Bed();
    public Coffin coffin=new Coffin();
    public Fireplace fireplace=new Fireplace();
    public Mirror mirror=new Mirror();
    public Door door=new Door();
    public Dresser dresser=new Dresser();
    Place(){
        this.silence=Silence.ON;
        this.temperature=Temperature.LOW;
    }
}
