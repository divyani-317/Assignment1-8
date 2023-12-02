import java.time.LocalDate;

public class Employee extends Contract {
    final String name;
    public int birthYear;
    public int age;
    public int monthlyIncome;
    public boolean hasVehicle;
    public int occupationRate;
    public Employee(String _name, int _birthYear, int _monthlyIncome, boolean _hasVehicle, int _occupationRate){
        name = _name;
        birthYear = _birthYear;
        age = ComputeAge();
        monthlyIncome = _monthlyIncome;
        hasVehicle = _hasVehicle;
        occupationRate = _occupationRate;
    }
    public int ComputeAge(){
        return (LocalDate.now().getYear()) - birthYear;
    }

    @Override
    public void signContract(Contract _newContract) {

    }

    @Override
    public String contractInfo() {
        return null;
    }

}
