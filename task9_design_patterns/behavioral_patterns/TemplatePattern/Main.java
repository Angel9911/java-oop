package interview_tasks_paysafe.object_oriented.softuni.java_oop.task9_design_patterns.behavioral_patterns.TemplatePattern;

public class Main {
    public static void main(String[] args) {
        TemplatePurchase onlinePurchase = new OnlinePurchase();
        TemplatePurchase localPurchase = new LocalShopPurchase();

        onlinePurchase.makeOrder();
        System.out.println();
        localPurchase.makeOrder();

        // example of using a template pattern in java - Collection.sort();
    }
}
