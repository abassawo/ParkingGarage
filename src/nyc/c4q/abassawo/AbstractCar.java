package nyc.c4q.abassawo;

/**
 * Created by Abass
 *
 * Abstract class containing both abstract methods and concrete methods.
 */
public abstract class AbstractCar implements Driveable {

    @Override
    public void fuel(){
        System.out.println("Fueling up");
    }

    @Override
    public void brake(){
        System.out.println("Applying brakes");
    }

    public abstract void airConditioning();
}
