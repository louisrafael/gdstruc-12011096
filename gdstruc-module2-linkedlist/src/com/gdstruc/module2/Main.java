package com.gdstruc.module2;

public class Main {

    public static void main(String[] args) {

        // LINKED LIST

        Player asuna = new Player(1, "Asuna", 100);
        Player lethalBacon = new Player(2, "LethalBacon", 205);
        Player hpDeskjet = new Player(3, "HPDeskjet", 34);

        PlayerLinkedList playerLinkedList = new PlayerLinkedList();

        playerLinkedList.addToFront(asuna); // First Node (2)
        playerLinkedList.addToFront(lethalBacon); // First Node (1)
        playerLinkedList.addToFront(hpDeskjet); // First Node (0)

        playerLinkedList.printList();

    }
}
