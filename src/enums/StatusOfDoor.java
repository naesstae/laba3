package enums;

public enum StatusOfDoor {
    OPEN{
        public String toString() {
            return "Дверь не заперта.";
        }
    },
    CLOSE{
        public String toString() {
            return "Дверь заперта";
        }
    }
}
