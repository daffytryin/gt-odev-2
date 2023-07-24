public class Computer {

    private boolean isOpen;
    private GameControl control;

    public void setOpen(boolean open) {
        isOpen = open;
    }

    void open() {
        if(isOpen){
            throw new IllegalStateException("Already on !");
        }
        isOpen = true;
        System.out.println("Computer is on !");
    }

    void close() {
        if(!isOpen) {
            try {
                throw new Exception("Already closed !");
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
        isOpen = false;
        System.out.println("Computer is closed !");
    }

    void addController(GameControl control) {
        this.control = control;
    }

    void playGame() {
        if(!isOpen) {
            try {
                throw new Exception("Computer is closed, game cannot be started !");
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("Game is initializing");
        control.pressButton("Start");
        System.out.println("Game is on! Press shoot to goal!");
        control.pressButton("Shoot");
        System.out.println("Almost there! Get close to goal post!");
        control.pressButton("Forward");
        System.out.println("GOAL!");
    }



}
