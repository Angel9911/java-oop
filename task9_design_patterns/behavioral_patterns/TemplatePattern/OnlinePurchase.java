package interview_tasks_paysafe.object_oriented.softuni.java_oop.task9_design_patterns.behavioral_patterns.TemplatePattern;

public class OnlinePurchase extends TemplatePurchase{
    @Override
    protected void getItemsFromCard() {
        System.out.println("poruchki");
    }

    @Override
    protected void calculatePricesWithDiscounts() {
        System.out.println("calculate price");
    }

    @Override
    protected void createRecipt() {
        System.out.println("nqkoi");
    }

    @Override
    protected void notifyClient() {
        System.out.println(" do you confirm?");
    }

    @Override
    protected void payOrder() {
        System.out.println("pay");
    }
}
