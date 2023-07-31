public class Course {
    Teacher courseTeacher;
    String name;
    String code;
    String prefix;
    int score;
    int examWeight;
    int oralExamWeight;
    int oralExamScore;

    public Course(String name, String code, String prefix, int examWeight) {
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        this.score = 0;
        this.examWeight = examWeight;
        this.oralExamWeight = (100 - examWeight);
    }

    public void addTeacher(Teacher t) {
        if (this.prefix.equals(t.branch)) {
            this.courseTeacher = t;
            System.out.println("Successful!");
        } else {
            System.out.println(t.name + " is not appropriate for this lecture.");
        }
    }

    public void printTeacher() {
        if (courseTeacher != null) {
            System.out.println(this.name + " given by: " + courseTeacher.name);
        } else {
            System.out.println(this.name + " has not a lecturer yet.");
        }
    }
}