package enums;

public enum StatusOfDrawer {
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
