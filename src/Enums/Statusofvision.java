package Enums;

public enum Statusofvision {
    VISIBLE{
        public String toString() {
            return "виден ";
        }
    },
    INVISIBLE{
        public String toString() {
            return "не виден";
        }
    }
}
