public class loops {
    public static void main(String[] args) {
        
        //for loop
        System.out.println("for loop");
        for (int i = 1; i <=5; i++) {
            if(i==3){
                continue;
            }
            System.out.println(i);
        }

        //while loop
        System.out.println("while loop");
        int j=1;
        while(j<=5){
            if(j==2){
                break;
            }
            System.out.println(j);
            j++;
        }

        //do while loop
        System.out.println("Do while loop");
        int k=1;
        do{
            if(k==3){
                k++;
                continue;
            }
            System.out.println(k);
            k++;
        }while(k<=5);
    }
    
}
