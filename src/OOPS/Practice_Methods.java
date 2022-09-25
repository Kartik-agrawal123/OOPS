package OOPS;
public class Practice_Methods {
    /** Q.1 static void mul(int n){
     int i=1;
     while(i<=n) {
     System.out.println(n + " * " + i + " = " + n * i);
     i++;
     }
     }
     public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     int n = sc.nextInt();
     mul(n);
     } */
    /** Q.2 static void pattern(int n){
     for(int i = 1;i<=n;i++){
     for(int j = 4;j>0;j--){
     if(j>i){
     System.out.print(" ");
     }
     else{
     System.out.print( "*");
     }
     }
     System.out.println();
     }
     }

     public static void main(String[] args) {
     pattern(4);
     } */
    /** Q.3 static int sum(int num){
     int s = 0;
     if(num>0) {
     s = num + sum(num - 1);

     } return s;

     }
     public static void main(String[] args) {
     int x = sum(6);
     System.out.println(x);
     } */
    /** Q.4 static void pattern(int n){
     for(int i = 4;i>0;i--){
     for(int j = 1;j<=n;j++){
     if(j<=i){
     System.out.print("*");
     }
     else{
     System.out.print(" ");
     }
     }
     System.out.println();
     }
     }

     public static void main(String[] args) {
     pattern(4);
     } */
    static int avg(int...arr){
        int c = arr.length;
        int sum = 0;
        for(int a = 0;a<=arr.length-1;a++){
            sum = sum + arr[a];
        }
        int av = sum/c;
        return av;
    }

    public static void main(String[] args) {
        System.out.println(avg(1,2,3,4,5));
    }
}
