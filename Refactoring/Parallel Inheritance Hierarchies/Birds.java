public class Birds {

    // Messages as constants for reuse
    private static final String BIRD_FLYING = "A bird is flying.";

    // Base class for all birds
    public static class Bird {
        public void fly() {
            System.out.println(BIRD_FLYING);
        }
    }

}