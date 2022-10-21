
package factorypattern;
import java.util.Scanner;

/**
 * Created by Asus on 5/13/2016.
 */



public class EnemyShipTesting {


    public static void main(String[] args) {
        //EnemyShip ufoShip =new UFOEnemyShip();
        HeroShipFactory shipfactory=new HeroShipFactory();
        HeroShip theHero = null;
        EnemyShipFActory shipFActory=new EnemyShipFActory();
        EnemyShip theEnemy = null;

        
        System.out.print("What type of ship?? (U/R/B): ");
        
        Scanner userInput=new Scanner(System.in);
        
        String typeofShip = userInput.nextLine();
        theEnemy =shipFActory.makeEnemyShip(typeofShip);

        System.out.print("What type of ship?? (W/G/M): ");
        
        String ship=userInput.nextLine();
        theHero =shipfactory.makingHeroShip(ship);

        userInput.close();
        
        if(theEnemy!=null && theHero!=null){
            doStuffEnemy(theEnemy,theHero);
        }
        else System.out.println("Enter 1st input U or B or R and 2nd input is W or G  or M next time");
        
        return; 
    }


    public static void doStuffEnemy(EnemyShip anEnemyShip,HeroShip anHeroShip)
    {
        anEnemyShip.displayEnemyShip();
        anHeroShip.displayHero();
        anHeroShip.displayLife();

        //System.out.println("Hero Present Life: "+anEnemyShip.getLife());
        anEnemyShip.followHeroShip();
        anEnemyShip.enemyShipShoot();
        anEnemyShip.enemyShipSpeed();
        double z=anHeroShip.getLife()-anEnemyShip.getDamage();
        if (z>0)System.out.println("AFter attcked, The life of "+anHeroShip.getNameHero()+"is: "+z);
        else System.out.println(anHeroShip.getNameHero()+" is Dead ");
    }
}
