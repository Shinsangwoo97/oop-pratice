package org.example2;

public class Course {
    private final String subject; // 과목명
    private final int credit; //학점
    private final String grade; //성적 (A+, A, B+ ...)
    public Course(String subject, int credit, String grade) {
        this.subject = subject;
        this.credit = credit;
        this.grade = grade;
    }

    public int getCredit() {
        return credit;
    }
    public String getGrade(){
        return grade;
    }

    public double getGradeToNumber() {
        System.out.println("이건 뭐야"+this.grade);
        double grade = 0;
        switch (this.grade) {
            case "A+":
                grade = 4.5;
                System.out.println("이게"+ grade);
                break;
            case "A":
                grade = 4.0;
                break;
            case "B+":
                grade = 3.5;
                break;
            case "B":
                grade = 3.0;
                break;
            case "C+":
                grade = 2.5;
                break;
            case "C":
                grade = 2.0;
                break;
            case "D":
                grade = 1.5;
                break;
        }
        return grade;
    }
}
