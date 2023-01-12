package Interfaces;

import Allthings.Thing;

public interface Adverbable {
    default void adverbing(Thing th){};
    default void adverbing(Thing th1, Thing th2){};
}
