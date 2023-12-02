public class Car extends Vehicle{
    private Gear gear;
    private CarType type;
    public Car(String _make, String _plate, String _color, VehicleType _category, Gear _gear, CarType _type){
        super(_make, _plate, _color, _category);
        gear = _gear;
        type = _type;
    }

    public Gear getGear() {
        return gear;
    }

    public CarType getType() {
        return type;
    }
}
