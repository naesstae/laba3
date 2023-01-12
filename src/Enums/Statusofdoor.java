package Enums;

public enum Statusofdoor {
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
