package com.rafejingco;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        int size = -1;
        Player asuna = new Player(1, "Asuna", 100);
        Player lethalBacon = new Player(2, "LethalBacon", 205);
        Player hpDeskjet = new Player(3, "HPDeskjet", 34);

        PlayerLinkedList playerLinkedList = new PlayerLinkedList();

        playerLinkedList.addToFront(asuna);
        playerLinkedList.addToFront(lethalBacon);
        playerLinkedList.addToFront(hpDeskjet);

        playerLinkedList.printList(size);

        /*
        Overall Feedback
         * no exposed size function
         * contains should be boolean return type
         * indexOf should be int return type
        */
    }
}
