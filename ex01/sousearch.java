import java.util.Scanner;
public class sousearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] num = new int[n];
        int count = 0;
        for (int i = 0; i < n; i++) {
            num[i] = sc.nextInt();
            if(isPrime(num[i]) ==true){
                count++;
            }
        }
        System.out.println(count);
    }

    
    public static boolean isPrime(int num) {
    if (num < 2) return false;
    else if (num == 2) return true; //remove 2
    else if (num % 2 == 0) return false; // remove even numger

    double sqrtNum = Math.sqrt(num);//これで実行速度が跳ね上がる　ポイントはその数の平方根まで調べれば素数かわかるという点
    for (int i = 3; i <= sqrtNum; i += 2)
    {
        if (num % i == 0)
        {
            // not sosuu
            return false;
        }
    }

    // this is a souu
    return true;
}
}
//     public static int sou_search(int num) {
//         int count = 0;

//         for (int i = 0; i < num.length; i++) {
//             int j = 2;
//             while (true) {
//                 if (num[i] == 2) {
//                     count++;
//                 } 
//                 if (num[i] % j == 0) {
//                     break;
//                 } 
//                 else {
//                     j++;
//                 }
//                 if (num[i] == j) {
//                     count++;
//                     break;
//                 }
//             }
            
//         }
//         return count;
//     }
// }
