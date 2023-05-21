
package Factory_Method_Astronomy;

public abstract class SolarFlares implements Obstacle{
    
    @Override
    public void show(){
        System.out.println("SolarFlares popped up");
    }
    
}

class Small_SolarFlares extends SolarFlares{
    @Override
    public void show(){
        System.out.println("Small_SolarFlares popped up");
    }
    
}

class Large_SolarFlares extends SolarFlares{
    @Override
    public void show(){
        System.out.println("Large_SolarFlares popped up");
    }
    
}