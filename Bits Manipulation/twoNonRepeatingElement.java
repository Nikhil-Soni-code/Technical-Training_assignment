public class twoNonRepeatingElement {
    private static int[] singleNumber(int[] nums) {
        int[] ans = new int[2];
        int xor=0;
        for(int i=0;i<nums.length;i++){
            xor^=nums[i];
        }
        int a = (xor^(xor-1)&xor);
        int bucket1=0,bucket2=0;

        for(int i=0;i<nums.length;i++){
            if((nums[i]&a)==0){
                bucket1^=nums[i];
            }
            else{
                bucket2^=nums[i];
            }
        }
        ans[0]=bucket1;
        ans[1]=bucket2;
        return ans;
    }
    public static void main(String[] args) {
        int[]a = {1,2,10,2,4,10,6,1};
        int[] ans = singleNumber(a);
        for(int i=0;i<2;i++){
            System.out.println(ans[i]);
        }
    }
}
