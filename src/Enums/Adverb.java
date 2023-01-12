package Enums;

public enum Adverb {
    RARELY{
        public String toString(){
            return "редко ";
        }
    },
    OFTEN{
        public String toString(){
            return "часто. ";
        }
    },
    NEAR{
        public String toString(){
            return "рядом ";
        }
    },
    FAR{
        public String toString(){
            return "далеко ";
        }
    },
    LEFT{
        public String toString(){
            return "слева ";
        }
    },
    BETWEEN{
        public String toString(){
            return "между ";
        }
    },
    RIGHT{
        public String toString(){
            return "справа ";
        }
    },
    STRIGHT{
        public String toString(){
            return "прямо ";
        }
    };
}
