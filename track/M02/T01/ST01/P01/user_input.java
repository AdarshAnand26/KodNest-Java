import java.util.Scanner;
public class user_input{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter integer val:");
        int num1=sc.nextInt();
        System.out.println("The integer value is "+ num1);
    }
}
//Other use input menthods are:-

// nextSort()- for short int
// nextLong()- for long int
// nextBoolean()- for boolean
// nextFloat()- for float
// nextDouble()- for double
// next()    - for string -> when the space incounter it terminate, print the value before the space only.
// nextLine()- for string -> take whole sentence and a single word also.
// extChar() - for character -> take single character.
