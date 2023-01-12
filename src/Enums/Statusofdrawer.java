package Enums;

public enum Statusofdrawer {
    OPEN{
        public String toString() {
            return "ящик комода открыт ";
        }
    },
    CLOSE{
        public String toString() {
            return "ящик комода закрыт";
        }
    }
}
