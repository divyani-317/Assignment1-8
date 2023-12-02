import java.util.ArrayList;
import java.util.List;

public class Management {
    static double workingDaysPerMonth = 20.0;
    final String rateSymbol = "%";

    List<Employee> employees = new ArrayList<>();

    // constructor for Motorcycle
    // make, plate, color, category, sidecar
    Motorcycle m1 = new Motorcycle("Kawasaki", "Custom Plate", "Yellow", VehicleType.RACE, false);
    Motorcycle m2 = new Motorcycle("Honda", "Custom Plate", "Black", VehicleType.NOT_FOR_RACE, true);

    // constructor for Car
    // make, plate, color, category, gear, type
    Car vt1 = new Car("Lamborghini", "Custom Plate", "White", VehicleType.Family, Gear.Manual, CarType.Sport);
    Car vt2 = new Car("BMW", "Custom Plate", "Black", VehicleType.Family, Gear.Automatic, CarType.Sedan);
    Car vt3 = new Car("Renault Clio", "Custom Plate", "Blue", VehicleType.Family, Gear.Manual, CarType.Hatchback);
    Car vt4 = new Car("Mazda", "Custom Plate", "White", VehicleType.Family, Gear.Automatic, CarType.SUV);

    //    Employee constructors
    // Manager: name, birthYear, nbClients, nbTravelDays, rate
    // Programmer: name, birthYear, nbProjects, rate
    // Tester: name, birthYear, nbBugs, rate
    void hireTest1() {
        employees.add(new Manager("Serge", 1985, 30, 4));
        employees.add(new Manager("Cindy", 1974, 20, 6, 80));
        employees.add(new Programmer("Paul", 1993, 3, 75));
        employees.add(new Tester("Pierre", 1987, 124, 50));
        employees.add(new Programmer("Matt", 1981, 5, 110));
        employees.add(new Programmer("Sarah", 1986, 3));
        displayEmployeeInfo(employees);
    }

    //    Employee constructors
    // Manager: name, birthYear, nbClients, nbTravelDays, rate, employeeVehicle
    // Programmer: name, birthYear, nbProjects, rate, employeeVehicle
    // Tester: name, birthYear, nbBugs, rate, employeeVehicle
    void hireTest2() {
        employees.clear();
        employees.add(new Manager("Serge", 1985, 30, 4, vt1));
        employees.add(new Manager("Cindy", 1974, 20, 6, 80, vt2));
        employees.add(new Programmer("Paul", 1993, 3, 75, m1));
        employees.add(new Tester("Pierre", 1987, 124, 50, m2));
        employees.add(new Programmer("Matt", 1981, 5, 110, vt4));
        employees.add(new Programmer("Sarah", 1986, 3, vt3));
        displayEmployeeInfo(employees);
        System.out.println("-------------------------");
        displayEmployeeDetail(employees);

    }

    void hireTest3() {
        employees.clear();
        Employee Serge = new Manager("Serge", 1985, 30, 4, vt1);
        Employee Cindy = new Manager("Cindy", 1974, 20, 6, 80, vt2);
        Employee Paul = new Programmer("Paul", 1993, 3, 75, m1);
        Employee Pierre = new Tester("Pierre", 1987, 124, 50, m2);
        Employee Matt = new Programmer("Matt", 1981, 5, 110, vt4);
        Employee Sarah = new Programmer("Sarah", 1986, 3, vt3);

        // Permanent: nbChildren, married, monthlySalary, bonusPerChildPerMonth, accumulatedDays
        // Temporary: hourlySalary, accumulatedHours
        Contract p1 = new Permanent(2, true, 6000, 200, 17);
        Contract p2 = new Permanent(3, false, 5000, 150, 19);
        Contract t1 = new Temporary(60, 30);
        Contract t2 = new Temporary(50, 60);
        Contract p3 = new Permanent(1, true, 4000, 100, 20);
        Contract p4 = new Permanent(4, true, 4500, 100, 19);
        Serge.signContract(p1);
        Cindy.signContract(p2);
        Paul.signContract(t1);
        Matt.signContract(t2);
        Pierre.signContract(p3);
        Sarah.signContract(p4);

        employees.add(Serge);
        employees.add(Cindy);
        employees.add(Paul);
        employees.add(Pierre);
        employees.add(Matt);
        employees.add(Sarah);

        displayEmployeeInfo(employees);
        displayEmployeeDetail(employees);

        System.out.println("-------------------------");
        System.out.println("Contracts: ");
        System.out.println("-------------------------");
        for (Employee employee : employees) {
            System.out.print(employee.contractInfo().getAccumulatedSalary());
        }
        System.out.println("-------------------------");

        // updating Matt's contract
        Contract p5 = new Permanent(1, true, 5000, 200, 30);
        Matt.signContract(p5);

        System.out.println("-------------------------");
        System.out.println("Contracts: ");
        System.out.println("-------------------------");
        for (Employee employee : employees) {
            System.out.print(employee.contractInfo());
        }
        System.out.println("-------------------------");

    }
    void displayEmployeeInfo(List<Employee> employees){
        for (Employee employee : employees) {
            System.out.println("We have a new employee: " + employee.name + ", a " + getPostName(employee));
        }
    }
    void displayEmployeeDetail(List<Employee> employees) {
        for (Employee employee : employees) {
            if (employee instanceof Manager) {
                System.out.println("-------------------------");
                System.out.println("Name: " + employee.name + ", a Manager" + "\n" +
                        "Age: " + employee.getAge() + "\n" +
                        "Employee has a car \n" +
                        "\t" + "- make: " + employee.getVehicle().make + "\n" +
                        "\t" + "- plate: " + employee.getVehicle().plate + "\n" +
                        "\t" + "- color: " + employee.getVehicle().color + "\n" +
                        "\t" + "- category: " + employee.getVehicle().category + "\n" +
                        "\t" + "- gear type: " + ((Car) employee.getVehicle()).getGear() + "\n" +
                        "\t" + "- type: " + ((Car) employee.getVehicle()).getType() + "\n" +
                        employee.name + " has an Occupation rate: " + employee.getRate() + rateSymbol + "\n" +
                        "He/She travelled " + ((Manager) employee).getNbTravelDays() + " days and has brought " + "\n" +
                        ((Manager) employee).getNbClients() + " new clients." +
                        "His/Her estimated annual income is" + ((Manager) employee).annualIncome()
                );
                System.out.println("-------------------------");
            } else if (employee instanceof Programmer) {
                System.out.println("-------------------------");
                System.out.println("Name: " + employee.name + ", a Programmer" + "\n" +
                        "Age: " + employee.getAge() + "\n" +
                        "Employee has a " + ((employee.getVehicle() instanceof Car) ? "car" : "motorcycle") + "\n" +
                        "\t" + "- make: " + employee.getVehicle().make + "\n" +
                        "\t" + "- plate: " + employee.getVehicle().plate + "\n" +
                        "\t" + "- color: " + employee.getVehicle().color + "\n" +
                        "\t" + "- category: " + employee.getVehicle().category );
                if(employee.getVehicle() instanceof Car){
                    System.out.println("\t" + "- gear type: " + ((Car) employee.getVehicle()).getGear() + "\n" +
                            "\t" + "- type: " + ((Car) employee.getVehicle()).getType() + "\n" );
                }
                else if(employee.getVehicle() instanceof Motorcycle){
                    System.out.println("\t" + "- with sidecar \n" );
                }
                System.out.println(
                        employee.name + " has an Occupation rate: " + employee.getRate() + rateSymbol +
                        " and completed " + ((Programmer) employee).getCompltedProjects() + " projects." + "\n" +
                        "His/Her estimated annual income is" + ((Programmer) employee).annualIncome()
                );
                System.out.println("-------------------------");
            } else if (employee instanceof Tester) {
                System.out.println("-------------------------");
                System.out.println("Name: " + employee.name + ", a Tester" + "\n" +
                        "Age: " + employee.getAge() + "\n" +
                        "Employee has a motorcycle \n" +
                        "\t" + "- make: " + employee.getVehicle().make + "\n" +
                        "\t" + "- plate: " + employee.getVehicle().plate + "\n" +
                        "\t" + "- color: " + employee.getVehicle().color + "\n" +
                        "\t" + "- category: " + employee.getVehicle().category + "\n" +
                        "\t" + "- with sidecar \n" +
                        employee.name + " has an Occupation rate: " + employee.getRate() + rateSymbol +
                        " and corrected " + ((Tester) employee).getNbBugs() + " bugs." + "\n" +
                        "His/Her estimated annual income is" + ((Tester) employee).annualIncome()
                );
                System.out.println("-------------------------");
            }
        }
    }
    private String getPostName(Employee _employee){
        String postName;
        postName = (_employee instanceof Manager) ? "manager" :
                (_employee instanceof Programmer) ? "programmer" :
                        (_employee instanceof Programmer) ? "tester" :
                                "";
        return postName;
    }
}
