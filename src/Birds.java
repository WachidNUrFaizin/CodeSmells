public class Birds {
    // Kelas statis yang merepresentasikan Burung generik
    public static class Bird {
        public void fly() {
            System.out.println("A bird is flying.");
        }
    }


    public static class Hawk extends Bird {
        public Egg layEgg() {
            // Burung Hawks bertelur
            return new HawkEgg();
        }
    }


    public static class Egg {
        public void hatch() {
            System.out.println("The egg is hatching.");
        }
    }

    // Hawk egg
    public static class HawkEgg extends Egg {
        @Override
        public void hatch() {
            System.out.println("A hawk is hatching from the egg.");
        }
    }

    // Static class representing a specific type of Bird: Sparrow
    public static class Sparrow extends Bird {
        // Method for Sparrow to lay a SparrowEgg
        public SparrowEgg layEgg() {
            System.out.println("Sparrow bertelur.");
            return new SparrowEgg();
        }
    }

    // Static class representing a specific type of Egg: SparrowEgg
    public static class SparrowEgg extends Egg {
        @Override
        public void hatch() {
            System.out.println("A sparrow is hatching from the egg.");
        }
    }
}