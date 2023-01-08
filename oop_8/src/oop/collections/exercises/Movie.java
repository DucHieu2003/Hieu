package oop.collections.exercises;

import java.io.*;
import java.util.*;

 class Movie implements Comparable<Movie> {
    private String name;
    private double rating;
    private int year;
    public int compareTo(Movie movie) {
       return Integer.compare(year, movie.year);
    }

     public Movie(String name, double rating, int year) {
         this.name = name;
         this.rating = rating;
         this.year = year;
     }

     public String getName() {
         return name;

     }

     public double getRating() {
         return rating;
     }

     public int getYear() {
         return year;
     }
 }
