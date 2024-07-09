// 6510405601 Teerut Srithongdee
public class GumballMachine {
    private int numGumballs;
    private boolean hasQuarter;

    public GumballMachine(int numGumballs) {
        this.numGumballs = numGumballs;
        this.hasQuarter = false;
    }

    public void insertQuarter() {
        if (hasQuarter) {
            System.out.println("You can't insert another quarter");
        } else {
            if (this.numGumballs == 0) {
                System.out.println("You can't insert a quarter, the machine is sold out");
                return;
            }
            System.out.println("You inserted a quarter");
            hasQuarter = true;
        }
    }

    public void turnCrank() {
        if (hasQuarter) {
            System.out.println("You turned...");
            if (numGumballs > 0) {
                numGumballs--;
                System.out.println("A gumball comes rolling out the slot");
                if (numGumballs == 0) {
                    System.out.println("Oops, out of gumballs!");
                }
            } else {
                System.out.println("No more gumballs! Sorry, can't return your quarter");
            }
            hasQuarter = false;
        } else {
            if (this.numGumballs == 0) {
                System.out.println("You turned, but there are no gumballs");
                return;
            }
            System.out.println("You turned... but there's no quarter");
        }
    }

    public void ejectQuarter() {
        if (hasQuarter) {
            System.out.println("Quarter returned");
            hasQuarter = false;
        } else {
            System.out.println("You haven't inserted a quarter");
        }
    }

    public String toString() {
        String machineDescribe = "\nMachine is " + (hasQuarter ? "waiting for turn of crank" : "waiting for quarter");

        if (numGumballs == 0) {
            machineDescribe = "\nMachine is sold out";
        }

        return "Mighty Gumball, Inc." +
                "\nJava-enabled Standing Gumball Model #2004" +
                "\nInventory: " + numGumballs + " gumball" + (numGumballs != 1 ? "s" : "") + "" +
                machineDescribe;
    }
}
