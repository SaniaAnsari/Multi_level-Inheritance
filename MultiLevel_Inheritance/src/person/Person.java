package person;
//base class
public class Person {
    String name;
    int age;
    Person(String name,int age){
        this.name=name;
        this.age=age;
    }
    public void Introduce(){
        System.out.println("Hi, I am  "+name+". I am  "+age+" years old.");

    }
}
