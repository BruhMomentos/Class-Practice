import java.util.ArrayList;

public class Students {
    private String firstname;
    private String lastname;
    private static int number = 1;
    static private int id;

    //Courses
    private String math;
    private String chemistry;
    private String marketing;
    private String fitness;
    private int grade;




    //Constructor
    Students(String firstname, String lastname, int id, String math, String chemistry, String marketing, String fitness, int grade){
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
    public String getmath(){ return math; }


    public String getchemistry(){
        return chemistry;
    }

    public String getmarketing(){
        return marketing;
    }

    public String getfitness(){
        return fitness;
    }
    public int getgrade(){
        return grade;
    }


    public String getname(){ String name = firstname + lastname; return name;}

    public String toString(){
        String name = getname();
        return "ID " + id + "| Name: " + name + "|Courses: ";

    }

















}
