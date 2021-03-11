package codelearn;

public class NhiPhan {
    public static void main(String[] args) {
        String s = "100212";
        String[] nhiPhan = s.split("");
        if(nhiPhan[0].equals("0")){
            System.out.println("false");
        }
        for(int i = 1; i<nhiPhan.length; i++){
            if(nhiPhan[i].equals("0") || nhiPhan[i].equals("1")){
                System.out.println("true");
                continue;
            }else{
                System.out.println("false");
                return;
            }
        }
    }
}
