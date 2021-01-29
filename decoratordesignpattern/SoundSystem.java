package decoratordesignpattern;

/**
 * Class for sound system extending vehicle decorator
 * @author Jackson Carroll 
 */
public class SoundSystem extends VehicleDecorator {
    private Vehicle vehicle;

    /**
     * Creates a new sound system with the indicated vehicle
     * @param vehicle the vehicle to add a sound system
     */
    public SoundSystem(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    /**
     * Creates a string for sound system of the vehicle
     * @return A string version of a vehicle with a sound system
     */
    public String toString() {
        return vehicle.toString() + ", awesome sound";
    }

    /**
     * Gets the cost of an awesome sound system
     * @return A double for cost of a sound system
     */
    public double getCost() {
        return vehicle.getCost() + 350;
    }
    
}
