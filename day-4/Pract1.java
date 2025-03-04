import java.util.*;

public class Pract1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if(a>0 && a<18){
            System.out.println("You are a minor");
        }
        else if(a>=18 && a<60){
            System.out.println("You are an adult");
        }
        else if(a>=60){
            System.out.println("You are a senior citizen");
        }
        else{
            System.out.println("Invalid age");
        }
    }
}
