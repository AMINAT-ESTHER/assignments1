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

    
}
