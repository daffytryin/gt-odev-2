import java.util.Scanner;

public class PlaystationControl implements GameControl {


    public boolean psState = false;


    public void openPlaystation() {
        if (psState) {
            throw new RuntimeException("Playstation controller is already open!");
        }
        System.out.println("Playstation controller is opened !");
        psState = true;
    }
    public void closePlaystation() {
        if (!psState) {
            throw new RuntimeException("Playstation controller is already closed!");
        }
        System.out.println("--------------------------");
        System.out.println("Playstation controller is closed !");
        System.out.println("--------------------------");
        psState = false;
    }
    @Override
    public void addController() {
        System.out.println("--------------------------");
        System.out.println("Playstation Controller : Active ");
        System.out.println("--------------------------");
    }

    @Override
    public void playGame() {
        System.out.println("Game is initializing with Playstation Controller...");
    }

    @Override
    public void gameInterface (String button){
        System.out.println("Welcome to the Soccer Game, Playstation user! Press any button to start :");
        Scanner scanner = new Scanner(System.in);
        button = scanner.nextLine();
        System.out.println(button+ " is pressed on Playstation Controller!");
    }
}
/*Xbox için yapılan tüm işlemler playstation için de yapıldı*/

