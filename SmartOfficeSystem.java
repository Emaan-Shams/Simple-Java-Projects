interface Communication {
    void connect(String network);
}

interface PowerManagement {
    void powerOn();
    void powerOff();
    int checkBattery();
}

class Printer implements Communication, PowerManagement {
    private int batteryLevel;

    Printer(int bl) {
        this.batteryLevel = bl;
    }

    public void connect(String network) {
        System.out.println("Printer connected to " + network + ".");
    }

    public void powerOn() {
        System.out.println("Printer powered on.");
    }

    public void powerOff() {
        System.out.println("Printer powered off.");
    }

    public int checkBattery() {
        System.out.println("Printer battery level: " + batteryLevel + "%");
        return batteryLevel;
    }
}

class Scanner implements Communication, PowerManagement {
    private int batteryLevel;

    Scanner(int bl) {
        this.batteryLevel = bl;
    }

    public void connect(String network) {
        System.out.println("Scanner connected to " + network + ".");
    }

    public void powerOn() {
        System.out.println("Scanner powered on.");
    }

    public void powerOff() {
        System.out.println("Scanner powered off.");
    }

    public int checkBattery() {
        System.out.println("Scanner battery level: " + batteryLevel + "%");
        return batteryLevel;
    }
}

public class SmartOfficeSystem {
    public static void main(String[] args) {
        Printer printer = new Printer(90);
        Scanner scanner = new Scanner(70);

        printer.connect("Office Wi-Fi");
        printer.powerOn();
        printer.checkBattery();
        printer.powerOff();

        scanner.connect("Office Wi-Fi");
        scanner.powerOn();
        scanner.checkBattery();
        scanner.powerOff();
    }
}
