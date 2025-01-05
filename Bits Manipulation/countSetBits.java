public class countSetBits {
    private static int setBits(int n) {
        int ans = 0;
        while(n!=0){
            if((n&1)==1){
                ans++;
            }
            n=n>>1;
        }
        return ans;
    }
    public static void main(String[] args) {
        int n=6;
        System.out.println(setBits(n));
    }
}