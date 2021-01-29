package decoratordesignpattern;

/**
 * Class for sports car extending vehicle
 * @author Jackson Carroll
 */
public class SportsCar extends Vehicle {
    
    /**
     * Default Constructor for sports cars
     */
    public SportsCar() {
        this.description = "Sports Car";
    }

    /**
     * Gets the cost of a sports car
     * @return A double for cost of a sports car
     */
    public double getCost() {
        return 30000;
    }
}
