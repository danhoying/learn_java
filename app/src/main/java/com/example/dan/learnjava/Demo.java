package com.example.dan.learnjava;

/**
 * Created by dan on 3/8/17.
 */

public class Demo {
    public static void main(String[] args) {
        VampyreKing drac = new VampyreKing("Dracula");
        drac.showInfo();

//        while (drac.getLives() > 0) {
//            if (drac.dodges()) {
//                continue;
//            }
//            if (drac.runAway()) {
//                System.out.println("Dracula ran away");
//                break;
//            } else {
//                drac.takeDamage(20);
//                drac.showInfo();
//            }
//        }

        Player conan = new Player("Conan");
        conan.pickUpLoot(new Loot("Invisibility", LootType.POTION, 4));
        conan.pickUpLoot(new Loot("Mithril", LootType.ARMOR, 183));
        conan.pickUpLoot(new Loot("Ring of speed", LootType.RING, 25));
        conan.pickUpLoot(new Loot("Red Potion", LootType.POTION, 2));
        conan.pickUpLoot(new Loot("Cursed Shield", LootType.ARMOR, -8));
        conan.pickUpLoot(new Loot("Brass Ring", LootType.RING, 1));
        conan.pickUpLoot(new Loot("Chain Mail", LootType.ARMOR, 4));
        conan.pickUpLoot(new Loot("Gold Ring", LootType.RING, 12));
        conan.pickUpLoot(new Loot("Health Potion", LootType.POTION, 3));
        conan.pickUpLoot(new Loot("Silver Ring", LootType.RING, 6));
        conan.showInventory();

        System.out.println(conan.score());
    }

}
