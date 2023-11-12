public class Motorcycle extends Vehicle {
    public Boolean sidecar;
    public Motorcycle(String _make, String _plate, String _color, VehicleType _category, Boolean _sidecar){
        super(_make, _plate, _color, _category);
        sidecar = _sidecar;
    }
}
