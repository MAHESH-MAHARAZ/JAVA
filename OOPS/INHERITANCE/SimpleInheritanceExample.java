package OOPS.INHERITANCE;

class Student
{
    String name;
    int roll;
    int marks;
    void input()
    {
        System.out.println("Enter Name Roll Marks: ");
    }
}

class Mahesh extends Student
{
    void display()
    {
        name="MAI";
        roll=01;
        marks=100;
        System.out.println(name);
        System.out.println(roll);
        System.out.println(marks);
    }
}
public class SimpleInheritanceExample 
{
    public static void main(String args[])
    {
        Mahesh m=new Mahesh();
        m.input();
        m.display();
    }
}
