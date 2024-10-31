public class Egg {
    private final String hatchMessage;

    public Egg(String hatchMessage) {
        this.hatchMessage = hatchMessage;
    }

    public void hatch() {
        System.out.println(hatchMessage);
    }
}