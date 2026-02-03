public class inheritance_practice {
    public static void main() {
        Instrument ins = new Instrument();
        Guitar gtr = new Guitar();
        Piano piano = new Piano();

        System.out.println(piano.build);
        gtr.play();
    }

    public static class Instrument {
        String build = "Wood";

        void play() {
            System.out.println("I am playing.");
        }
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

