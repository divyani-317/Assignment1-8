public class Temporary extends Contract {
    public int hourlySalary;
    public int accumulatedHours;
    public Temporary(int _hourlySalary, int _accumulatedHours){
        hourlySalary = _hourlySalary;
        accumulatedHours = _accumulatedHours;
    }

    @Override
    public double getAccumulatedSalary() {
        return hourlySalary * accumulatedHours;
    }
}
