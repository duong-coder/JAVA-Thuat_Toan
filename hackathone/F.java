package hackathone;

import java.io.*;
import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class F {
    private static BufferedReader in;

    private static class Values {

        private int val1;
        private int val2;

        private Values(int v1, int v2) {
            this.val1 = v1;
            this.val2 = v2;
        }

        public void updateValues(int v1, int v2) {
            this.val1 = v1;
            this.val2 = v2;
        }
    }//end of class values

    public double score(String text1, String text2) {
        String[] text1Words = text1.split(" ");
        String[] text2Words = text2.split(" ");
        Map<String, Values> wordFreqVector = new HashMap<>();
        List<String> distinctWords = new ArrayList<>();

        for (String text : text1Words) {
            String word = text.trim();
            if (!word.isEmpty()) {
                if (wordFreqVector.containsKey(word)) {
                    Values vals1 = wordFreqVector.get(word);
                    int freq1 = vals1.val1 + 1;
                    int freq2 = vals1.val2;
                    vals1.updateValues(freq1, freq2);
                    wordFreqVector.put(word, vals1);
                } else {
                    Values vals1 = new Values(1, 0);
                    wordFreqVector.put(word, vals1);
                    distinctWords.add(word);
                }
            }
        }

        for (String text : text2Words) {
            String word = text.trim();
            if (!word.isEmpty()) {
                if (wordFreqVector.containsKey(word)) {
                    Values vals1 = wordFreqVector.get(word);
                    int freq1 = vals1.val1;
                    int freq2 = vals1.val2 + 1;
                    vals1.updateValues(freq1, freq2);
                    wordFreqVector.put(word, vals1);
                } else {
                    Values vals1 = new Values(0, 1);
                    wordFreqVector.put(word, vals1);
                    distinctWords.add(word);
                }
            }
        }

        double vectAB = 0.00;
        double vectA = 0.00;
        double vectB = 0.00;
        for (int i = 0; i < distinctWords.size(); i++) {
            Values vals12 = wordFreqVector.get(distinctWords.get(i));
            double freq1 = vals12.val1;
            double freq2 = vals12.val2;
            vectAB = vectAB + freq1 * freq2;
            vectA = vectA + freq1 * freq1;
            vectB = vectB + freq2 * freq2;
        }

        return ((vectAB) / (Math.sqrt(vectA) * Math.sqrt(vectB)));
    }

    public static void main(String[] args) throws IOException {

        in = new BufferedReader(new InputStreamReader(System.in));
        F cs = new F();

        String text1 =in.readLine();
        int length = Integer.parseInt(in.readLine());
        List<String> list = new ArrayList<>();
        List<Double> doubles = new ArrayList<>();
        for(int i = 0; i<length;i++){
            list.add(in.readLine());

            double score = cs.score(text1, list.get(i));
            doubles.add(score);
        }
        for (int i = 0; i<length;i++){
            for(int j=i+1;j<length;j++){
                double a = doubles.get(i);
                double b = doubles.get(j);
                if(a<b){
                    double temp = a;
                    doubles.set(i,b);
                    doubles.set(j,temp);

                    String strTemp = list.get(i);
                    list.set(i,list.get(j));
                    list.set(j,strTemp);
                }

            }
        }

        for(int i=0;i<length;i++){
            double num = doubles.get(i);
            BigDecimal bd = new BigDecimal(num);
            bd = bd.setScale(2, BigDecimal.ROUND_DOWN);
            num = bd.doubleValue();
            System.out.print(list.get(i) + " (" + num + ")");
            if(i<length - 1){
                System.out.println();
            }
        }
    }
}
