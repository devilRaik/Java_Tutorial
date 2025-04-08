import java.util.Scanner;

public class Lesson5_Exercise_12thResult {
    public static void main(String args []){
        Scanner result = new Scanner(System.in);
        System.out.println("Enter the Name of Students : ");
        String name = result.nextLine();
        System.out.println("Enter the Marks of Students : ");
        System.out.println("Enter the Marks Of Hindi");
        float h = result.nextFloat();
        System.out.println("Enter the Marks Of English");
        float e = result.nextFloat();
        System.out.println("Enter the Marks Of Physics");
        float p = result.nextFloat();
        System.out.println("Enter the Marks Of Chemistry");
        float c = result.nextFloat();
        System.out.println("Enter the Marks Of Matematics");
        float m = result.nextFloat();
        float percentage = (h+e+p+c+m)/500*100;
        System.out.println("Total Percentage of " +name+ " is " + percentage+"%");
    }
}
