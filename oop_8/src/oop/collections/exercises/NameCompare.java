package oop.collections.exercises;

import java.util.Comparator;

public class NameCompare implements Comparator<Movie> {
    public int compare(Movie left, Movie right) {
        return left.getName().compareTo(right.getName());
    }
}
