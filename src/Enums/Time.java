package Enums;

public enum Time {
    MORENINEYEARS{
        public String toString() {
            return "больше девяти лет назад ";
        }
    },
    NINEYEARS{
        public String toString() {
            return "девять лет назад ";
        }
    },
    NOW{
        public String toString() {
            return "сейчас ";
        }
    };
}
