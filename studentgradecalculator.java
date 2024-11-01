import java.util.Scanner;

public class studentgradecalculator 
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number of subjects");
        int n=in.nextInt();
        double marks[]=new double[n];
        double total=0;
        System.out.println("Enter marks");

        for(int i=0;i<n;i++)
        {
           marks[i]=in.nextDouble();
           total+=marks[i];
        }
        double avg=total/n;
        char grade;
        if (avg >= 90) {
            grade = 'A';
        } else if (avg >= 80) {
            grade = 'B';
        } else if (avg >= 70) {
            grade = 'C';
        } else if (avg >= 60)
         {
            grade = 'D';
        } else 
        {
            grade = 'F';
        }

        System.out.println(" Results ");
        System.out.println("Total Marks: " + total);
        System.out.println("Average Percentage: " + avg + "%");
        System.out.println("Grade: " + grade);
        in.close();
        
    }
    

}


