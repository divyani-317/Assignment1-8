public class Temporary extends Contract {
    public int hourlySalary;
    public int accumulatedHours;
    public Temporary(int _hourlySalary, int _accumulatedHours){
        hourlySalary = _hourlySalary;
        accumulatedHours = _accumulatedHours;
    }

    public int getHourlySalary() {
        return hourlySalary;
    }

    @Override
    public double getAccumulatedSalary() {
        return hourlySalary * accumulatedHours;
    }

}
