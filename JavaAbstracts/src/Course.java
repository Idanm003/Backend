public class Course {
    private String courseName;
    private int courseSize;
    private Teacher teacherCourse;

    public Course(String courseName, int courseSize, Teacher teacherCourse) {
        this.courseName = courseName;
        this.courseSize = courseSize;
        this.teacherCourse = teacherCourse;
    }

    public void printCourseDetails(){
        System.out.println("Course Name: " + this.courseName);
        System.out.println("Course Size: " + this.courseSize);
        this.teacherCourse.getTeacherDetails();
    }
}
