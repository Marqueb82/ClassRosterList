package com.MarqueBurgess;

import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
	// Class list program with deletions, inserts and printed with enhanced for loop

        LinkedList<String> classStudentList = new LinkedList<String>(); //created list of students(Strings)
        classStudentList.add("Chris Scott"); //adding to list
        classStudentList.add("Anthony Scott");
        classStudentList.add("Charlotte Andrews");
        classStudentList.add("Candice Burt");
        classStudentList.add("Scotty Listenburg");
        classStudentList.add("Michael James");
        classStudentList.add("Curtis Williams");
        classStudentList.add("Brenda McClure");
        classStudentList.add("Wanda Clinton");
        classStudentList.add("Kevon Turks");
        classStudentList.add("Sandy Mitchell");
        classStudentList.add("Cassandra Wilks");
        classStudentList.add("Becky Tillerson");
        classStudentList.add("Cynthia Thomas");
        classStudentList.add("Dennis Oneal");
        classStudentList.add("Drew Brooks");
        classStudentList.add("Asia Thompson");

        System.out.println("Class Roster: ");
        System.out.println("___________________________\n");
        for(String items : classStudentList){ //for loop to print each item in list
            System.out.printf("%s\n",items);
        }

        classStudentList.remove("Sandy Mitchell"); // remove item from list
        classStudentList.add("Javon Parks");
        classStudentList.add("Peter Washington");
        classStudentList.add("Janelle Adams");
        classStudentList.add("Leslie Ryans");
        System.out.println("\nLets remove Sandy from class and add Javon, Peter, Janelle and Leslie.\n" +
                "....Lets also organize our class list by last name\n");



        sortLast(classStudentList);
        System.out.println("Class Roster: ");
        System.out.println("___________________________\n");
        for(String items : classStudentList){
            System.out.printf("%s\n",items);
        }

    }

    public static void sortLast(LinkedList<String> classNames) { //compares array items by last name
        classNames.sort((last1, last2) -> {
            String[] split1 = last1.split(" "); //split student names
            String[] split2 = last2.split(" ");
            String lastName1 = split1[1]; //set last names
            String lastName2 = split2[1];
            if (lastName1.compareTo(lastName2) > 0) { //compare last names
                return 1;
            } else {
                return -1;
            }
        });
    }
}
