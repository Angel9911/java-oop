package interview_tasks_paysafe.object_oriented.softuni.java_oop.task9_design_patterns.creational_patterns.builder;

public class LunchOrder {

    public static class Builder{
        private LunchOrder order;

        private Builder() {
            this.order = new LunchOrder();
        }

        public static Builder get(){
            return new Builder();
        }
        public Builder withBread(String bread){
            this.order.setBread(bread);
            return this;
        }
        public Builder withSalad(String salad){
            this.order.setSalad(salad);
            return this;
        }
        public Builder withDesert(String desert){
            this.order.setDesert(desert);
            return this;
        }
        public Builder withMeat(String meat){
            this.order.setMeat(meat);
            return this;
        }
        public Builder withDrink(String drink){
            this.order.setDrink(drink);
            return this;
        }
        public LunchOrder build(){
            return this.order;
        }
    }


    private String bread;

    private String meat;

    private String salad;

    private String drink;

    private String desert;

    private void setBread(String bread) {
        this.bread = bread;
    }

    private void setMeat(String meat) {
        this.meat = meat;
    }

    private void setSalad(String salad) {
        this.salad = salad;
    }

    private void setDrink(String drink) {
        this.drink = drink;
    }

    private void setDesert(String desert) {
        this.desert = desert;
    }
    public String getBread() {
        return bread;
    }

    public String getMeat() {
        return meat;
    }

    public String getSalad() {
        return salad;
    }

    public String getDrink() {
        return drink;
    }

    public String getDesert() {
        return desert;
    }

    @Override
    public String toString() {
        return "LunchOrder{" +
                "bread='" + bread + '\'' +
                ", meat='" + meat + '\'' +
                ", salad='" + salad + '\'' +
                ", drink='" + drink + '\'' +
                ", desert='" + desert + '\'' +
                '}';
    }
}
