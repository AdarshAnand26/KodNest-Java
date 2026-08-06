public class labled_loops {
    public static void main(String[] args) {
        
        // loop1: for (int i = 1; i <=5; i++) {
        //     loop2: for (int j=1; j<=5;j++){
        //         if(i==2){
        //             break;
        //         }
        //         System.out.println("i value: "+i+" j value: "+j);
        //     }
        //     System.out.println();
        // }

        loop1: for (int i = 1; i <=5; i++) {
            loop2: for (int j=1; j<=5;j++){
                if(i==2){
                    break loop1; // when we use the name of the loop the given statement will execute for that loop only
                }
                System.out.println("i value: "+i+" j value: "+j);
            }
            System.out.println();
        }
    }
    
}
