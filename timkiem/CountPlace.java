package timkiem;

public class CountPlace {
    public static void main(String[] args) {
        int[] a = {1,5,6,10,14,20};
        int k = 2;

        int length = a.length;
        int tram = -1;
        int startWifi = -1;
        int endWifi = 0;
        int result = 0;
        int i = 0;
        startWifi = a[i];
        while (true){
            tram = startWifi + k;
            endWifi = tram + k;
            if( (i+1) < length && a[i+1] < tram) {
                i += 1;
            }else if((i+1) < length && a[i+1] > tram){
                result += 1;
                startWifi = a[i];
                if((i-1) >= 0 && startWifi - k == a[i-1]){
                    result -= 1;
                }
                i += 1;
            }else if ((i+1) < length && a[i+1] == tram){
                result += 1;
                for (int j = 2; j < length; j++){
                    if((i+j) < length && a[i+j] < endWifi){
                        continue;
                    }else if((i+j) < length && a[i+j] > endWifi){
                        i = i + j;
                        break;
                    }else if((i+j) < length && a[i+j] == endWifi){
                        i = i + j + 1;
                        break;
                    }else {
                        if(i < length - 1){
                            i += 1;
                        }
                        break;
                    }
                }
                    startWifi = a[i];
            }else{
                break;
            }
            if(i >= length - 1){
                break;
            }
        }
        System.out.println(result);
    }
}
