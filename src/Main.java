import Enums.Days;
import People.*;

public class Main {
    public static void main(String[] args) {
        MrReed mr=new MrReed();
        JaneEyre JE=new JaneEyre();
        JE.describetheroom();
        Housemaid housemaid=new Housemaid();
        housemaid.washthedust(JE.getPlace().mirror, JE.getPlace().fireplace, JE.getPlace().dresser, Days.SATURDAY);
        MrsReed mrs=new MrsReed();
        mrs.checkthedrawer();
        JE.tellthesecret(JE.getPlace().secret, mr);
        Bessie bessie=new Bessie();
        MissAbbott missAbbott=new MissAbbott();
        missAbbott.forcetositwithBessie(JE,bessie);
        JE.thinkinginredroom();
    }
}