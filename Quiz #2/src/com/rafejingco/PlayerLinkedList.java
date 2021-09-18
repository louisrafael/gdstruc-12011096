package com.rafejingco;

public class PlayerLinkedList {
    private PlayerNode head;

    public void addToFront(Player player)
    {
        PlayerNode playerNode = new PlayerNode(player);
        playerNode.setNextPlayer(head);
        head = playerNode;
    }


    public void printList(int size) {
        size = -1;
        PlayerNode current = head;
        System.out.print("HEAD -> ");
        while(current != null) {
            size++;
            System.out.print(current.getPlayer());
            System.out.print(" -> ");
            current = current.getNextPlayer();
        }
        System.out.println("null");
        System.out.print("size: " + size);
    }

    public void removeElement(){
        PlayerNode moveHead = head;
        PlayerNode firstNode = null;

        for (int i = 0; i < 1; i++) {
            firstNode = moveHead;
            moveHead = moveHead.getNextPlayer();
        }

        head = moveHead;
        firstNode = null;
    }

    public void contains(int id, String name, int level) {
        PlayerNode current = head;

        while(current != null)
        {
            if (current.getPlayer().getId() == id && current.getPlayer().getName() == name && current.getPlayer().getLevel() == level)
            {
                System.out.println("\n" +"true");
                break;
            }
            else if (current.getNextPlayer() == null)
            {
                System.out.println("\n" + "false");
            }

            current = current.getNextPlayer();
        }
    }

    public void indexOf(int id, String name, int level) {
        int index = -1;
        int noIndex = 0;

        for(PlayerNode current = head; current != null;)
        {
            index++;
            if (current.getPlayer().getId() == id && current.getPlayer().getName() == name && current.getPlayer().getLevel() == level)
            {
                noIndex++;
                System.out.println("\n" + index);
                break;
            }

            current = current.getNextPlayer();
        }

        if (noIndex == 0)
        {
            System.out.println("\n" + "-1");
        }

    }

}
