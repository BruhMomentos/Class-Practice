import java.util.ArrayList;

public class Students {
    private String firstname;
    private String lastname;
    private static int number = 1;
    static private int id;
    private Courses[] courses;





    //Constructor
    Students(String firstname, String lastname, int id){
        System.out.print("Student Id Card");
        this.firstname = firstname;
        this.lastname = lastname;
        this.id = id;


    }
    //Methods
    public int getid(){ return id; }

    public String getfirstnamename(){
        return firstname;
    }

    public String getlastname(){
        return lastname;
    }

    public void setCourses(){

    }
    public String getname(){ String name = firstname + lastname; return name;}

    public String toString(){
        String name = getname();
        return "ID " + id + "| Name: " + name;

    }

















}
