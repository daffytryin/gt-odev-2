import java.util.Scanner;

public class Computer {

    private boolean pcState = false;
    public String button;


    public boolean isPcState() {
        return pcState;
    }

    public void openPc() {
        if (pcState) {
            throw new RuntimeException("Computer is already open!");
        }
        System.out.println("Computer is opened !");
        pcState = true;
    }
    public void closePc() {
        if (!pcState) {
            throw new RuntimeException("Computer is already closed!");
        }
        System.out.println("Computer is closed !");
        pcState = false;
    }

    public void chooseController() {

        System.out.println("Which controller do you want to use? \t 1: Playstation \t 2: XBox \t 3: Both");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                PlaystationControl playstation = new PlaystationControl();
                playstation.openPlaystation();
                playstation.addController();
                playstation.gameInterface(this.button);
                playstation.closePlaystation();
               break;
            case 2:
                XBoxControl xbox = new XBoxControl();
                xbox.openXbox();
                xbox.addController();
                xbox.gameInterface(this.button);
                xbox.closeXbox();
                break;
            case 3:
                PlaystationControl playstation2 = new PlaystationControl();
                XBoxControl xbox2 = new XBoxControl();
                playstation2.openPlaystation();
                xbox2.openXbox();
                playstation2.addController();
                xbox2.addController();
                playstation2.gameInterface(this.button);
                xbox2.gameInterface(this.button);
                playstation2.closePlaystation();
                xbox2.closeXbox();
                break;
            default:
                System.out.println("Wrong choise!");
                break;
        }
    }



}
