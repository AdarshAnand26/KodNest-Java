public class nestedloops {
    public static void main(String[] args) {
        
        // //nested for loop
        // for (int i = 1; i <=5; i++) {
        //     for (int j=1; j<=5;j++){
        //         System.out.println(j);
        //     }
        //     System.out.println();
        // }

        // //nested while loop
        // int i=1;
        // while(i<=5){
        //     int j=1;
        //     while(j<=5){
        //         System.out.println(j);
        //         j++;
        //     }
        //     System.out.println();
        //     i++;
        // }

        //Nested do while loop
        int i=1;
        do{
            int j=1;
            do { 
                System.out.println(j);
                j++;
            } while (j<=5);
            System.out.println();
            i++;
        }while(i<=5);
    }
}
