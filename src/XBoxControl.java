import java.util.Scanner;


public class XBoxControl implements GameControl {

    private boolean xboxState = false; //ilk durumu kapalı olarak ayarlandı


    public void openXbox() {
        if (xboxState) {
            throw new RuntimeException("XBox controller is already open!"); //eğer zaten açıksa exception fırlatıldı
        }
        System.out.println("XBox controller is opened !");
        xboxState = true;
    }
    public void closeXbox() {
        if (!xboxState) {
            throw new RuntimeException("XBox controller is already closed!");
        }
        System.out.println("--------------------------");
        System.out.println("XBox controller is closed !");
        System.out.println("--------------------------");
        xboxState = false;
    }

    @Override //GameControlden metotları kullanabilmek için implement edildi ve override ile metotlar çağırıldı
    public void addController() {
        System.out.println("--------------------------");
        System.out.println("Xbox Controller : Active ");
        System.out.println("--------------------------");
    }

    @Override
    public void playGame() {
        System.out.println("Game is initializing with Xbox Controller...");
    }

    @Override
    public void gameInterface (String button){
        System.out.println("Welcome to the Soccer Game, XBox user! Press any button to start :");
        Scanner scanner = new Scanner(System.in);
        button = scanner.nextLine();
        System.out.println(button+ " is pressed on XBox Controller!");
    }
}
