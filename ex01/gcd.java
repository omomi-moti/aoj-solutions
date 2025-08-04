import java.util.Scanner;
public class gcd {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a,b,gcd;
        a = sc.nextInt();
        b = sc.nextInt();
        gcd = search_gcd(a,b);
        System.out.println(gcd);
    } 
    static public int search_gcd(int a,int b){
        if(a%b==0){
            return b;
        }
        else{
           return search_gcd(b,a%b);
        }
    }
}
