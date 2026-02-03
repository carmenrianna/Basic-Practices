public class abstract_practices {
    public static void main() {
        Student std = new Student();
        std.study();
        std.sleep();
    }

    interface School {
        void study();
        void teach();
    }

    interface Home {
        String name = "Lia";
        void sleep();
    }

    static class Toddler implements Home {
        @Override
        public void sleep () {
            System.out.println(name + " is sleeping");
        }
    }

    static class Teacher implements School {
        @Override
        public void teach() {
            System.out.println("Teaching.");
        }

        @Override
        public void study() {
            System.out.println("Teacher is not studying but it needs to implement this method too.");
        }
    }

    static class Student implements School, Home {
        String name = "Sae";
        @Override
        public void study() {
            System.out.println(name + " is studying.");
        }

        @Override
        public void sleep() {
            System.out.println("Sleeping.");
        }

        @Override
        public void teach() {
            System.out.println("Student is not teaching but it needs to implement this method too.");
        }
    }
}
