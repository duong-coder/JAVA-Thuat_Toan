package thamlam;

public class MaximizeSum {
    static int maximizeSum(int[] s) {
        for(int i = 0; i < s.length; i++){
            for(int j = i+1; j<s.length; j++){
                if(s[i] > s[j]){
                    int temp1 = s[i];
                    s[i] = s[j];
                    s[j] = temp1;
                }
            }
        }
        int length = s.length;
        int r = length - 1;
        int l = 0;
        int i = 0;
        int[] afs = new int[length];
        while(l<length){
            if(l%2==0){
                afs[l] = s[i];
                i++;
            }else{
                afs[l] = s[r];
                r--;
            }
            l++;
        }
        int sum = 0;
        for(int z = 0; z < length; z++){
            if(z == length - 1){
                sum += Math.abs( afs[z] - afs[0]);
            }else {
                sum += Math.abs(afs[z] - afs[z + 1]);
            }
        }

        return sum;
    }

    public static void main(String[] args) {
        int[] s = {0,0,20,17,15,13,1,15,0,11};

        System.out.println(maximizeSum(s));
    }
}
