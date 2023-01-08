package oop.collections.exercises;

import java.lang.reflect.Array;
import java.util.*;

public class Lists {
    public static void insertFirst(ArrayList<Integer> list, int value) {
        list.add(0, value);
    }

    public static void insertLast(ArrayList<Integer> list, int value) {
        list.add(value);
    }

    public static void replace(ArrayList<Integer> list, int value) {
        list.set(2, value);
    }

    public static void removeThird(ArrayList<Integer> list) {
        if (list == null) {
            return;
        }
        list.remove(2);
    }

    public static void removeEvil(ArrayList<Integer> list) {
        int n = list.size();
        for (int i = 0; i < n; i++) {
            if (list.get(i) == 666) {
                list.remove(i);
            }
        }
    }

    public static ArrayList<Integer> generateSquare() {
        ArrayList<Integer> list = new ArrayList<Integer>();

        for (int i = 1; i < 11; i++) {
            int result = i * i;
            list.add(result);
        }
        return list;
    }

    public static boolean contains(ArrayList<Integer> list, int value) {
        return list.contains(value);
    }

    public static void copy(ArrayList<Integer> source, ArrayList<Integer> target) {
        target.clear();
        for (int i = 0; i < source.size(); i++) {
            target.add(source.get(i));
        }

    }

    public static void reverse(ArrayList<Integer> list) {
        Collections.reverse(list);
    }

    public static void reverseManual(ArrayList<Integer> list) {

        for (int i = 0; i < list.size() / 2; i++) {
            int temp = list.get(i);
            list.set(i, list.get(list.size() - 1 - i));
            list.set(list.size() - 1 - i, temp);
        }
    }

    public static void insertBeginningEnd(LinkedList<Integer> list, int value) {
        list.addFirst(value);
        list.addLast(value);
    }

}
