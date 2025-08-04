import java.util.Scanner;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Insertsort{
    public static void main(String args[]){
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] num = new int[n];

    for(int i=0;i<n;i++){
        num[i] = sc.nextInt();
    }

        insertsort(num);
    }
   
   static public void insertsort(int[] num){
   
    for(int i=0; i < num.length; i++){
       int v = num[i];
       int j = i - 1;

       while(j >= 0 && num[j] > v){
       num[j+1]=num[j];
       j--;
       num[j+1]=v;
       }

       for(int s = 0;s< num.length;s++){

            if(s==num.length - 1){
            System.out.print(num[s]);
            }
            else{
            System.out.print(num[s] + " ");
            }

    }
    System.out.println();
    }
}
}
