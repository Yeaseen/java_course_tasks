/**
 * Created by Asus on 5/13/2016.
 */
package factorypattern;
public class EnemyShipFActory {
    public EnemyShip makeEnemyShip(String newShipTYpe)
    {
        EnemyShip newShip=null;
        if(newShipTYpe.equals("U"))
        {
            return new UFOEnemyShip();

        }
        else if(newShipTYpe.equals("R"))
        {
            return new RocketEnemyShip();
        }
        else if(newShipTYpe.equals("B"))
        {
            return new BigUFOEnemeyShip();
        }
        else return null;
    }
}
