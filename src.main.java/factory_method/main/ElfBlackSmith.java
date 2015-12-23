package com.lin.java.factory_method.main;

/**
 * Created by never on 12/24/2015.
 */
public class ElfBlackSmith implements BlackSmith{
    public Weapon manufactureWeapon(WeaponType weaponType) {
        return new ElfWeapon(weaponType);
    }
}
