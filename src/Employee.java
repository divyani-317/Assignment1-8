import java.time.LocalDate;

public abstract class Employee {
    final String name;
    private int birthYear;
    private int age;
    private int monthlySalary;
    private int rate;
    private boolean isMarried;
    private Vehicle vehicle;
    private Contract contract;
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

    public void setMonthlySalary(int monthlySalary) {
        this.monthlySalary = monthlySalary;
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

    public Contract contractInfo() {
        return contract;
    }

    public void signContract(Contract contract) {
        //setMonthlySalary(contract.get());
        this.contract = contract;
    }

    private int ComputeAge(){
        return (LocalDate.now().getYear()) - birthYear;
    }
    public abstract double annualIncome();
}
