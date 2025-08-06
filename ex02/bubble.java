import java.util.Scanner;

public class bubble {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] num = new int[n];
        for (int i = 0; i < n; i++) {
            num[i] = sc.nextInt();
        }
        bubblesort(num);
        sc.close();
    }
    //１個目のバブルソート
    // public static void bubblesort(int[] num) {
    //     int count = 0;
    //     int tmp = 0;
    //     int i = 0;// ソート済みと未ソート゚の境目
    //     boolean flag = true;
    //     while (flag) {
    //         flag = false;

    //         for (int j = num.length - 1; j > i; --j) {// ｊは後ろからソート対象を探す
    //             if (num[j] < num[j - 1]) {
    //                 tmp = num[j];
    //                 num[j] = num[j - 1];// ここAIに直してもらった
    //                 num[j - 1] = tmp;// ここAIに直してもらった
    //                 flag = true;// ここAIに直してもらった
    //                 count++;
    //             }
    //         }
    //         i++;
    //     }
    //     sort_print(num, count);
    // }
    //簡単に実装できるバブルソート
    public static void bubblesort(int[] num) {
        int count = 0;
        int tmp = 0;
        for (int i = 0; i < num.length; i++) {
            for (int j = num.length - 1; j > i; j--) {
                if (num[j] < num[j - 1]) {
                    tmp = num[j];
                    num[j] = num[j - 1];
                    num[j - 1] = tmp;
                    count++;
                }
            }

        }
        sort_print(num, count);
    }

    public static void sort_print(int[] num, int count) {// printを関数化

        for (int i = 0; i < num.length; i++) {
            if (i == num.length - 1) {
                System.out.println(num[i]);
            } else {
                System.out.print(num[i] + " ");// ここAIに直してもらった
            }
        }
        System.out.println(count);
    }

}
