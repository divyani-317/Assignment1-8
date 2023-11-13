public class Tester extends Employee{
    public int nbBugs;
    public Tester(String _name, int _birthYear, int _nbBugs, int _rate){
        super(_name, _birthYear, _rate, null);
        nbBugs = _nbBugs;
    }
    public Tester(String _name, int _birthYear, int _nbBugs, int _rate, Motorcycle _motorcycle){
        super(_name, _birthYear, _rate, _motorcycle);
        nbBugs = _nbBugs;
    }
}
