/**
 * Created by Asus on 5/13/2016.
 */
package factorypattern;
public abstract class EnemyShip extends HeroShip {
    private String name;
    private double amtdamage;
    private double speed;
    //private String nameHero="WIzard";
    //private double life= 50.0;


    //public String getNameHero(){return nameHero;}
    //public double getLife(){return life;}
    public String getName(){ return name;}
    public void setNAme(String newNAme) {name=newNAme;}

    public double getDamage() {return amtdamage;}
    public void setDamage(double newDamage) {amtdamage=newDamage;}

    public double getSpeed(){return speed;}
    public void setSpeed(double newSpeed){speed=newSpeed;}


    public void followHeroShip()
    {
        System.out.println(getName()+" is following Hero ");
    }

    public void displayEnemyShip()
    {
        System.out.println(getName()+" on the screen");
    }

    public void enemyShipShoot()
    {
        System.out.println(getName()+"  attacks on Hero and does damage  "+getDamage());
    }
    public void enemyShipSpeed()
    {
        System.out.println(getName()+"  speed is  "+getSpeed());
    }
    //public void heroLife()
    //{
     //   double z=getLife()-getDamage();
     //   System.out.println("After damage"+getNameHero() +"Life: "+z);

    //}



}
