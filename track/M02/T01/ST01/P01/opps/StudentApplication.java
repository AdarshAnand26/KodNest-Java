package opps;

public class StudentApplication {
    public static void main(String[] args) {
        student s1= new student();
        s1.roll=1;
        s1.name="John";
        s1.height=5.5;
        System.out.println("Roll: "+s1.roll+" Name: "+s1.name+" Height: "+s1.height);
        s1.run();
        s1.sleep();
        
    }
}
