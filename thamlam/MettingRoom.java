package thamlam;

import java.util.Arrays;

public class MettingRoom {
    static int mettingRoom(int[] s, int[] e) {
        for(int i = 0; i < s.length; i++){
            for(int j = i+1; j<s.length; j++){
                if(s[i] > s[j]){
                    int temp1 = s[i];
                    s[i] = s[j];
                    s[j] = temp1;

                    int temp2 = e[i];
                    e[i] = e[j];
                    e[j] = temp2;
                }else if(s[i] == s[j]){
                    if(e[i] > e[j]){
                        int temp1 = s[i];
                        s[i] = s[j];
                        s[j] = temp1;

                        int temp2 = e[i];
                        e[i] = e[j];
                        e[j] = temp2;
                    }
                }
            }
        }
        int max = 1;
        for(int i = 0; i < s.length; i++){
            int tempS = s[i];
            int tempE = e[i];
            int tempMax = 1;
            for (int j = i + 1; j < s.length; j++){
                if(s[j] >= tempE){
                    tempMax += 1;
                    tempE = e[j];
                }
            }
            if(tempMax > max){
                max = tempMax;
            }
        }

        return max;
    }

    public static void main(String[] args) {
        int[] s = {1060,6453,1031,3028,3395,2650,441,7937,6605,7410,7296,8514,5568,9779,4161,2365,319,7499,6257,552,7704,4406,7750,2577,7961,8753,1040,7733,6421,5326,9611,9643,7132,8572,8118,5627,9732,4269,2757,4184,3702,1791,7411,4702,5022,7749,4122,7681,2845,1864,6306,1947,1755,1621,7381,6191,4467,607,1791,5407,1902,1445,4109,8245,9194,7991,4443,9333,2845,9717,9697,5193,9594,2328,7438,6158,1151,1776,5602,9324,4351,3780,9691,2261,4679,4843,5893,5247,9288,7854,9809,2151,4821,6117,8775,8292,120,2482,2513,5211};
        int[] e = {2588,6458,8672,6919,6239,5114,874,9463,7244,8005,7699,8607,9105,9869,5973,4906,5261,8401,9250,8392,8444,5757,9006,3733,8079,8760,3332,8312,9944,6821,9856,9745,7757,9598,8356,7597,9894,6523,3998,4726,4203,4233,8271,7749,9762,8104,6180,8851,8128,1914,9565,7055,3179,8999,8867,7148,6754,881,9069,7820,1910,9680,6245,9213,9281,9655,5354,9790,8852,9957,9851,6381,9623,9335,7749,6563,7137,8915,9860,9594,7691,8058,9704,7898,7371,8780,7750,6653,9493,9642,9966,5589,5747,7649,9040,8541,5013,3979,5747,7534};

        System.out.println(mettingRoom(s, e));
    }
}
