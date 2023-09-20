package org.example2;

import java.util.List;

public class GradeCalculator {
    private final List<Course> courses;
    public GradeCalculator(List<Course> courses) {
        this.courses = courses;
    }
    /**
     * • 요구사항
     * • 평균학점 계산 방법 = (학점수×교과목 평점)의 합계/수강신청 총학점 수
     * • 일급 컬렉션 사용
     * */
    public double calculateGrade() {
        // (학점수x교과목 평점)의 합계
        double multipliedCreditAndCourseGrade = 0;
        for(Course course: courses){
            System.out.println("학점"+course.getCredit());
            System.out.println("점수등급"+ course.getGrade());
            System.out.println("점수"+ course.getGradeToNumber());
            multipliedCreditAndCourseGrade += course.getCredit() * course.getGradeToNumber();
        }
        System.out.println("합계"+multipliedCreditAndCourseGrade);
        // 수강신청 총학점 수
        int totalCompletedCredit = courses.stream()
                .mapToInt(Course::getCredit)
                .sum();
        System.out.println("총학점"+totalCompletedCredit);
        return multipliedCreditAndCourseGrade / totalCompletedCredit;
//    return 4.5;
    }
}
