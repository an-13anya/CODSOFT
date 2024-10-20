import java.util.Scanner;

public class stuGC {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        System.out.println("  <--        Student Grade Calculator     -->  ");
        System.out.println("Enter student's marks for the given Subjects-->");
        System.out.print("Hindi=");
        int h=ob.nextInt();
        System.out.print("English=");
        int e=ob.nextInt();
        System.out.print("Maths=");
        int m=ob.nextInt();
        System.out.print("Physics=");
        int p=ob.nextInt();
        System.out.print("Chemistry=");
        int c=ob.nextInt();
        float t=h+e+m+p+c;
        float per=t/5;
        System.out.println("Total Marks:"+t+"\nPercentage:"+per+"%");
        if(per>=85)
            System.out.println("Grade:A+");
        else if(per>=80)
            System.out.println("Grade:A");
        else if(per>=75)
            System.out.println("Grade:B+");
        else if(per>=70)
            System.out.println("Grade:B");
        else if(per>=60)
            System.out.println("Grade:c");
        else if(per>=40)
            System.out.println("Grade:D");
        else
            System.out.println("FAIL");
    }

}
