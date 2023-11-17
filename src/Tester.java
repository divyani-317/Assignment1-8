public class Tester extends Employee{
    private int nbBugs;
    final int  GAIN_FACTOR_ERROR = 10;
    public Tester(String _name, int _birthYear, int _nbBugs, int _rate){
        super(_name, _birthYear, _rate, null);
        nbBugs = _nbBugs;
    }
    public Tester(String _name, int _birthYear, int _nbBugs, int _rate, Motorcycle _motorcycle){
        super(_name, _birthYear, _rate, _motorcycle);
        nbBugs = _nbBugs;
    }

    public int getNbBugs() {
        return nbBugs;
    }
    public double annualIncome(){
        return ( getMonthlySalary() * 12 ) * getRate() + (getNbBugs() *  GAIN_FACTOR_ERROR);
    }
}
