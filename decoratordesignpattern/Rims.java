package decoratordesignpattern;

/**
 * Class for rims extending vehicle decorator
 * @author Jackson Carroll
 */
public class Rims extends VehicleDecorator {
    private Vehicle vehicle;

    /**
     * Creates new rims with the indicated vehicle
     * @param vehicle the vehicle to put rims on
     */
    public Rims(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    /**
     * Creates a string for rims of the vehicle
     * @return A string version of a vehicle with cool rims
     */
    public String toString() {
        return vehicle.toString() + ", cool rims";
    }

    /**
     * Gets the cost of a cool rims
     * @return A double for cost of rims
     */
    public double getCost() {
        return vehicle.getCost() + 200;
    }
    
}
