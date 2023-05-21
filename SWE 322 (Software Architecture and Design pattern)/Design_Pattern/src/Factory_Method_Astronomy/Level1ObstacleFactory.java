
package Factory_Method_Astronomy;


public abstract class Level1ObstacleFactory implements ObstacleFactory{
    
    @Override
    public Obstacle createAsteroid(int score) {
        int r = (int)(Math.random() * 2) + 1;
        if(r==1){
           return new Ice_Asteroids(); 
        }
        else {
            return new Iron_Asteroids();
        }
        
    }

    @Override
    public Obstacle createDebrisField(int score) {
        int r = (int)(Math.random() * 2) + 1;
        if(r==1){
           return new Small_Metal_DebrisField();
        }
        else {
            return new Small_Crystal_DebrisField();
        }
    }
    
    @Override
    public Obstacle createSolarFlare(int score) {
        return new Small_SolarFlares();
    }
    
    @Override
    public Obstacle createEnemyShip(int score) {
        int r = (int)(Math.random() * 2) + 1;
        if(r==1){
           return new Gray_EnemyShips(); 
        }
        else {
            return new Black_EnemyShips();
        }
    }
    
    @Override
    public Obstacle createBlackHole(int score) {

        return new Small_BlackHoles();
    }
    
}
