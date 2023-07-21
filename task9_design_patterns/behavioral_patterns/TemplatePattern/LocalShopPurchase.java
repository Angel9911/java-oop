package interview_tasks_paysafe.object_oriented.softuni.java_oop.task9_design_patterns.behavioral_patterns.TemplatePattern;

public class LocalShopPurchase extends TemplatePurchase{
    @Override
    protected void getItemsFromCard() {
        System.out.println("local shop pokupki");
    }

    @Override
    protected void calculatePricesWithDiscounts() {
        System.out.println("skupo");
    }

    @Override
    protected void createRecipt() {
        System.out.println("pak nqkoi");
    }

    @Override
    protected void notifyClient() {
        System.out.println("Confirm?");
    }

    @Override
    protected void payOrder() {
        System.out.println(" cash payment ");
    }
}
