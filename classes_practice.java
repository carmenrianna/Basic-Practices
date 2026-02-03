public class classes_practice {

    public static void main(String[] args) {

        Student s1 = new Student("Sae", 1001, 1.0F, true);

        System.out.println("Name: " + s1.name);
        System.out.println("Student ID: " + s1.studID);
        System.out.println("GPA: " + s1.gpa);
        if (s1.isEnrolled) {
            System.out.println("Enrolled: Yes");
        } else {
            System.out.println("Enrolled: No");
        }

    }

    public static class Student {
        String name;
        int studID;
        float gpa;
        boolean isEnrolled;

        public Student(String name, int studID, float gpa, boolean isEnrolled) {
            this.name = name;
            this.studID = studID;
            this.gpa = gpa;
            this.isEnrolled = isEnrolled;
        }

        void goToSchool () {
            System.out.println(name + " is going to school.");
        }

        void goHome () {
            System.out.println(name + " is going home.");
        }

        void goEat () {
            System.out.println(name + " is eating.");
        }

    }

}
