package interview_tasks_paysafe.object_oriented.softuni.java_oop.task9_design_patterns.behavioral_patterns.TemplatePattern;

public abstract class TemplatePurchase {

    public final void makeOrder(){
        getItemsFromCard();
        calculatePricesWithDiscounts();
        createRecipt();
        payOrder();
        notifyClient();
    }

    protected abstract void getItemsFromCard();

    protected abstract void calculatePricesWithDiscounts();

    protected abstract void createRecipt();

    protected abstract void notifyClient();

    protected abstract void payOrder();
}
