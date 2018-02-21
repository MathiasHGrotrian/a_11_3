/*package Chapter11;

import java.util.Iterator;
import java.util.LinkedList;

public class Exercise3
{
    /*
    Write a method called removeEvenInRange that accepts three parameters:
    a LinkedList, a starting index, and an ending index. The method’s behavior
     is to remove all occurrences of the even numbers that appear in the list
     between the starting index (inclusive) and the ending index (exclusive).
     Other values and occurrences of the even numbers that appear outside the
     given index range are not affected.
    For example,for the list[1, 1, 2, 0, 4, 5, 6, 8, 8, 3, 11, 9, 12, 0, 14, 0, 16],
    a call of removeEvenInRange(list, 5, 13) should produce the list[1, 1, 2, 0, 4, 5, 3, 11, 9, 0, 14, 0, 16].
     Notice that the even numbers located at indexes between 5 inclusive and 13 exclusive in the original list
     (before any modifications were made) have been removed.
     */
/*
    public static void main(String[] args)
    {
        LinkedList<Integer> list = new LinkedList<Integer>();

        list.add(1);
        list.add(1);
        list.add(2);
        list.add(0);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(8);
        list.add(8);
        list.add(3);
        list.add(11);
        list.add(9);
        list.add(12);
        list.add(0);
        list.add(14);
        list.add(0);
        list.add(16);

        System.out.println("Original list: " + list);
        removeEvenInRange(list, 5,13);

    }

    public static void removeEvenInRange(LinkedList<Integer> list, int startIndex, int endIndex)
    {
        Iterator<Integer> iterator = list.iterator();

        while(iterator.hasNext())
        {
            int element = iterator.next();

            if(element % 2 == 0 && element >= startIndex && element < endIndex)
            {
                iterator.remove();
            }

        }

        System.out.println("New list: " + list);
    }
}

*/