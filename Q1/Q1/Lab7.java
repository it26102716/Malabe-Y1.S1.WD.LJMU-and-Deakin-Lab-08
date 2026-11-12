import java.util.Scanner;

public class Lab7 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int mark1, mark2, mark3, mark4;
        double average;

        System.out.println("Marks in 4 subs");

        System.out.print("Subject 1 marks ");
        mark1 = input.nextInt();

        System.out.print("Subject 1 marks ");
        mark2 = input.nextInt();

        System.out.print("Subject 1 marks ");
        mark3 = input.nextInt();

        System.out.print("Subject 1 marks ");
        mark4 = input.nextInt();

        average = (mark1 + mark2 + mark3 + mark4) / 4.0;

        System.out.println("\nAverage is : " + average);

        if (average >= 75) {
            System.out.println("Overall Grade is :Passed");
        }
        else if (average >= 50) {
            System.out.println("Overall Grade is : Credit");
        }
        else {
            System.out.println("Overall Grade is : Fail");
        }

        input.close();
    }
}