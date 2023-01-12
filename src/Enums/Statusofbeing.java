package Enums;

public enum Statusofbeing {
    GOING{
        public String toString() {
            return "идет ";
        }
    },
    LYING{
        public String toString() {
            return "лежит ";
        }
    },
    SITTING{
        public String toString() {
            return "села ";
        }
    },
    STANDING{
        public String toString() {
            return "стоит ";
        }
    }
}
