package enums;

public enum Silence {
    ON{
        public String toString(){
            return "В комнате тихо. ";
        }
    },
    OFF{
        public String toString(){
            return "В комнате не тихо. ";
        }
    },
}
