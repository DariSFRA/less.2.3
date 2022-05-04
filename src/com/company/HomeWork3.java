package com.company;
import java.util.*;

public class HomeWork3 {

    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>(Arrays.asList(
                "Two", "Three", "Eight", "Ten", "Five", "Six", "Four", "Six", "One", "Ten", "Seven", "Eight", "One",
                "One", "Two", "Six", "Five", "Three"
                ));
        printWithoutDuplicates(stringList);
        countDuplicates(stringList);
        testPhoneBook();
    }
     public static void printWithoutDuplicates(List<String> input) {
         Set<String> inputSet = new HashSet<>(input);
         System.out.println(inputSet);
     }
     public static void countDuplicates(List<String> input){
         Set<String> inputSet = new HashSet<>(input);
         for (String word : inputSet) {
             int count = 0;
             for (String inner : input) {
                 if (word.equals(inner)) {
                     count++;
                 }
             }
             System.out.printf("%s: %d\n", word, count);
         }
     }
     public static void testPhoneBook(){
         PhoneBook.add("Hamilton", "+8 888 888 888 8");
         PhoneBook.add("Jabul", "+7 777 7777 77");
         PhoneBook.add("Spenser", "+4 4 444 444 4");
         PhoneBook.add("Bulochkin", "+8 999 999 77");
         PhoneBook.add("Kutaev", "+77 8 88 9 9999");
         PhoneBook.add("Goldy", "+9975 7 6557 766");
         PhoneBook.add("Lowseley", "+768 78676 776");
         PhoneBook.add("Bere", "+99 7 7  7687 687");
         PhoneBook.add("Goldy", "+33 354 518 8651");
         PhoneBook.add("Regal", "+77 888 7777 888");
         PhoneBook.add("Hodgon", "+99 9 999 9999");
         PhoneBook.add("Regal", "+987 88678 8678");
         PhoneBook.add("Cheng", "+30 8740 9434");
         PhoneBook.add("Goldy", "+993 496 202 7795");
         PhoneBook.add("Hunstone", "+62 434 489 5152");
         PhoneBook.add("Goldy", "+74 4 444 444");
         PhoneBook.add("Bulochkin", "+4 555 666 777");
         PhoneBook.add("Hamilton", "+55 666 666 666");


         PhoneBook.get("Hamilton");
         PhoneBook.get("Jabul");
         PhoneBook.get("Spenser");
         PhoneBook.get("Bulochkin");
         PhoneBook.get("Kutaev");
         PhoneBook.get("Goldy");
         PhoneBook.get("Lowseley");
         PhoneBook.get("Bere");
         PhoneBook.get("Regal");
         PhoneBook.get("Hodgon");
         PhoneBook.get("Cheng");
         PhoneBook.get("Hunstone");
     }
}
