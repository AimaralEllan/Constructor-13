public class Course {
    private String coursName;
    private String instructorName;
    private Student student;

    public Course(){

    }
    public Course(String coursName,String instructorName,Student student){
        if (coursName.length()>2){
            this.coursName=coursName;
        }else{
            System.out.println("Print again");
        }
        this.instructorName=instructorName;
        this.student=student;
    }

    /*public void setCoursName(){
        this.coursName=coursName;
    }*/
    public String getCoursName(){
        return coursName;
    }
    public String getInstructorName(){
        return instructorName;
    }
    public Student student(){
       return student;
    }
}
