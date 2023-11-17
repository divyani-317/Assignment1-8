import javax.swing.plaf.synth.ColorType;

public class Permanent extends Contract {
    public int nbChildren;
    public boolean married;
    public int monthlySalary;
    public  int bonusPerChildPerMonth;
    public int accumulatedDays;
    public Permanent(int _nbChildren, boolean _married, int _monthlySalary, int _bonusPerChildPerMonth, int _accumulatedDays){
        nbChildren = _nbChildren;
        monthlySalary = _monthlySalary;
        bonusPerChildPerMonth = _bonusPerChildPerMonth;
        accumulatedDays = _accumulatedDays;
        married = _married;
    }

    public int getAccumulatedDays() {
        return accumulatedDays;
    }

    @Override
    public double accumulatedSalary() {
        return monthlySalary + (married ? bonusPerChildPerMonth * nbChildren : 0) * (getAccumulatedDays() / 20.0);
    }
}
