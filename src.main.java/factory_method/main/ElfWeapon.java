package com.lin.java.factory_method.main;

/**
 * Created by never on 12/24/2015.
 */
public class ElfWeapon implements Weapon {

    private WeaponType weaponType;

    public ElfWeapon(WeaponType weaponType) {
        this.weaponType = weaponType;
    }

    @Override
    public String toString() {
        return "Elven " + weaponType;
    }

    @Override
    public WeaponType getWeaponType() {
        return weaponType;
    }
}
