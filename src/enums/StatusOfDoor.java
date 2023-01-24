package enums;

public enum StatusOfDoor {
    OPEN{
        public String toString() {
            return "Дверь открыта.";
        }
    },
    CLOSE{
        public String toString() {
            return "Дверь закрыта";
        }
    },
    LOCK{
        public String toString() {return "Дверь заперта";}
    }
}
