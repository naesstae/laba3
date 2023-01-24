package interfaces;

import enums.StatusOfVision;

public interface Visible{
    default void vision(StatusOfVision statusOfVision){
        statusOfVision= StatusOfVision.VISIBLE;
    }
    default void invision(StatusOfVision statusOfVision){
        statusOfVision= StatusOfVision.INVISIBLE;
    }
}
