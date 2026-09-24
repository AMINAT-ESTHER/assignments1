public class Course {
    static int totalCourses = 0;
    static int totalStudentsEnrolled = 0;
    static double totalAttendanceSum = 0;

    String courseName;
    int enrolledStudents;
    int studentsPresent;

    public Course(String courseName, int enrolledStudents, int studentsPresent) {
        this.courseName = courseName;
        this.enrolledStudents = enrolledStudents;
        this.studentsPresent = studentsPresent;

        totalCourses++;
        totalStudentsEnrolled += enrolledStudents;
        totalAttendanceSum += studentsPresent;
    }

    public double calculateAverageAttendance() {
        double average = (double) studentsPresent / enrolledStudents * 100;
        return average;
    }

    public void CourseStatistics() {
        System.out.println("Course:" + courseName);
        System.out.println("Enrolled:" + enrolledStudents);
        System.out.println("present:" + studentsPresent);
        System.out.println("Attendance:" + calculateAverageAttendance() + "%");
    }

    public static void universityStatistics() {
        System.out.println("UNIVERSITY-WIDESTATISTICS");
        System.out.println("totalCourses:" + totalCourses);
        System.out.println("total students enrolled:" + totalStudentsEnrolled);

        double overallAttendance = (double)totalAttendanceSum / totalStudentsEnrolled * 100;
        System.out.println("overall attendance:" + overallAttendance + "%");

    }
}
