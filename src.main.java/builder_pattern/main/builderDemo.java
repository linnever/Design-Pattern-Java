package com.lin.java.builder_pattern.main;
import  com.lin.java.builder_pattern.main.Hero.HeroBuilder;
/**
 * Created by never on 1/28/2016.
 */
public class builderDemo {
    public static void main(String[] args) {

        Hero mage =
                new HeroBuilder(Profession.MAGE, "Riobard").withHairColor(HairColor.BLACK)
                        .withWeapon(Weapon.DAGGER).build();
        System.out.println(mage);

        Hero warrior =
                new HeroBuilder(Profession.WARRIOR, "Amberjill").withHairColor(HairColor.BLOND)
                        .withHairType(HairType.LONG_CURLY).withArmor(Armor.CHAIN_MAIL).withWeapon(Weapon.SWORD)
                        .build();
        System.out.println(warrior);

        Hero thief =
                new HeroBuilder(Profession.THIEF, "Desmond").withHairType(HairType.BALD)
                        .withWeapon(Weapon.BOW).build();
        System.out.println(thief);
    }
}