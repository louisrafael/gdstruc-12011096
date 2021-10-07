package com.rafejingco;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        ArrayQueue queue = new ArrayQueue(7);
        int games = 0;

        while(true)
        {
            System.out.println("Games Successful: " + games);
            int xPlayers = (int) Math.floor(Math.random() * (7 - 1 + 1) + 1);
            System.out.println("   " + xPlayers + " Players Queued...");

            matchmaking(xPlayers, queue);

            if(queue.empty() >= 5)
            {
                for(int i = 0; i < 5; i++)
                {
                    queue.remove();
                }

                games++;
                System.out.println("   Game Start...");
                System.out.println("   5 Players Popped...");
            }
            else
            {
                System.out.println("   Not Enough Players...");
            }

            System.out.println("Players in Queue: " + queue.empty());
            System.out.println("--------------------------------------");
            System.out.println("Press enter to continue...\n");
            Scanner scanner = new Scanner(System.in);
            scanner.nextLine();

            if(games == 10)
            {
                System.out.println("GAMES SUCCESSFUL: " + games);
                System.out.println("PROGRAM TERMINATED");
                break;
            }
        }
    }

    private static void matchmaking(int xPlayers, ArrayQueue queue)
    {
        if (xPlayers == 1)
        {
            queue.add(new Player(1,"sorting", 10));
        }

        if (xPlayers == 2)
        {
            queue.add(new Player(1,"sorting", 10));
            queue.add(new Player(2,"lists", 20));
        }

        if (xPlayers == 3)
        {
            queue.add(new Player(1,"sorting", 10));
            queue.add(new Player(2,"lists", 20));
            queue.add(new Player(3,"stacks", 30));
        }

        if (xPlayers == 4)
        {
            queue.add(new Player(1,"sorting", 10));
            queue.add(new Player(2,"lists", 20));
            queue.add(new Player(3,"stacks", 30));
            queue.add(new Player(4,"queues", 40));
        }

        if (xPlayers == 5)
        {
            queue.add(new Player(1,"sorting", 10));
            queue.add(new Player(2,"lists", 20));
            queue.add(new Player(3,"stacks", 30));
            queue.add(new Player(4,"queues", 40));
            queue.add(new Player(5,"hashtables", 50));
        }

        if (xPlayers == 6)
        {
            queue.add(new Player(1,"sorting", 10));
            queue.add(new Player(2,"lists", 20));
            queue.add(new Player(3,"stacks", 30));
            queue.add(new Player(4,"queues", 40));
            queue.add(new Player(5,"hashtables", 50));
            queue.add(new Player(6,"search", 60));
        }

        if (xPlayers == 7)
        {
            queue.add(new Player(1,"sorting", 10));
            queue.add(new Player(2,"lists", 20));
            queue.add(new Player(3,"stacks", 30));
            queue.add(new Player(4,"queues", 40));
            queue.add(new Player(5,"hashtables", 50));
            queue.add(new Player(6,"search", 60));
            queue.add(new Player(7,"trees", 70));
        }
    }

}
