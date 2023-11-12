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
    }

    @Override
    public void signContract(Contract _newContract) {

    }

    @Override
    public String contractInfo() {
        return null;
    }
}
