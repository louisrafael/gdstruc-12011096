package com.rafejingco;

public class Main {

    public static void main(String[] args) {

        Player ploo = new Player(134,"Plooful", 135); // was added first
        Player wardell = new Player(536, "TSM Wardell", 640); // was added first
        Player deadlyJimmy = new Player(32, "DeadlyJimmy", 604);
        Player subroza = new Player(4931, "Subroza", 593);
        Player annieDro = new Player(6919,"C9 Annie", 593);

        SimpleHashTable hashtable = new SimpleHashTable();
        hashtable.put(ploo.getUserName(), ploo);
        hashtable.put(wardell.getUserName(), wardell);
        hashtable.put(deadlyJimmy.getUserName(), deadlyJimmy);
        hashtable.put(subroza.getUserName(), subroza);
        hashtable.put(annieDro.getUserName(), annieDro);

        hashtable.printHashTable();
        //System.out.println(hashtable.get("Subroza"));
        hashtable.remove("Subroza");
        hashtable.printHashTable();
    }
}

