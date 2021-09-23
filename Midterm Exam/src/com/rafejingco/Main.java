package com.rafejingco;

import java.util.EmptyStackException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        CardStack playerDeck = new CardStack(30);
        pushAll(playerDeck);
        CardStack playerHand = new CardStack(30);
        CardStack discardPile = new CardStack(30);

        while(discardPile.getTop() < 30)
        {
            int command = (int) Math.floor(Math.random() * (3 - 1 + 1) + 1);
            int xCards = (int) Math.floor(Math.random() * (5 - 1 + 1) + 1);

            commandOutput(command, playerDeck, playerHand, discardPile, xCards);


            if (command == 1 && playerDeck.getTop() > 0)
            {
                if (xCards > playerDeck.getTop()) {xCards = playerDeck.getTop();}
                playerDeck.action(playerHand, xCards);
            }
            else if (command == 2 && playerHand.getTop() > 0)
            {
                if (xCards > playerHand.getTop()) {xCards = playerHand.getTop();}
                playerHand.action(discardPile, xCards);
            }
            else if (command == 3 && discardPile.getTop() > 0)
            {
                if (xCards > discardPile.getTop()) {xCards = discardPile.getTop();}
                discardPile.action(playerHand, xCards);
            }


            System.out.println("List of Cards that the Player is currently holding: ");
            if (playerHand.getTop() > 0) {playerHand.printStack();}
            System.out.println("\n" + "Number of remaining Cards in the Player Deck: " + playerDeck.getTop());
            System.out.println("Number of Cards in the Discarded Pile: " + discardPile.getTop());

            System.out.println("Press enter to continue...");
            Scanner pause = new Scanner(System.in);
            pause.nextLine();
            System.out.println("----------------------------------------------------");

            if (playerDeck.getTop() == 0) {  System.out.println("\n" + "PROGRAM END."); break;}
        }

    }

    private static void pushAll(CardStack cards)
    {
        cards.push(new Card("Omaru Polka")); // LAST CARD
        cards.push(new Card("Shishiro Botan"));
        cards.push(new Card("Momosuzu Nene"));
        cards.push(new Card("Yukihana Lamy"));

        cards.push(new Card("Himemori Luna"));
        cards.push(new Card("Tokoyami Towa"));
        cards.push(new Card("Tsunomaki Watame"));
        cards.push(new Card("Amane Kanata"));

        cards.push(new Card("Houshou Marine"));
        cards.push(new Card("Shirogane Noel"));
        cards.push(new Card("Shiranui Flare"));
        cards.push(new Card("Uruha Rushia"));
        cards.push(new Card("Usada Pekora"));

        cards.push(new Card("Oozora Subaru"));
        cards.push(new Card("Yuzuki Choco"));
        cards.push(new Card("Nakiri Ayame"));
        cards.push(new Card("Murasaki Shion"));
        cards.push(new Card("Minato Aqua"));

        cards.push(new Card("Akai Haato"));
        cards.push(new Card("Aki Rosenthal"));
        cards.push(new Card("Natsuiro Matsuri"));
        cards.push(new Card("Shirakami Fubuki"));
        cards.push(new Card("Yozora Mel"));
        cards.push(new Card("AZKi"));
        cards.push(new Card("Hoshimachi Suisei"));
        cards.push(new Card("Sakura Miko"));

        cards.push(new Card("Roboco-san"));
        cards.push(new Card("Tokino Sora"));
        cards.push(new Card("A-chan"));
        cards.push(new Card("YAGOO")); // FIRST CARD

        /* HONORABLE MENTIONS
        Ookami Mio
        Nekomata Okayu
        Inugami Korone
        */
    }

    private static void commandOutput(int command, CardStack deck, CardStack hand, CardStack pile, int x)
    {
        if (command == 1 && deck.getTop() > 0)
        {
            System.out.println("Command: Draw " + x + " cards");
        }
        else if (command == 2 && hand.getTop() > 0)
        {
            System.out.println("Command: Discard " + x + " cards");
        }
        else if (command == 3 && pile.getTop() > 0)
        {
            System.out.println("Command: Get " + x + " from the discarded pile");
        }
        else
        {
            if(command == 2) {
                System.out.println("INVALID COMMAND: Player Hand is Empty");
            }
            if(command == 3) {
                System.out.println("INVALID COMMAND: Discarded Pile is Empty");
            }
        }
    }

}
