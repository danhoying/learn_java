package com.example.dan.learnjava;

import java.util.ArrayList;

/**
 * Created by dan on 3/8/17.
 */

public class Demo {
    public static void main(String[] args) {
        Player dan = new Player("Tom Smith, 8");
        System.out.println(dan.getHandleName());
        System.out.println("Level: " + dan.getLevel());
        System.out.println("Lives: " + dan.getLives());
        System.out.println(dan.getWeapon().getName());

        Weapon myAxe = new Weapon("Goldshine Axe", 15, 50);
        dan.setWeapon(myAxe);
        System.out.println(dan.getWeapon().getName());

        Loot redPotion = new Loot("Red Potion", LootType.POTION, 7);
        dan.pickUpLoot(redPotion);

        ArrayList<Loot> allItems = dan.getInventory();

        for(Loot item : allItems) {
            System.out.println(item.getName());
        }
    }
}
