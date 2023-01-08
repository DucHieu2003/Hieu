package oop.collections.exercises;

import java.util.*;

public class TestList {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>(List.of(1, 2, 3, 4, 5, 8, 7));
        Lists.insertFirst(list1, 0);
        Lists.insertLast(list1, 6);
        System.out.println(list1);
        ArrayList<Integer> list2 = new ArrayList<>();
        Lists.replace(list1, -2);
        Lists.replace(list2, -2);
        System.out.println(list2);
        for (int i = 0; i < 1000; i++) {
            list2.add(i);
        }
        Lists.removeEvil(list2);
        Lists.removeThird(list2);
        System.out.println(list2);
        ArrayList<Integer> list3 = Lists.generateSquare();
        System.out.println(list3);
        System.out.println(Lists.contains(list3, 123));
        ArrayList<Integer> list4 = new ArrayList<>();
        Lists.copy(list3, list4);
        Lists.reverse(list2);
        Lists.reverseManual(list4);
        System.out.println(list4);
        System.out.println(list2);
        LinkedList<Integer> listE = new LinkedList<>();
        for (Integer integer : list1) listE.add(integer);
        Lists.insertBeginningEnd(listE, -1);
        System.out.println(listE);
    }
}
