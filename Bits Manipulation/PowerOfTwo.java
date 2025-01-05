public class PowerOfTwo {
    private static boolean check(int n){
        return ((n&(n-1))==0);
    }
    public static void main(String[] args) {
        int n=64;
        System.out.println(check(n));
        n=65;
        System.out.println(check(n));

    }
}
