package com.gdstruc.module5;

public class SimpleHashtable {
    private StoredPlayer[] hashtable;


    public SimpleHashtable()
    {
        hashtable = new StoredPlayer[10];
    }

    private int hashKey(String key)
    {
        return key.length() % hashtable.length;
        // Number of char % hashtable length(10)
        // Ex. 4 char % 10 length = 4 (Value will be mapped to index 4)
    }

    public void put(String key, Player value)
    {
        int hashedKey = hashKey(key);

        if(isOccupied(hashedKey))
        {
            //do linear probing
            int stoppingIndex = hashedKey; // 5

            if (hashedKey == hashtable.length - 1)
            {
                hashedKey = 0;
            }
            else
            {
                hashedKey++; // 6
            }

            while(isOccupied(hashedKey) && hashedKey != stoppingIndex)
            {
                hashedKey = (hashedKey + 1) % hashtable.length;
            }
        }

        if(isOccupied(hashedKey))
        {
            System.out.println("Sorry, there is already an element at position " + hashedKey);
        }
        else
        {
            hashtable[hashedKey] = new StoredPlayer(key, value);
        }
        // Collisions happen when we hash two different values, but end up having the same hashed key
        // meaning two keys have the same number of char, in turn, having the same index.
    }

    public Player get(String key)
    {
        int hashedKey = findKey(key);

        if(hashedKey == -1)
        {
            return null;
        }

        return hashtable[hashedKey].value;
    }

    private int findKey(String key)
    {
        int hashedKey = hashKey(key);

        // found the right key?
        if (hashtable[hashedKey] != null && hashtable[hashedKey].key.equals(key))
        {
            return hashedKey;
        }

        //do linear probing
        int stoppingIndex = hashedKey;

        if (hashedKey == hashtable.length - 1) {
            hashedKey = 0;
        } else {
            hashedKey++;
        }

        while (hashedKey != stoppingIndex
                && hashtable[hashedKey] != null
                && !hashtable[hashedKey].key.equals(key))
        {
            hashedKey = (hashedKey + 1) % hashtable.length;
        }

        if (hashtable[hashedKey] != null
        && hashtable[hashedKey].key.equals(key))
        {
            return hashedKey;
        }
        return -1;
    }

    private Boolean isOccupied(int index)
    {
        return hashtable[index] != null;
    }

    public void printHashtable()
    {
        for (int i = 0; i < hashtable.length; i++)
        {
            if (hashtable[i] != null) {
                System.out.println("Element " + i + " " + hashtable[i].value);
            }
            else
            {
                System.out.println("Element " + i + " null");
            }
        }
    }
}


