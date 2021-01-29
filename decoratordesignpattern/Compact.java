package decoratordesignpattern;

/**
 * Class for compact cars extending vehicle
 * @author Jackson Carroll
 */
public class Compact extends Vehicle {

    public Compact() {
        this.description = "Compact Car";
    }

    public double getCost() {
        return 15000;
    }
    
}
