import java.util.Scanner;

public class select_sort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] num = new int[n];
        for (int i = 0; i < n; i++) {
            num[i] = sc.nextInt();
        }
        selectionSort(num);
        sc.close();
    }

    public static void selectionSort(int[] num) {
        int i;
        int minj = 0;
        int tmp = 0;
        int count = 0;
        for (i = 0; i < num.length; i++) {
            minj = i;
            for (int j = i; j < num.length; j++) {
                if (num[j] < num[minj]) {
                    minj = j;
                }
            }
            if (i != minj) {
                tmp = num[i];
                num[i] = num[minj];
                num[minj] = tmp;
                count++;
            }
        }
        
        sort_print(num,count);
    }

    public static void sort_print(int[] num,int count) {

        for (int i = 0; i < num.length; i++) {

            if (i == num.length - 1) {
                System.out.println(num[i]);
            } else {
                System.out.print(num[i] + " ");
            }
        }
        System.out.println(count);
    }
}
