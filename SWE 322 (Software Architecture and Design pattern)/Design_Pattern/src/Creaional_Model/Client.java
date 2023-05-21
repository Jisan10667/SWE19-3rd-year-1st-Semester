package Creaional_Model;

public class Client {
    public static void main(String[] args) {
        Burger burger = new Burger.BurgerBuilder()
                .cheese(2).letus(1).cheese(1).meat(1).cheese(1).letus(1).cheese(1).build();

        System.out.println(burger.numOfChese());
        System.out.println(burger.numOfMeat());
        System.out.println(burger.numOfLetus());
        System.out.println(burger.getCost());
    }
}
