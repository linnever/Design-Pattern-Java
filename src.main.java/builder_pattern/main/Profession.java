package com.lin.java.builder_pattern.main;

/**
 * Created by never on 1/28/2016.
 */
public enum Profession {
    WARRIOR, THIEF, MAGE, PRIEST;

    @Override
    public String toString() {
        return name().toLowerCase();
    }
}
