public class Main {
    public static void main(String[] args) {
        // Creating a Sparrow instance
        Sparrow sparrow = new Sparrow();

        // Calling the fly method from Bird superclass
        sparrow.fly();

        // Sparrow laying an egg
        SparrowEgg egg = sparrow.laySparrowEgg();

        // Hatching the SparrowEgg
        egg.hatch();
    }
}