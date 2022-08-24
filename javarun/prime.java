import java.util.Scanner;

 class fun2 {
    public static void factorial(int n){
        int f=1;
        for(int i=1;i<=n;i++){
            f*=i;
        }
        System.out.println("Factorial of number"+n+" is "+f);

    }

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        factorial(a);

    }
}