package interview_tasks_paysafe.object_oriented.softuni.java_oop.task9_design_patterns.creational_patterns.builder;

public class Main {
    public static void main(String[] args) {
        LunchOrder order1 = LunchOrder.Builder
                .get()
                .withMeat("Chicken")
                .withSalad("Tomato and cucumbers")
                .build();

        LunchOrder order2 = LunchOrder.Builder
                .get()
                .withSalad("Lettuce")
                .withDrink("Water")
                .build();

        System.out.println(order1);
        System.out.println(order2);

        // another implementation of buidler pattern
        StringBuilder stringBuilder = new StringBuilder();
        String resultTest = stringBuilder.append(13)
                .append("DADA ")
                .append(" test  ")
                .toString();
        System.out.println(resultTest);
    }
}
