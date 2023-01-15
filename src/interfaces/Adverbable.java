package interfaces;

import allthings.Thing;
import enums.Place;

public interface Adverbable {
    default void adverbing(Thing th){};
    default void adverbing(Thing th1, Thing th2){};
    default void adverbing(Place p1, Place p2, Place p3){};
}
