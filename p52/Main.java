package p52;

public class Main {
        public static void main(String[] args) {
        Course bangla = new Course("Bangla");
        System.out.println(bangla.enrolledStudents);
        bangla.enrollStudent("Rahat");
        bangla.enrollStudent("Tisha");
        System.out.println(bangla.enrolledStudents);
        bangla.unenrollStudent("Rahat");
        bangla.unenrollStudent("Tanjina");
        bangla.enrollStudent("Tanjina");
        System.out.println(bangla.enrolledStudents);
        bangla.enrollStudent("Akter");
        bangla.enrollStudent("Abdullah");


    }
    
}
