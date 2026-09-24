public class UniversitySystem {
    static void main(String[] args) {
        Course c1 = new Course("Numerical Methods", 78, 40);
        Course c2 = new Course("Mobile Programming", 87, 50);
        Course c3 = new Course("Computer Networks", 58, 30);

        System.out.println("INDIVIDUAL COURSE STATISTICS");
        c1.CourseStatistics();
        c2.CourseStatistics();
        c3.CourseStatistics();

        Course.universityStatistics();
    }
}
