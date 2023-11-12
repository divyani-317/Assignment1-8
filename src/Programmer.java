public class Programmer extends Employee {
    final String name;
    public  int birthYear;
    public int occupationRate;
    public int compltedProjects;
    public Motorcycle motercycle;
    public Car car;
    public Programmer(String _name, int _birthYear, int _completedProjects){
        super(_name, _birthYear,0, false, 0);
        name = _name;
        birthYear = _birthYear;
        compltedProjects = _completedProjects;
    }
    public Programmer(String _name, int _birthYear, int _completedProjects, int _occupationRate){
        super(_name, _birthYear,0, false, 0);
        name = _name;
        birthYear = _birthYear;
        compltedProjects = _completedProjects;
        occupationRate = _occupationRate;
    }
    public Programmer(String _name, int _birthYear, int _compltedProjects, int _occupationRate, Motorcycle _motercycle){
        super(_name, _birthYear,0, _motercycle != null ? true : false, 0);
        name = _name;
        birthYear = _birthYear;
        compltedProjects = _compltedProjects;
        occupationRate = _occupationRate;
        motercycle = _motercycle;
    }
    public Programmer(String _name, int _birthYear, int _compltedProjects, int _occupationRate, Car _car){
        super(_name, _birthYear,0, _car != null ? true : false, 0);
        name = _name;
        birthYear = _birthYear;
        compltedProjects = _compltedProjects;
        occupationRate = _occupationRate;
        car = _car;
    }
    public Programmer(String _name, int _birthYear, int _compltedProjects, Car _car){
        super(_name, _birthYear,0, _car != null ? true : false, 0);
        name = _name;
        birthYear = _birthYear;
        compltedProjects = _compltedProjects;
        car = _car;
    }
}
