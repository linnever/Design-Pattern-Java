package com.lin.java.builder_pattern.main;

/**
 * Created by never on 1/28/2016.
 */
public enum Weapon {
    DAGGER, SWORD, AXE, WARHAMMER, BOW;

    @Override
    public String toString() {
        return name().toLowerCase();
    }
}
