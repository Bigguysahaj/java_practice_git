
public class fibo{
    public static void main(String[] args){
        System.out.println(fibo(10));
    }

    static int fibo(int n){

        // if n is 0 or 1, return n
        if ( n < 2 ) {
            return n;
        }

        return fibo(n-1) + fibo(n-2);
    }
}
