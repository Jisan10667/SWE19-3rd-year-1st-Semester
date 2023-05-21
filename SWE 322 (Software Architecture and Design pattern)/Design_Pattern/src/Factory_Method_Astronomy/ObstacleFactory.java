
package Factory_Method_Astronomy;

public interface ObstacleFactory {
    Obstacle createAsteroid(int score);
    Obstacle createDebrisField(int score);
    Obstacle createSolarFlare(int score);
    Obstacle createEnemyShip(int score);
    Obstacle createBlackHole(int score);
}
 
