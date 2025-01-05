public class countBitsFlip {
    private static int countBitsFlip(int a, int b){
        int xor = a^b;
        int ans = 0;
        while(xor!=0){
            if((xor&1)==1){
                ans++;
            }
            xor=xor>>1;
        }
        return ans;
    }
    public static void main(String[] args) {
        System.out.println(countBitsFlip(10,20));
    }
}
