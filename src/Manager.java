
public class Manager extends Employee {
    final String name;
    public  int birthYear;
    public int travelDays;
    public int clientBought;
    public int occupationRate;
    public Car car;
    public Manager(String _name, int _birthYear, int _travelDays, int _clientsBought){
        super(_name, _birthYear,0, false, 0);
        name = _name;
        birthYear = _birthYear;
        travelDays = _travelDays;
        clientBought = _clientsBought;
    }
    public Manager(String _name, int _birthYear, int _travelDays, int _clientsBought, Car _car){
        super(_name, _birthYear,0, _car != null ? true : false, 0);
        name = _name;
        birthYear = _birthYear;
        travelDays = _travelDays;
        clientBought = _clientsBought;
        car = _car;
    }
    public Manager(String _name, int _birthYear, int _travelDays, int _clientsBought, int _occupationRate){
        super(_name, _birthYear,0, false, _occupationRate);
        name = _name;
        birthYear = _birthYear;
        travelDays = _travelDays;
        clientBought = _clientsBought;
        occupationRate = _occupationRate;
    }
    public Manager(String _name, int _birthYear, int _travelDays, int _clientsBought, int _occupationRate, Car _car){
        super(_name, _birthYear,0, _car != null ? true : false, _occupationRate);
        name = _name;
        birthYear = _birthYear;
        travelDays = _travelDays;
        clientBought = _clientsBought;
        occupationRate = _occupationRate;
        car = _car;
    }

    @Override
    public void signContract(Contract _newContract) {

    }

    @Override
    public String contractInfo() {
        return null;
    }
}
