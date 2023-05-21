package Builder_Burger;

public class Client {
    public static void main(String[] args) {
        Burger burger = new Burger.BurgerBuilder()
                .cheese(2).letus(1).cheese(1).meat(1).cheese(1).letus(1).cheese(1).build();

        
        System.out.println("Chese : " + burger.numOfCheese());
        System.out.println("Meat : " + burger.numOfMeat());
        System.out.println("Letus : " + burger.numOfLetus());
        System.out.println("Cost : " + burger.getCost());
    }
}
