package decoratordesignpattern;

/**
 * Abstract class for vehicle
 * @author Jackson Carroll
 */
public abstract class Vehicle {
    protected String description;

    /**
     * Creates a string for a vehicle
     * @return A string for the vehicle description
     */
    public String toString() {
        return description;
    }

    /**
     * Abstract method to get the cost of a vehicle
     */
    public abstract double getCost();

}