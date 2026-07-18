import java.util.Scanner;

public class assignment1 {

    static void evenodd(int n){
        if(n % 2 == 0){
            System.out.println("Even");
        }
        else{
            System.out.println("Odd");
        }
    }

    static void multiplication(int n){
        for(int i=1;i<=10;i++){
            System.out.println(n + "x" + i + "=" + n*i);
        }
    }

    static void prime(int n, int m){
        for(int i = n; i <= m; i++){
            if(i <= 1) continue;
            boolean isPrime = true;
            for(int j = 2; j <= Math.sqrt(i); j++){
                if(i % j == 0){
                    isPrime = false;
                    break;
                }
            }
            if(isPrime){
                System.out.println(i);
            }
        }
    }

    static void guess(int n){
        Scanner sc = new Scanner(System.in);
        while (true) {
            int num = sc.nextInt();
            if (num==n){
                System.out.println("correct");
                break;
            }
            else if (num>n){
                System.out.println("Lower");
            }
            else {
                System.out.println("Higher");
            }
        }
    }

    static int digisum(int n){
        int og = n;
        int sum = 0;
        while(og!=0){
            sum+=og%10;
            og/=10;
        }
        return sum;
    }

    static int fact(int n){
        int ans=1;
        if(n == 0) return 1;
        else{
            for(int i =1;i<=n;i++){
                ans*=i;
            }
        }
        return ans;
    }

    static void strong(int n, int m){
        for(int i = n; i <= m; i++){
            int og = i;
            int sum = 0;
            while(og!=0){
                sum+=fact(og%10);
                og/=10;
            }
            if(sum == i){
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

    }
}
