public class PlaystationControl implements GameControl {

    @Override
    public void pressButton(String button) {
        System.out.println("Playstation Controller : " +button + "pressed");
    }
}
