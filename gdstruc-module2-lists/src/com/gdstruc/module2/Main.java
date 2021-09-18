package com.gdstruc.module2;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        /* ABSTRACT DATA TYPES
        - Does not dictate how data is organized
        - Dictates the operations you can perform
        */

        List<Player> playerList = new ArrayList<>();

        playerList.add(new Player(1,"Asuna", 100));
        playerList.add(new Player(2,"LethalBacon", 205));
        playerList.add(new Player(3,"HPDeskjet", 34));

        System.out.println(playerList.get(1)); // Access An Element

        playerList.add(2, new Player(553, "Arctis", 55)); // Adds An Element in Index 2

        playerList.remove(2); // Removes An Element

        // Returns "true" if specified element is found
        System.out.println(playerList.contains(new Player(2, "LethalBacon", 205)));

        // Returns the Index of where that element is currently at // Returns "-1" if the list does not contain the element
        // System.out.println(playerList.indexOf(new Player(2, "LethalBacon", 205)));

        // LOOPS -----------------------------------------------------------

        //java 8 foreach
        //playerList.forEach(player -> System.out.println(player));

        // Normal Way
        for (Player p : playerList)
        {
           System.out.println(p);
        }



    }
}
