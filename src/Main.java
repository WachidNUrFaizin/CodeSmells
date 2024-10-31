// Main.java
public class Main {
    public static void main(String[] args) {
        // Creating a Sparrow instance
        Birds.Sparrow sparrow = new Birds.Sparrow();

        // Calling the fly method from Bird superclass
        sparrow.fly();

        // Sparrow laying an egg
        Birds.SparrowEgg egg = sparrow.layEgg();

        // Hatching the SparrowEgg
        egg.hatch();
    }
}
