public class abstract_overriding {
    public static void main() {
        Guitar gtr = new Guitar();
        Piano piano = new Piano();

        System.out.println(piano.build);
        piano.play();
    }

    abstract static class Instrument {
        String build = "Wood";

        abstract void play();
    }

    static class Guitar extends Instrument {
        int strings = 6;
        @Override
        void play() {
            System.out.println("The guitar is playing.");
        }
    }

    static class Piano extends Instrument {
        int keys = 88;
        @Override
        void play() {
            System.out.println("The piano is playing.");
        }
    }
}
