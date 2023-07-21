package interview_tasks_paysafe.object_oriented.softuni.java_oop.task9_design_patterns.creational_patterns.singleton;

public class main {
    public static void main(String[] args) {

        // it's example of usages a singleton design pattern. We can crate only one instance of runtime class.
        // And every time when craete instance of this class, it returns the same result because it is singleton.

        Runtime runtime = Runtime.getRuntime();

        System.out.println(runtime);

        Runtime secondRuntime = Runtime.getRuntime();

        System.out.println(secondRuntime);

        // implementation of singleton
        long start = System.currentTimeMillis();

        DbInstance dbInstance = DbInstance.getInstance();
        dbInstance.createTable();

        long end = System.currentTimeMillis();
        System.out.println(end-start);

        start = System.currentTimeMillis();

        DbInstance dbInstance1  = DbInstance.getInstance();
        dbInstance1.createTable();

        end = System.currentTimeMillis();
        System.out.println(end - start);

    }
}
