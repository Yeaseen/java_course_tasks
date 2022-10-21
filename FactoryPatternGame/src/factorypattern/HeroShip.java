/**
 * Created by Asus on 5/14/2016.
 */
package factorypattern;
public abstract class HeroShip {

    private String name1;
    private double life;
 


    public String getNameHero()
    {
        return name1;
    }
    public void setName(String newName){name1=newName;}
    public double getLife(){return  life;}

    public void setlife(double newLife){life=newLife;}

    public void displayHero()
    {
        System.out.println(getNameHero()+" is on the screen");
    }
    public void displayLife()
    {
        System.out.println("Life of "+getNameHero()+"is: "+getLife());
    }



}
