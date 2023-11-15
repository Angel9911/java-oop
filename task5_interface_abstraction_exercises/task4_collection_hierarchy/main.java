package interview_tasks_paysafe.object_oriented.softuni.java_oop.task5_interface_abstraction_exercises.task4_collection_hierarchy;

import interview_tasks_paysafe.object_oriented.softuni.java_oop.task5_interface_abstraction_exercises.task4_collection_hierarchy.interfaces.AddRemovable;
import interview_tasks_paysafe.object_oriented.softuni.java_oop.task5_interface_abstraction_exercises.task4_collection_hierarchy.interfaces.Addable;
import interview_tasks_paysafe.object_oriented.softuni.java_oop.task5_interface_abstraction_exercises.task4_collection_hierarchy.interfaces.MyList;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        AddCollection collection = new AddCollection();

        AddRemoveCollection addRemoveCollection = new AddRemoveCollection();

        MyList myList = new MyListImpl();

        String[] input = scanner.nextLine().split(" ");
        int countRemove = Integer.parseInt(scanner.nextLine());

        printAdd(input,collection);
        printAdd(input,addRemoveCollection);
        printAdd(input,myList);

        printRemove(input, addRemoveCollection);
        printRemove(input, myList);
    }

    private static void printAdd(String[] input, Addable collection) {

    }

    private static void printRemove(String[] input, AddRemovable addRemove) {
    }
}
