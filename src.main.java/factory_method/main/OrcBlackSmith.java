package com.lin.java.factory_method.main;

/**
 * Created by never on 12/24/2015.
 */
public class OrcBlackSmith implements BlackSmith {

    public Weapon manufactureWeapon(WeaponType weaponType) {
        return new OrcWeapon(weaponType);
    }
}