import enums.Days;
import people.*;

public class Main {
    public static void main(String[] args) {
        MrReed mr = new MrReed();
        JaneEyre JE = new JaneEyre();
        JE.describeTheRoom();
        Housemaid housemaid = new Housemaid();
        housemaid.washTheDust(JE.getPlace().mirror, JE.west.fireplace, JE.south.dresser, Days.SATURDAY);
        MrsReed mrs = new MrsReed();
        mrs.checkTheDrawer();
        JE.tellTheSecret(mr);
        Bessie bessie = new Bessie();
        MissAbbott missAbbott = new MissAbbott();
        missAbbott.forceToSitWithBessie(JE, bessie);
        JE.thinkingInRedRoom();
    }
}