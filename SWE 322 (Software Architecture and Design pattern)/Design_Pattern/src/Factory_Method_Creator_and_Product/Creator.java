package Factory_Method_Creator_and_Product;

abstract class Creator {
    public abstract Product createProduct() ;
    public void SomeOP(){
        Product product=createProduct() ;
        product.operation();
    }
}
