public class polymorphism {
    static void main() {

        Animals animals = new Animals();
        Dog d = new Dog();
        Cat c = new Cat();
        Bird b = new Bird();

        Animals[] a = {d, c, b};
        for (Animals x : a) {
            x.makeSound();
        }

        animals.makeSound();

    }

    public static class Animals {
        void makeSound() {
            System.out.println("Animals made sound.");
        }
    }

    static class Dog extends Animals {
        @Override
        void makeSound() {
            System.out.println("Dog barks.");
        }
    }

    static class Cat extends Animals {
        @Override
        void makeSound() {
            System.out.println("Cat meows.");
        }
    }

    static class Bird extends Animals {
        @Override
        void makeSound() {
            System.out.println("Bird twits.");
        }
    }


}
