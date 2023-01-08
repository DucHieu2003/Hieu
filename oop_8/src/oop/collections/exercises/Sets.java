package oop.collections.exercises;

import java.util.*;

public class Sets {
    public static Set<Integer> intersectionManual(Set<Integer> first, Set<Integer> second) {
        Set<Integer> third = new HashSet<Integer>();
        for (int i : first) {
            for (int j : second) {
                if (i == j) {
                    third.add(i);
                }
            }
        }
        return third;
    }

    public static Set<Integer> unionManual(Set<Integer> first, Set<Integer> second) {
        Set<Integer> third = new HashSet<Integer>();
        for (int i : first) {
            third.add(i);
        }
        for (int j : second) {
            third.add(j);
        }
        return third;
    }

    public static Set<Integer> intersection(Set<Integer> first, Set<Integer> second) {
        Set<Integer> third = new HashSet<Integer>();
        third.addAll(first);
        third.retainAll(second);
        return third;
    }

    public static Set<Integer> union(Set<Integer> first, Set<Integer> second) {
        Set<Integer> third = new HashSet<Integer>();
        third.addAll(first);
        third.addAll(second);
        return third;
    }

    public static List<Integer> toList(Set<Integer> source) {
        List<Integer> list = new ArrayList<Integer>();
        for (int i : source) {
            list.add(i);
        }
        return list;
    }

    public static List<Integer> removeDuplicates(List<Integer> source) {
        return new ArrayList<>(new HashSet<>(source));
    }

    public static List<Integer> removeDuplicatesManual(List<Integer> source) {
        List<Integer> result = new ArrayList<Integer>();
        for (int i : source) {
            if (!result.contains(i)) {
                result.add(i);
            }
        }
        return result;
    }

    public static String firstRecurringChars(String s) {
        if (s == null || s.length() == 0) {
            return null;
        }
        Set<Character> set = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            if (set.contains(s.charAt(i))) {
                return s.charAt(i) + "";
            }
            set.add(s.charAt(i));
        }
        return null;
    }

    public static Set<Character> allRecurringChars(String s) {
        if (s == null || s.length() == 0) {
            return null;
        }
        Set<Character> set = new HashSet<>();
        Set<Character> set1 = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            if (set.contains(s.charAt(i))) {
                set1.add(s.charAt(i));
            } else {
                set.add(s.charAt(i));
            }
        }
        return set1;
    }

    public static Integer[] toArray(Set<Integer> source) {
        return source.toArray(new Integer[0]);
    }

    public static int getFirst(TreeSet<Integer> source) {
        if (source == null) return -1;
        return source.first();
    }

    public static int getLast(TreeSet<Integer> source) {
        if (source == null) return -1;
        return source.last();
    }

    public static int getGreater(TreeSet<Integer> source, int value) {
        if (source == null) return -1;
        return source.higher(value);
    }
}
