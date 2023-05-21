package Builder_Burger;

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

    public int numOfCheese() {
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
        private final int cheese_price = 10;
        private final int meat_price = 10;
        private final int letus_price = 10;
        
        public BurgerBuilder(){}

        public double getCost(){
            return cheese * cheese_price + meat * meat_price + letus * letus_price;
        }

        public BurgerBuilder cheese(int cheese) {
            this.cheese += cheese;
            return this;
        }

        public BurgerBuilder letus(int letus) {
            this.letus += letus;
            return this;
        }

        public BurgerBuilder meat(int meat) {
            this.meat += meat;
            return this;
        }

        public Burger build() {
            return new Burger(this);
        }
    }
}
