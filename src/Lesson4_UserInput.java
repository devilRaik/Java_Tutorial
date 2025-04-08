import java.util.Scanner;
public class Lesson4_UserInput {
    public static void main(String[] args) {
        System.out.println("This is about Scanner function : -");
    /*
        Scanner class we use to take input from User only once we declare the Class
        Then we create a instance of Scanner class and then create variable with the help
        Scanner Class instance
    */
        Scanner sc = new Scanner(System.in);
//        How to create user input for int
        System.out.println("Enter the User Number : ");
        int ai = sc.nextInt();
        System.out.println("Enter the Second Number : ");
        int bi = sc.nextInt();
        int sumi = ai + bi;
        System.out.println("The sum of a and b is : " + sumi);

//        How to create user input for float
        System.out.println("Enter the User First Float Number : ");
        float af = sc.nextFloat();
        System.out.println("Enter the User Second Float Number : ");
        float bf = sc.nextFloat();
        float sumf = af + bf;
        System.out.println("The sum of a and b is : " + sumf);

//        This String will print only one word of stings
        String strs = sc.next();
        System.out.println(strs);

//        This String will print one or more words of sting
        String strf = sc.nextLine();
        System.out.println(strf);

//        Checking given input is true of not with boolean
        boolean bol = sc.hasNextInt();
        System.out.println(bol);

    }
}
