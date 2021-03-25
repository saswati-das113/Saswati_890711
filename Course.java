package ans;

public class Course {
	private String courseId;
	private String courseTitle;
	private String courseInstructor;
	static int noOfInstructor=5;
	
	public Course() {

}

	public String getCourseInstructor() {
		return courseInstructor;
	}

	public void setCourseInstructor(String courseInstructor) {
		this.courseInstructor = courseInstructor;
	}



public static void main(String args[]) {
	Course c=new Course();
	c.setCourseInstructor("saswati");
	String n=c.getCourseInstructor();
	System.out.println(n);
}	
	
}