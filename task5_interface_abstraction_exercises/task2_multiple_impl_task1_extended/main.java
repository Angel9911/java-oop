package interview_tasks_paysafe.object_oriented.softuni.java_oop.task5_interface_abstraction_exercises.task2_multiple_impl_task1_extended;


import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Class[] citizenInterfaces = Citizen.class.getInterfaces(); // Person, Birthable, Person

        if(Arrays.asList(citizenInterfaces).contains(Person.class)
                && Arrays.asList(citizenInterfaces).contains(Identifiable.class)
                && Arrays.asList(citizenInterfaces).contains(Birthable.class)){

            Method[] declaredMethods = Person.class.getDeclaredMethods();// getName, getAge, getBirthDay, getId

            Scanner scanner = new Scanner(System.in);

            String name = scanner.nextLine();

            int age = scanner.nextInt();

            String id = scanner.nextLine();

            String birthDay = scanner.nextLine();

            Person person = new Citizen(name,age, id, birthDay);

            Identifiable identifiable = new Citizen(name,age, id, birthDay);
            Birthable birthable = new Citizen(name,age, id, birthDay);

            System.out.println(declaredMethods.length);
            System.out.println(person.getName());
            System.out.println(person.getAge());
            System.out.println(identifiable.getId());
            System.out.println(birthable.getBirthDay());

        }
    }
}
