public class positionOfSetBit {
    private static void position(int n){
        int count=0;
        while(n!=0){
            if((n&1)==1){
                System.out.print(count+" ");
            }
            n=n>>1;
            count++;
        }
    }
    public static void main(String[] args) {
        int n=4;
        position(n);
    }
}
