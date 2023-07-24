import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        XBoxControl xBoxControl = new XBoxControl();
        PlaystationControl playstationControl = new PlaystationControl();

        Computer computer = new Computer();
        System.out.println("Do you want to open your computer?\t"
                + "1 : ON \t 2 : OFF");
        Scanner input = new Scanner(System.in);
        int compSwitch = input.nextInt();
        if(compSwitch == 1) {
            computer.setOpen(true);
        } else if(compSwitch==2) {
            computer.setOpen(false);
        } else {
            System.out.println();
        }


        computer.addController(xBoxControl);
        computer.playGame();

        computer.addController(playstationControl);
        computer.playGame();
        System.out.println("Do you want to end game and close your PC?\t"
                + "1 : Yes \t 2 : No");
        compSwitch = input.nextInt();
        if(compSwitch == 1) {
            computer.close();
        } else if(compSwitch==2) {
            computer.setOpen(false);
        } else {
            System.out.println();
        }

    }
}