package interview_tasks_paysafe.object_oriented.softuni.java_oop.task9_design_patterns.creational_patterns.prototype;

public abstract class Item implements MyClonable<Item>,Cloneable{
    private String name;
    private String image;
    private double price;

    public Item(String name, String image, double price) {
        this.name = name;
        this.image = image;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public Item clone() throws CloneNotSupportedException {
        return (Item) super.clone();
    }

    @Override
    public String toString() {
        return "Item{" +
                "name='" + name + '\'' +
                ", image='" + image + '\'' +
                ", price=" + price +
                '}';
    }
}
