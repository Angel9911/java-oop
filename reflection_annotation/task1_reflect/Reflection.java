package interview_tasks_paysafe.object_oriented.softuni.java_oop.reflection_annotation.task1_reflect;

import interview_tasks_paysafe.object_oriented.softuni.java_oop.reflection_annotation.task4_anotation.AuthorAnnotation;
import interview_tasks_paysafe.object_oriented.softuni.java_oop.reflection_annotation.task4_anotation.MyAnnotation;

import java.io.Serializable;

@MyAnnotation("test annotation on my class")
public class Reflection implements Serializable {
    private static final String nickname = "Pinguin";
    public String name;
    protected String webAddress;
    @MyAnnotation("this store value for emails")
    String email;
    private int zip;
    //@MyAnnotation("test constructor annotation") there is an error because i didn't point that annotation could be set on constructor.
    public Reflection() {
        this.setName("java");
        this.setWebAddress("oracle.com");
        this.setEmail("mail@oracle.com");
        this.setZip(1407);
    }

    public Reflection(String name, String webAddress, String email, int zip) {
        this.setName(name);
        this.setWebAddress(webAddress);
        this.setEmail(email);
        this.setZip(zip);
    }

    public Reflection(String name, String webAddress) {
        this.name = name;
        this.webAddress = webAddress;
    }

    public static String getNickname() {
        return nickname;
    }
    @AuthorAnnotation(name = "Pesho")
    public String getName() {
        return name;
    }
    @AuthorAnnotation(name = "Angel")
    public void setName(String name) {
        this.name = name;
    }

    public String getWebAddress() {
        return webAddress;
    }

    public void setWebAddress(String webAddress) {
        this.webAddress = webAddress;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getZip() {
        return zip;
    }

    public void setZip(int zip) {
        this.zip = zip;
    }
    @AuthorAnnotation(name = "Auth generated by intelij")
    @Override
    public String toString() {
        return "Reflection{" +
                "name='" + name + '\'' +
                ", webAddress='" + webAddress + '\'' +
                ", email='" + email + '\'' +
                ", zip=" + zip +
                '}';
    }
}
