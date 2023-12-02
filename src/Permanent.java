import javax.swing.plaf.synth.ColorType;

public class Permanent extends Contract {
    private int nbChildren;
    private boolean married;
    private int monthlySalary;
    private  int bonusPerChildPerMonth;
    private int accumulatedDays;
    public Permanent(int _nbChildren, boolean _married, int _monthlySalary, int _bonusPerChildPerMonth, int _accumulatedDays){
        nbChildren = _nbChildren;
        monthlySalary = _monthlySalary;
        bonusPerChildPerMonth = _bonusPerChildPerMonth;
        accumulatedDays = _accumulatedDays;
        married = _married;
    }

    public int getMonthlySalary() {
        return monthlySalary;
    }

    public int getAccumulatedDays() {
        return accumulatedDays;
    }

    public boolean getStatus()
    {
        return married;
    }

    public  int getNbChildren()
    {
        return nbChildren;
    }

    @Override
    public double getAccumulatedSalary() {
        return monthlySalary + (married ? bonusPerChildPerMonth * nbChildren : 0) * (getAccumulatedDays() / 20.0);
    }
}
