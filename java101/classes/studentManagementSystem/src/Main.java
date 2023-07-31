public class Main {
    public static void main(String[] args) {

        Course math = new Course("Math", "MAT101", "MAT", 80);
        Course physics = new Course("Physics", "PHY101", "PHY", 70);
        Course chemistry = new Course("Chemistry", "CHE101", "CHE", 75);

        Teacher t1 = new Teacher("Mahmut Hoca", "90550000000", "MAT");
        Teacher t2 = new Teacher("Fatma Ayşe", "90550000001", "PHY");
        Teacher t3 = new Teacher("Ali Veli", "90550000002", "CHE");

        math.addTeacher(t1);
        physics.addTeacher(t2);
        chemistry.addTeacher(t3);

        Student s1 = new Student("İnek Şaban", 4, "140144015", math, physics, chemistry);
        s1.addBulkExamScore(50,20,40);
        s1.addOralExamScore(80,90,100);
        s1.isPass();

        Student s2 = new Student("Güdük Necmi", 4, "2211133", math, physics, chemistry);
        s2.addBulkExamScore(100,50,40);
        s2.addOralExamScore(80,90,100);
        s2.isPass();

        Student s3 = new Student("Hayta İsmail", 4, "221121312", math, physics, chemistry);
        s3.addBulkExamScore(50,20,40);
        s3.addOralExamScore(80,90,100);
        s3.isPass();

    }
}
