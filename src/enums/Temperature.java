package enums;

public enum Temperature {
    HIGH{
        public String toString(){
            return "В комнате тепло. ";
        }
    },
    LOW{
        public String toString(){
            return "В комнате холодно. ";
        }
    }
}
