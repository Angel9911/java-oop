package interview_tasks_paysafe.object_oriented.softuni.java_oop.task9_design_patterns.creational_patterns.singleton;


// this is a singleton
public class DbInstance {
    private static DbInstance dbInstance = null;

    private DbInstance() {
        // this prevents a code from reflection
        if(dbInstance != null){
            throw new RuntimeException("call getInstance()");

        }

        try {
            Thread.sleep(5000);
        }catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static DbInstance getInstance(){
        if(dbInstance == null){
            return dbInstance = new DbInstance();
        }
        return dbInstance;
    }
    public int createTable(){
        System.out.println("CREATE TABLE");
       return 1;
    }
}
