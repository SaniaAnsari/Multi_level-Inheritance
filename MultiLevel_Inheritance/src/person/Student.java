package person;
//Derived class from 'Person'
public class Student extends Person{
    int rollNo;
    String ClassName;
    Student(String name,int age,int rollNo,String ClassName){
        super(name,age);  //call 'Person' constructor
        this.rollNo=rollNo;
        this.ClassName=ClassName;
    }
    public void attendClass() {
        System.out.println(name + " (Roll No: " + rollNo + ") is attending class " + ClassName + ".");
    }
    @Override    //overriding Introduce() method
    public void Introduce(){
        System.out.println("Hi I am  "+name+ ", a student of  "+ClassName+".");
    }

}
