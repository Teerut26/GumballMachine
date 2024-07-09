// 6510405601 Teerut Srithongdee
public class Main {
    public static void main(String[] args) {
        GumballMachine machine = new GumballMachine(5);
        System.out.println(machine);
        System.out.println("");

        machine.insertQuarter();
        machine.turnCrank();

        System.out.println("");
        System.out.println(machine);
        System.out.println("");

        machine.insertQuarter();
        machine.ejectQuarter();
        machine.turnCrank();

        System.out.println("");
        System.out.println(machine);
        System.out.println("");

        machine.insertQuarter();
        machine.turnCrank();
        machine.insertQuarter();
        machine.turnCrank();

        System.out.println("");
        System.out.println(machine);
        System.out.println("");

        machine.insertQuarter();
        machine.insertQuarter();
        machine.turnCrank();
        machine.insertQuarter();
        machine.turnCrank();

        machine.insertQuarter();
        machine.turnCrank();

        System.out.println("");
        System.out.println(machine);

    }
}
