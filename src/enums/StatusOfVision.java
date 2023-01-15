package enums;

public enum StatusOfVision {
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
