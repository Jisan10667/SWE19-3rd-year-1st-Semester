package Factory_Method;

abstract class Creator {
    public abstract Product createProduct() ;
    public void SomeOP(){
        Product product=createProduct() ;
        product.operation();
    }
}
