package com.sasha.SE_02.Task5;

/**
 * Created by Александра on 13.10.2016.
 */
public enum Subject {
    ALGEBRA,
    ASTRONOMY,
    BIOLOGY,
    ART,
    HISTORY,
    GEOMETRY;

    public boolean isInteger() {
        switch (this) {
            case ALGEBRA:
            case ASTRONOMY:
            case GEOMETRY:
                return true;
            default:
                return false;
        }
    }

}
