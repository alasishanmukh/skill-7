import java.util.*;

class Course { long courseId; String title; String duration; double fee;

Course(long id, String title, String duration, double fee) { this.courseId = id;
this.title = title; this.duration = duration; this.fee = fee;
}

public String toString() {
return "ID: " + courseId + ", Title: " + title + ", Duration: " + duration + ", Fee: " + fee;
}
}

public class CourseManagement {

static List<Course> courseList = new ArrayList<>();
 
// Add Course
static void addCourse(long id,String title,String duration,double fee) { Course c = new Course(id,title,duration,fee);
courseList.add(c);
System.out.println("Course added successfully");
}

// View All Courses
static void viewCourses() { System.out.println("\nAll Courses:"); for(Course c : courseList) {
System.out.println(c);
}
}

// Get Course By ID
static void getCourseById(long id) { for(Course c : courseList) {
if(c.courseId == id) { System.out.println("\nCourse Found:"); System.out.println(c);
return;
}
}
System.out.println("Course not found");
}

// Update Course
static void updateCourse(long id,String title,String duration,double fee) { for(Course c : courseList) {
if(c.courseId == id) { c.title = title; c.duration = duration; c.fee = fee;
System.out.println("Course updated successfully"); return;
}
}
System.out.println("Course not found for update");
}

// Delete Course
static void deleteCourse(long id) { Iterator<Course> it = courseList.iterator(); while(it.hasNext()) {
Course c = it.next(); if(c.courseId == id) {
it.remove();
System.out.println("Course deleted successfully"); return;
 
}
}
System.out.println("Course not found");
}

// Search by Title
static void searchCourse(String title) { System.out.println("\nSearch Results:"); for(Course c : courseList) {
if(c.title.toLowerCase().contains(title.toLowerCase())) { System.out.println(c);
}
}
}

public static void main(String[] args) {

// Add course
addCourse(1,"Java Programming","3 Months",5000);

// View courses viewCourses();

// Get course by ID getCourseById(1);

// Update course
updateCourse(1,"Advanced Java","4 Months",7000);

// View courses again viewCourses();

// Search course searchCourse("Java");

// Delete course deleteCourse(1);

// View courses again viewCourses();
}
}
