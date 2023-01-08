package com.oop.collections.phonebook;

import java.util.HashMap;

public class PhoneBookMap implements PhoneBook {
    HashMap<String, Student> phoneBook;

    public PhoneBookMap() {
      phoneBook = new HashMap<String, Student>();
    }
    @Override
    public void addPerson(Student s) {
        if (!phoneBook.containsKey(s.phone)) {
            phoneBook.put(s.phone, s);
        }
    }
    @Override
    public Student searchByName(String name) {
        for (Student student : phoneBook.values()) {
            if (student.name.equals(name)) {
                return student;
            }
        }
        return null;
    }
    @Override
    public Student searchByLastname(String lastname) {
        for (Student student : phoneBook.values()) {
            if (student.lastname.equals(lastname)) {
                return student;
            }
        }
        return null;
    }
    @Override
    public Student searchByNumber(String phone) {
        for (Student student : phoneBook.values()) {
            if (student.phone.equals(phone)) {
                return student;
            }
        }
        return null;
    }
    @Override
    public void deleteByNumber(String phone) {
        phoneBook.remove(phone);
    }
}
