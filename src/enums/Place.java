package enums;

import allthings.*;

public enum Place {
    CEMETRY,
    REDROOM,
    KITCHEN,
    PLAYROOM,
    ANYWHEREELSE;
    public Silence silence;
    public Temperature temperature;
    public Coffin coffin=new Coffin();
    public Mirror mirror=new Mirror();
    public Door door=new Door();

    public class Secret {
        public String name = "тайна и проклятье Красной комнаты. ";
    }
    Place(){
        this.silence=Silence.ON;
        this.temperature=Temperature.LOW;
    }
    public class West{
        public Ottoman ottoman=new Ottoman();
        public Fireplace fireplace=new Fireplace();
    }
    public class East{
        public Bed bed=new Bed();
    }
    public class North{
        public  Window window=new Window();
    }
    public class South{
        public Dresser dresser=new Dresser();
    }
}
