package interview_tasks_paysafe.object_oriented.softuni.java_oop.exercises.task_book_management;

public class Customer extends Person{

    private String email;
    private String address;

    public Customer(String firstName, String lastName, String email, String address) {
        super(firstName,lastName);
        this.email = email;
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
