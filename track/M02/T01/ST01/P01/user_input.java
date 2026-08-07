import java.util.Scanner;
public class user_input{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter integer val:");
        int num1=sc.nextInt();
        System.out.println("The integer value is "+ num1);
    }
}
//Other use input menthods are:
// nextSort()- for short int
// nextLong()- for long int
// nextBoolean()- for boolean
// nextFloat()- for float
// nextDouble()- for double
// next()- for string
// nextLine() - for string
// extChars() - for character
// nextByte() - for byte
