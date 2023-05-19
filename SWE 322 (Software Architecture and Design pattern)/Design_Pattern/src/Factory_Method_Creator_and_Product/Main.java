package Factory_Method_Creator_and_Product;

public class Main {
    public static void main(String[] args) {
        Creator creatorA = new ConcreteCreatorA();
        creatorA.SomeOP();

        Creator creatorB = new ConcreteCreatorB();
        creatorB.SomeOP();
    }
}
