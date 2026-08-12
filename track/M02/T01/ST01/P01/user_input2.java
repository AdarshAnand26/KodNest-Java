
import java.util.Scanner;

public class user_input2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age =sc.nextInt();
        System.out.println("My age is :"+age);

        System.out.print("Enter your hight: ");
        float hight =sc.nextFloat();
        System.out.println("My hight is :"+ hight);

        sc.nextLine(); // use to clear the buffer that is \n coming from previous input, so when the name is scanned it will not take the previous input. 

        System.out.print("Enter your name: ");
        String name =sc.nextLine();
        System.out.println("My name is :"+name);

        
        System.out.print("Enter a char: ");
        char ch=sc.next().charAt(2);
        System.out.println("My char is :"+ch);

    }
}
