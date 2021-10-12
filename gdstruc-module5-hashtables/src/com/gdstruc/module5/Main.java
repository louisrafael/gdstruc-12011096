package com.gdstruc.module5;

public class Main {

    public static void main(String[] args) {
	/*
	 Hashtables Behaviours
     * Abstract data type
     * provides access to data using KEYS (think of it as an Index)
     * consists of KEY-VALUE pairs (data types don't have to match)
     Ex. KEY (word), VALUE (meaning), like a dictionary
     * optimized for retrieval (if you know the key)
	 */

        Player ploo = new Player(134,"Plooful", 135); // was added first
        Player wardell = new Player(536, "TSM Wardell", 640); // was added first
        Player deadlyJimmy = new Player(32, "DeadlyJimmy", 604);
        Player subroza = new Player(4931, "Subroza", 593);
        Player annieDro = new Player(6919,"C9 Annie", 593);

        SimpleHashtable hashTable = new SimpleHashtable();
        hashTable.put(ploo.getUserName(), ploo);
        hashTable.put(wardell.getUserName(), wardell);
        hashTable.put(deadlyJimmy.getUserName(),deadlyJimmy);
        hashTable.put(subroza.getUserName(),subroza);
        hashTable.put(annieDro.getUserName(),annieDro);

        //hashTable.printHashtable();
        System.out.println(hashTable.get("Subroza"));
    }
}
