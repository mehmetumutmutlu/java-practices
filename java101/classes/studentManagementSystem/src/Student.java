public class Student {
    String name, stuNo;
    int classes;
    Course math;
    Course physics;
    Course chemistry;
    double average;
    boolean isPass;


    Student(String name, int classes, String stuNo, Course math, Course physics, Course chemistry) {
        this.name = name;
        this.classes = classes;
        this.stuNo = stuNo;
        this.math = math;
        this.physics = physics;
        this.chemistry = chemistry;
        calcAverage();
        this.isPass = false;
    }


    public void addBulkExamScore(int math, int physics, int chemistry) {

        if (math >= 0 && math <= 100) {
            this.math.score = math;
        }

        if (physics >= 0 && physics <= 100) {
            this.physics.score = physics;
        }

        if (chemistry >= 0 && chemistry <= 100) {
            this.chemistry.score = chemistry;
        }

    }

    public void addOralExamScore(int mathO, int physicsO, int chemistryO) {

        if (mathO >= 0 && mathO <= 100) {
            this.math.oralExamScore = mathO;
        }

        if (physicsO >= 0 && physicsO <= 100) {
            this.physics.oralExamScore = physicsO;
        }

        if (chemistryO >= 0 && chemistryO <= 100) {
            this.chemistry.oralExamScore = chemistryO;
        }

    }

    public void isPass() {
        if (this.math.score == 0 || this.physics.score == 0 || this.chemistry.score == 0) {
            System.out.println("Error: The scores are missing.");
        } else {
            this.isPass = isCheckPass();
            printScore();
            System.out.println("Avg: " + this.average);
            if (this.isPass) {
                System.out.println("Passed.");
            } else {
                System.out.println("Failed.");
            }
        }
    }

    public void calcAverage() {
        // this.average = (this.physics.score + this.chemistry.score + this.math.score) / 3;
        int mathAvg = (this.math.score * this.math.examWeight) + (this.math.oralExamScore * this.math.oralExamWeight);
        int physicsAvg = (this.physics.score * this.physics.examWeight) + (this.physics.oralExamScore * this.physics.oralExamWeight);
        int chemistryAvg = (this.chemistry.score * this.chemistry.examWeight) + (this.chemistry.oralExamScore * this.chemistry.oralExamWeight);
        this.average = ((mathAvg + physicsAvg + chemistryAvg) / 3) / 100;
    }

    public boolean isCheckPass() {
        calcAverage();
        return this.average > 55;
    }

    public void printScore() {
        System.out.println("=========================");
        System.out.println("Name: " + this.name);
        System.out.println("Math: " + this.math.score);
        System.out.println("Physics: " + this.physics.score);
        System.out.println("Chemistry: " + this.chemistry.score);
    }

}