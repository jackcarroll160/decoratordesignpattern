package decoratordesignpattern;

/**
 * Abstract class for vehicle decorator extending vehicle
 * @author Jackson Carroll
 */
public abstract class VehicleDecorator extends Vehicle {

    /**
     * Abstract method to create a string of a decorated vehicle and overrides
     */
    @Override
    public abstract String toString();
}
