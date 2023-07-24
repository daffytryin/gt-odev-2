public class XBoxControl implements GameControl {

    @Override
    public void pressButton(String button) {
        System.out.println("Xbox Controller : " +button + "pressed");
    }
}
