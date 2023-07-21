package interview_tasks_paysafe.object_oriented.softuni.java_oop.task9_design_patterns.creational_patterns.prototype;

public class Music extends Item{
    private double duration;

    public Music(String name, String image, double price) {
        super(name, image, price);
    }

    public double getDuration() {
        return duration;
    }

    public void setDuration(double duration) {
        this.duration = duration;
    }

    @Override
    public String toString() {
        return "Music{" +
                "duration=" + duration +
                '}';
    }
}
