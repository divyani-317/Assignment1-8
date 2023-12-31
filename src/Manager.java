import java.io.Console;

public class Manager extends Employee {
    private int nbTravelDays;
    private int nbClients;
    final int GAIN_FACTOR_CLIENT = 500;
    final int GAIN_FACTOR_TRAVEL = 100;
    public Manager(String _name, int _birthYear, int _nbClients, int _nbTravelDays){
        super(_name, _birthYear, 100, null);
        nbTravelDays = _nbTravelDays;
        nbClients = _nbClients;
    }
    public Manager(String _name, int _birthYear, int _nbClients, int _nbTravelDays, Car _car){
        super(_name, _birthYear, 100, _car);
        nbTravelDays = _nbTravelDays;
        nbClients = _nbClients;
    }
    public Manager(String _name, int _birthYear, int _nbClients, int _nbTravelDays, int _occupationRate){
        super(_name, _birthYear, _occupationRate, null);
        nbTravelDays = _nbTravelDays;
        nbClients = _nbClients;
    }
    public Manager(String _name, int _birthYear, int _nbClients, int _nbTravelDays, int _occupationRate, Car _car){
        super(_name, _birthYear, _occupationRate, _car);
        nbTravelDays = _nbTravelDays;
        nbClients = _nbClients;
    }

    public int getNbTravelDays() {
        return nbTravelDays;
    }

    public int getNbClients() {
        return nbClients;
    }
    public double annualIncome(){
        return ( getMonthlySalary() * 12 ) * getRate() + (getNbClients() * GAIN_FACTOR_CLIENT ) + (getNbTravelDays() * GAIN_FACTOR_TRAVEL);
    }
}
