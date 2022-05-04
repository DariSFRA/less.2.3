package com.company;
import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Map;

public class PhoneBook {
    private static final Map<String, List<String>> phoneBook = new HashMap<>();
    private static String name;
    private static String[] phonesToAdd;

    public static  void add(String name, String... phonesToAdd) {
        PhoneBook.name = name;
        PhoneBook.phonesToAdd = phonesToAdd;
        if (phoneBook.get(name) != null) {
            List<String> phones = new ArrayList<>(phoneBook.get(name));
            phones.addAll(List.of(phonesToAdd));
            phoneBook.put(name, phones);

        }
        else {
            phoneBook.put(name, List.of(phonesToAdd));
        }
    }

    public static void get(String name) {
        System.out.printf("%s: %s\n", name, phoneBook.get(name));
    }
}


