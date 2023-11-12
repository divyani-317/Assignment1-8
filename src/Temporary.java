public class Temporary extends Contract {
    public int hourlySalary;
    public int accumulatedHours;
    public Temporary(int _hourlySalary, int _accumulatedHours){
        hourlySalary = _hourlySalary;
        accumulatedHours = _accumulatedHours;
    }

    @Override
    public void signContract(Contract _newContract) {

    }

    @Override
    public String contractInfo() {
        return null;
    }
}
