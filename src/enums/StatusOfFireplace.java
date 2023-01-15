package enums;

public enum StatusOfFireplace {
    ON(Adverb.RARELY){
        public String toString(){
            return "Камин был затоплен. ";
        }
    },
    OFF(Adverb.OFTEN){
        public String toString(){
            return "Камин не затоплен "+this.adverb.toString();
        }
    };
    public Adverb adverb;
    StatusOfFireplace(Adverb adverb){
        this.adverb=adverb;
    }
}
