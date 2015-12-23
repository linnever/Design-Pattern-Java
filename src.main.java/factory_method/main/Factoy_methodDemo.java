package com.lin.java.factory_method.main;

/**
 * Created by never on 12/24/2015.
 */
public class Factoy_methodDemo {
    public static void main(String []args){
        BlackSmith blacksmith;
        Weapon weapon;

        blacksmith = new OrcBlackSmith();
        weapon = blacksmith.manufactureWeapon(WeaponType.SPEAR);
        System.out.println(weapon);
        weapon = blacksmith.manufactureWeapon(WeaponType.AXE);
        System.out.println(weapon);

        blacksmith = new ElfBlackSmith();
        weapon = blacksmith.manufactureWeapon(WeaponType.SHORT_SWORD);
        System.out.println(weapon);
        weapon = blacksmith.manufactureWeapon(WeaponType.SPEAR);
        System.out.println(weapon);
    }
}
