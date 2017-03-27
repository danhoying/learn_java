package com.example.dan.learnjava;

/**
 * Created by dan on 3/8/17.
 */

public class Demo {
    public static void main(String[] args) {
        Player dan = new Player("Tom Smith, 8");
//        System.out.println(dan.getHandleName());
//        System.out.println("Level: " + dan.getLevel());
//        System.out.println("Lives: " + dan.getLives());
//        System.out.println(dan.getWeapon().getName());

        Weapon myAxe = new Weapon("Goldshine Axe", 15, 50);
        dan.setWeapon(myAxe);
//        System.out.println(dan.getWeapon().getName());

        Loot redPotion = new Loot("Red Potion", LootType.POTION, 7);
        dan.pickUpLoot(redPotion);

        dan.pickUpLoot(new Loot("+3 Chest Armor", LootType.ARMOR, 80));
        dan.pickUpLoot(new Loot("Ring of Protection +2", LootType.RING, 40));
        dan.pickUpLoot(new Loot("Invisibility Potion", LootType.POTION, 35));

        dan.showInventory();
    }
}
