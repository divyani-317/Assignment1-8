public abstract class Contract {
    private int daysWorked;
    public int getDaysWorked() {
        return daysWorked;
    }

    // Abstract method for calculating cumulative salary
    public abstract double accumulatedSalary();
}
