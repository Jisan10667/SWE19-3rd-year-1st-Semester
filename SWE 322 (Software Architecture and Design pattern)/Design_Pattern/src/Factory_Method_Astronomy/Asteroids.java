
package Factory_Method_Astronomy;

public abstract class Asteroids implements Obstacle {
    
    @Override
    public void show(){
        System.out.println("Asteroids");
    }
}

class Ice_Asteroids extends Asteroids{
    
    @Override
    public void show(){
        System.out.println("Ice_Asteroids popped up");
    }
}

class Iron_Asteroids extends Asteroids{
    
    @Override
    public void show(){
        System.out.println("Iron_Asteroids popped up");
    }
}

class Rocky_Asteroids extends Asteroids{
    
    @Override
    public void show(){
        System.out.println("Rocky_Asteroids popped up");
    }
}

class Silicon_Asteroids extends Asteroids{
    
    @Override
    public void show(){
        System.out.println("Silicon_Asteroids popped up");
    }
}