import java.util.*;
public class Pract2 {

    int a;
    int b;
    int c;
    public int CalcInput(int a1, int a2){
        a = a1;
        b=a2;
        return c = a1+a2;
    }
    public void get(){
        System.out.println(c);
    }
    public static void main(String[] args) {
        Pract2 a = new Pract2();
        Scanner sc = new Scanner(System.in);
        int d = sc.nextInt();
        int e = sc.nextInt();
        a.CalcInput(d , e);
        a.get();


    }
}
