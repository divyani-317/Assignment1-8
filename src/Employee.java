import java.time.LocalDate;

public class Employee extends Contract {
    final String name;
    private int birthYear;
    private int age;
    private int monthlySalary;
    private int rate;
    private Vehicle vehicle;
    public Employee(String _name, int _birthYear, int _rate, Vehicle _vehicle){
        name = _name;
        birthYear = _birthYear;
        age = ComputeAge();
        monthlySalary = getMonthlySalary();
        setRate(_rate);
        vehicle = _vehicle;
    }

    public int getMonthlySalary() {
        return monthlySalary;
    }

    public void setRate(int _rate){
        if(_rate > 100){
            // If the occupation rate received by the
            // initializer is greater than 100%,
            // the effective occupation rate will be set to 100%
            this.rate = 100;
        }
        else if(_rate > 10){
            this.rate = _rate;
        }
        else if(_rate < 10){
            // If an initializer receives
            // as parameter an occupation rate lower than 10%,
            // the effective occupation rate of the employee must be set to 10%.
            this.rate = 10;
        }
        else {
            // The occupation rate will be 100% by default.
            this.rate = 100;
        }
    }

    public int getAge() {
        return age;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public int getRate() {
        return rate;
    }

    private int ComputeAge(){
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
