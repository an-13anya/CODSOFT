import java.sql.SQLOutput;
import java.util.Scanner;

import javax.tools.JavaCompiler;

public class StudentCRS {
    
    public static void main(String[] args) {  
        Scanner ob=new Scanner(System.in);
        Scanner ob1=new Scanner(System.in);
        Scanner sc=new Scanner(System.in);
        System.out.println("----------Course Information--------");
        System.out.println("Course name\t Course code\t Capacity\t Schedule  ");
        System.out.println("Java\t           J101\t        40\t     8:00am-9:00am");
        System.out.println("C   \t           C102\t        35\t     9:00am-10:00am");
        System.out.println("HTML\t           H103\t        50\t     11:00am-12:00pm");
        System.out.println("Python\t         P104\t        35\t     12:00pm-1:00pm\n");

        System.out.println("-----------Student Information---------");
        System.out.print("Enter name of student:");
        String name=ob.nextLine();
        System.out.print("Enter ID of student:");
        int i=ob.nextInt();
        System.out.print("Enter the Registered course(from available courses):");
        String c1=ob1.nextLine();
       System.out.println("Student "+name+" successfully registered for "+c1+" course");
      
        System.out.println("----------Available Courses---------");
        System.out.println("Course name\t Course code\t Available Slots  ");
        System.out.println("JAVA\t           J101\t        20\t     ");
        System.out.println("C   \t           C102\t        15\t    ");
        System.out.println("HTML\t           H103\t        25\t    ");
        System.out.println("Python \t        P104\t        35\t      ");

        System.out.print(" do you want to register for any other course?(click 1 for yes and 2 for no):");
        int y=ob.nextInt();
        if(y==1)
        { System.out.print("Enter Registered course(from available courses):");
            String c2=ob1.nextLine();
        System.out.println("Student "+name+" successfully registered for "+c2+" course");}
        else if (y==2)
        {System.out.println("OK,Thanks for feedback!");}
        else {System.out.println("Invalid option");}

        System.out.print(" do you want to drop a course?(click 1 for yes and 2 for no):");
        int n=ob.nextInt();
        if(n==1)
        { System.out.print("Enter course you want to drop(WARNING! Enter only the course you have registered for to drop it):");
            String d=ob1.nextLine();
            System.out.println("Student "+name+" removed from  "+d+" course");}
        else if (n==2)
        {System.out.println("OK,Thanks for feedback!");}
        else {System.out.println("Invalid option");}
    }
    }

