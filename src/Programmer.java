public class Programmer extends Employee {
    private int compltedProjects;
    public Programmer(String _name, int _birthYear, int _completedProjects){
        super(_name, _birthYear, 100, null);
        compltedProjects = _completedProjects;
    }
    public Programmer(String _name, int _birthYear, int _completedProjects, int _occupationRate){
        super(_name, _birthYear, _occupationRate, null);
        compltedProjects = _completedProjects;
    }
    public Programmer(String _name, int _birthYear, int _compltedProjects, int _occupationRate, Motorcycle _motercycle){
        super(_name, _birthYear, _occupationRate, _motercycle);
        compltedProjects = _compltedProjects;
    }
    public Programmer(String _name, int _birthYear, int _compltedProjects, int _occupationRate, Car _car){
        super(_name, _birthYear, _occupationRate, _car);
        compltedProjects = _compltedProjects;
    }
    public Programmer(String _name, int _birthYear, int _compltedProjects, Car _car){
        super(_name, _birthYear, 100, _car);
        compltedProjects = _compltedProjects;
    }

    public int getCompltedProjects() {
        return compltedProjects;
    }
}
