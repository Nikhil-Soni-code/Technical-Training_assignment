public class squareOfNumber {
    private static int calculateSquare(int num)
    {
        num = Math.abs(num);
        int ans = 0;
        for(int i=0;i<num;i++){
            ans+=num;
        }
        return ans;
    }
    public static void main(String[] args) {
        int n=25;
        System.out.println(calculateSquare(n));
    }
}
