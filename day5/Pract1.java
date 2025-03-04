import java.util.*;
public class Pract1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {1,2,3,4,5};
        int k = 0;
        int n = sc.nextInt();
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==n){
                System.out.println("present");
                k=1;
            }
           
            
        }
        if(k==0){
            System.out.println("absent");
        }

    }
}
