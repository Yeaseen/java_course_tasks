/**
 * Created by Asus on 5/14/2016.
 */
package factorypattern;
public class HeroShipFactory { 

    public HeroShip makingHeroShip(String newShipType)
    {
        HeroShip newship=null;

        if(newShipType.equals("W"))
        {
            return new Wizard();
        }
        else if(newShipType.equals("G"))
        {
            return new GiantSkeleton();
        }
        else if(newShipType.equals("M"))
        {
            return new Minion();
        }
        else return null;
    }

}
