import java.util.Scanner;

public class benefit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] num = new int[n];
        int high_price = 0;
        for (int i = 0; i < n; i++) {
            num[i] = sc.nextInt();
        }
        high_price = high(num);
        System.out.println(high_price);
        sc.close();
    }

    
    public static int high(int[] num) {
        int recent_low_peice = num[0];
        int bestbenfit = Integer.MIN_VALUE;
        for (int i = 1; i < num.length; i++) {
            if (bestbenfit < num[i] - recent_low_peice){
                bestbenfit = num[i] - recent_low_peice;
            }
            if (recent_low_peice > num[i]) {
                recent_low_peice = num[i];
            }
        }
        return bestbenfit;

    }
}
