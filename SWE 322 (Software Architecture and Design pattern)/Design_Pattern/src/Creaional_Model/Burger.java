package Creaional_Model;

public class Burger {
    private final double cost;
    private final int cheese;
    private final int meat;
    private final int letus;

    private Burger(BurgerBuilder builder) {
        this.cost = builder.getCost();
        this.cheese = builder.cheese;
        this.meat = builder.meat;
        this.letus = builder.letus;
    }

    // getters for all fields


    public double getCost() {
        return cost;
    }

    public int numOfChese() {
        return cheese;
    }

    public int numOfMeat() {
        return meat;
    }

    public int numOfLetus() {
        return letus;
    }

    public static class BurgerBuilder {

        private int cheese = 0;
        private int meat = 0;
        private int letus = 0;
        private int amount=0 ;
        private final int chese_price = 7;
        private final int meat_price = 18;
        private final int letus_price = 12;

        public BurgerBuilder(){}

        public double getCost(){
            return cheese * chese_price + meat * meat_price + letus * letus_price;
        }

        public BurgerBuilder cheese(int cheese) {
            this.cheese += cheese;
            this.amount++ ;
            return this;
        }

        public BurgerBuilder letus(int letus) {
            this.letus += letus;
            this.amount++ ;
            return this;
        }

        public BurgerBuilder meat(int meat) {
            this.meat += meat;
            this.amount++ ;
            return this;
        }




        public Burger build() {
            return new Burger(this);
        }
    }
}
