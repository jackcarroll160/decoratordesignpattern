package decoratordesignpattern;

/**
 * Class for sedan cars extending vehicle
 * @author Jackson Carroll
 */
public class Sedan extends Vehicle {

    /**
     * Default Constructor for Sedan setting the description to sedan
     */
    public Sedan() {
        this.description = "Sedan";
    }

    /**
     * Gets the cost of a sedan
     * @return A double for cost of a sedan
     */
    public double getCost() {
        return 20000;
    }
    
}
