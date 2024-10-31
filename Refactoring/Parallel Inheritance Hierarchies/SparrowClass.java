public class Sparrow extends Birds.Bird {

    public SparrowEgg laySparrowEgg() {
        System.out.println("Sparrow bertelur.");
        return new SparrowEgg();
    }

}