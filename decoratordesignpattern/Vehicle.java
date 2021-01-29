package decoratordesignpattern;

/**
 * Abstract class for vehicle
 * @author Jackson Carroll
 */
public abstract class Vehicle {
    protected String description;

    public String toString() {
        return description;
    }

    public abstract double getCost();

}