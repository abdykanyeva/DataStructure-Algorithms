package practice;


public class Student extends Human{


    int id;

    String name;

    String emailId;

    private Student(int id, String name, String emailId) {
        this.id = id;
        this.name = name;
        this.emailId = emailId;
    }
    public Student(){

    }


}
