import java.util.Scanner;
public class SortXau {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        String s = "aasdsaasdkfjloiwirweiuew435ADS";
        String []s1 = new String[s.length()];
        for(int i = 0 ; i < s.length() - 1; i++){
            s1[i] = s.substring(i);
             int f = s1[i].compareTo(s1[i+1]);
            if(f < 0){
                for(int i1 = 0; i1 < s.length(); i1++){
                    for(int j = i1 + 1; j < s.length(); j++){
                        String t = s1[i];
                        s1[i] = s1[i+1];
                        s1[i+1] = t;
                    }
                }
                
                }
            for(int i2 = 0 ; i2 < s.length(); i2++){
                       System.out.println(s);
            }
        }
    }
}
