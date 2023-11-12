public class Tester extends Employee{
    final String name;
    public  int birthYear;
    public int travelDays;
    public int clientBought;
    public Motorcycle motorcycle;
    public Tester(String _name, int _birthYear, int _travelDays, int _clientsBought){
        super(_name, _birthYear,0, false, 0);
        name = _name;
        birthYear = _birthYear;
        travelDays = _travelDays;
        clientBought = _clientsBought;
    }
    public Tester(String _name, int _birthYear, int _travelDays, int _clientsBought, Motorcycle _motorcycle){
        super(_name, _birthYear,0, false, 0);
        name = _name;
        birthYear = _birthYear;
        travelDays = _travelDays;
        clientBought = _clientsBought;
        motorcycle = _motorcycle;
    }
}
