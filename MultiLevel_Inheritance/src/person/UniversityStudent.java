package person;
//Derived class from 'Student'
public class UniversityStudent extends Student{
    String major;
    float GPA;
    public UniversityStudent(String name, int age, int rollNo, String ClassName, String major, float GPA) {
        super(name, age, rollNo, ClassName);  //call 'Student' constructor
        this.major=major;
        this.GPA=GPA;
    }
    public void SubmitAssignment(){
        System.out.println(name+" submitted an assignment for "+major+".");
    }
    public  void ShowGPA(){
        System.out.println("Current GPA "+GPA);
    }

    @Override  //overriding attendClass() method
    public void attendClass() {
        System.out.println(name+" is attending a university class for major "+major+".");
    }
}
