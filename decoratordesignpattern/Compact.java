package decoratordesignpattern;

/**
 * Class for compact cars extending vehicle
 * @author Jackson Carroll
 */
public class Compact extends Vehicle {

    /**
     * Default Constructor setting description to compact car
     */
    public Compact() {
        this.description = "Compact Car";
    }

    /**
     * Gets the cost of a compact car
     * @return A double for compact car price
     */
    public double getCost() {
        return 15000;
    }
    
}
