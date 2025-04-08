import java.util.Scanner;

public class Chapter1_q {
    public static void main(String[] args) {
        /*
        * 1. Add Three Number
        * 2. Calculate CGPA
        * 3. Welcome Message
        * 4. Int True or False
        * 5. Write a code to convert KM to M
        * */

//         1. Add Three Number
//        System.out.println("Enter the Three Numbers to Add : ");
        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        int c = sc.nextInt();
//        int sum = a+b+c;
//        System.out.println("The Sum of Three Numbers is : "+ sum);
//      2. Calculate CGPA
//        System.out.println("Enter the Marks to Calculating CGPA : ");
//        float p1 = sc.nextInt();
//        float c1 = sc.nextLong();
//        float m1 = sc.nextInt();
//        float per = (p1+c1+m1)/30;
//        System.out.println("The Marks of CGPA : "+per);

//      3. Welcome Message
        System.out.println("Enter your name first :");
        String name = sc.nextLine();
        System.out.println("Hello Dear "+name+" how are you");

//      4. Write a code to convert KM to M
        System.out.println("Enter the number : ");
        boolean bol = sc.hasNext();
        System.out.println(bol);
    }

}
