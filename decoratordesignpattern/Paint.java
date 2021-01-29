package decoratordesignpattern;

/**
 * Class for paint extending vehicle decorator
 * @author Jackson Carroll
 */
public class Paint extends VehicleDecorator {
    private Vehicle vehicle;

    /**
     * Creates a new paint with the indicated vehicle
     * @param vehicle the vehicle to paint
     */
    public Paint(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    /**
     * Creates a string for paint of the vehicle
     * @return A string version of a vehicle with paint
     */
    public String toString() {
        return vehicle.toString() + ", fancy paint";
    }

    /**
     * Gets the cost of a paint job
     * @return A double for cost of paint 
     */
    public double getCost() {
        return vehicle.getCost() + 150;
    }
    
}
