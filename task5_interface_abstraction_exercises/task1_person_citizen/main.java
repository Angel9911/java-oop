package interview_tasks_paysafe.object_oriented.softuni.java_oop.task5_interface_abstraction_exercises.task1_person_citizen;

import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        Class[] citizenInterfaces = Citizen.class.getInterfaces(); // Person

        if(Arrays.asList(citizenInterfaces).contains(Person.class)){

            Method[] declaredMethods = Person.class.getDeclaredMethods();// getName, getAge

            Scanner scanner = new Scanner(System.in);

            String name = scanner.nextLine();

            int age = scanner.nextInt();

            Person person = new Citizen(name,age);

            System.out.println(declaredMethods.length);
            System.out.println(person.getName());
            System.out.println(person.getAge());

        }
    }
}
