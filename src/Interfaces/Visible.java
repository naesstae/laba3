package Interfaces;

import Enums.Statusofvision;

public interface Visible{
    default void vision(Statusofvision sov){
        sov=Statusofvision.VISIBLE;
    }
    default void invision(Statusofvision sov){
        sov=Statusofvision.INVISIBLE;
    }
}
