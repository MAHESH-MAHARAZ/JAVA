package METHODS;

public class ReturnExample 
{   
    public static String MinorOrAdult(int age)
    {
        if(age>=18)
        return"Adult";
        else
        return"Minor";
    }
    public static void main(String args[])
    {
        int a=30;
        String result=MinorOrAdult(a);
        System.out.println(result);
    }
}
